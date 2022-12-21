package org.tppe.tp1;

import org.tppe.tp1.exceptions.*;
import org.tppe.tp1.usecases.IRPF;

import javax.swing.JOptionPane;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class App
{
    private static final CalculadoraController calcIRPF = new CalculadoraController();
    private final static int EXIT_APP = 0;
    private final static int IMPOSTO_NAS_FAIXAS = 7;
    public final static int CADASTRO_RENDIMENTO = 1;
    public final static int CADASTRO_PREVIDENCIA = 2;
    public final static int CADASTRO_DEPENDENTE = 3;
    public final static int CADASTRO_PENSAO = 4;
    public final static int CADASTRO_OUTRAS_DEDUCOES = 5;
    public final static int RESULTADO_TOTAL = 6;

    public static Set<Integer> getOperationSet() {
        return Set.of(CADASTRO_DEPENDENTE, CADASTRO_RENDIMENTO, CADASTRO_PENSAO,
                CADASTRO_PREVIDENCIA, CADASTRO_OUTRAS_DEDUCOES, RESULTADO_TOTAL,
                IMPOSTO_NAS_FAIXAS);
    }

    public static void menu(int option) {
        switch (option) {
            case CADASTRO_RENDIMENTO -> cadastrarRendimento();
            case CADASTRO_DEPENDENTE -> cadastrarDependente();
            case CADASTRO_PENSAO -> cadastrarPensao();
            case CADASTRO_PREVIDENCIA -> cadastrarPrevidencia();
            case CADASTRO_OUTRAS_DEDUCOES -> cadastrarDeducao();
            case RESULTADO_TOTAL -> printTotal();
            case IMPOSTO_NAS_FAIXAS -> showFaixasAliquotas();
            // To-do
            /**
             * showDependentes
             * showDeducoes
             * showRendimentos
             */
        }
    }

    public static String inputDialogString(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public static double inputDialogValue(String message) {
        try {
            return Double.parseDouble(inputDialogString(message));
        } catch (NumberFormatException ex) {
            return -1.0;
        }
    }

    public static void cadastrarDependente() {
        String nome = inputDialogString("Nome do dependente");
        try {
            calcIRPF.addDependentes(nome);
        } catch (NomeEmBrancoException ex) {
           nonValidWarning("Insira um nome válido para o dependente");
        }
    }

    public static void cadastrarPensao() {
        double value = inputDialogValue("Valor da pensão");
        try {
           calcIRPF.addPensao(value);
        } catch (ValorPensaoInvalidoException ex) {
            nonValidWarning("Insira valor válido para a pensão.");
        }
    }

    public static void cadastrarPrevidencia() {
        double value = inputDialogValue("Valor da previdência");
        String desc = inputDialogString("Descrição da previdência");
        try {
           calcIRPF.addPrevidencia(desc, value);
        } catch(ValorContribuicaoInvalidoException | DescricaoEmBrancoException ex) {
            nonValidWarning("A contribuição deve ter descrição e um valor > 0");
        }
    }

    public static void cadastrarDeducao() {
        double value = inputDialogValue("Valor da dedução");
        String desc = inputDialogString("Descrição da dedução");
        try {
            calcIRPF.addDeducao(desc, value);
        } catch(ValorDeducaoInvalidoException | DescricaoEmBrancoException ex) {
            nonValidWarning("A dedução deve ter descrição e um valor > 0");
        }
    }

    public static void cadastrarRendimento() {
        String desc = JOptionPane.showInputDialog("Descrição:");
        try {
            double val = Double.parseDouble(JOptionPane.showInputDialog("Valor:"));
            calcIRPF.addRendimento(desc, val);
        } catch(NumberFormatException ex) {
            nonValidWarning("Insira uma valor numérico");
        } catch(CadastroInvalidoException ex) {
            nonValidWarning("A descrição é obrigatória e um valor de rendimento > 0");
        }
    }

    public static void printTotal() {
        // To-do all results
        IRPF irpf = calcIRPF.getResults();
        JOptionPane.showMessageDialog(null,
                "Valor total a pagar: ".concat(String.format("%.2f",irpf.getTotalImposto()).concat("\n"))
                        .concat("Alíquota Efetiva: ").concat(String.format("%.2f", irpf.getAliquotaEfetiva()))
        );
    }

    public static void showFaixasAliquotas() {
        IRPF irpf = calcIRPF.getResults();
        Map<String, Double> faixas = irpf.getImpostoPorFaixa();
        String response = "Valores a pagar por faixa: \n\n";
        response += faixas.keySet().stream()
                .map(key -> key.toLowerCase()
                        .concat("  ")
                        .concat(String.format(
                                "%.2f",
                                faixas.get(key)))
                        .concat("\n"))
                .collect(Collectors.joining("\n"));

       JOptionPane.showMessageDialog(null, response);
    }

    public static String printOptions() {
        return """
                Selecione uma das opções para calcular:
                Pressione:

                   0 - Sair da aplicação
                   1 - Cadastrar rendimentos
                   2 - Cadastrar Contribuição Oficial
                   3 - Cadastrar Dependentes
                   4 - Cadastrar Pensão
                   5 - Cadastrar Outras Deduções
                   6 - Calcular valor de imposto total
                   7 - Verificar imposto nas faixas
                """;
    }

    public static void nonValidWarning(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main( String[] args )
    {
        Set<Integer> valids = getOperationSet();
        try {
            int option = Integer.parseInt(JOptionPane.showInputDialog(printOptions()));
            while(option != EXIT_APP) {
                if (! valids.contains(option)) nonValidWarning("Opção Inválida");
                menu(option);
                option = Integer.parseInt(JOptionPane.showInputDialog(printOptions()));
            }
        } catch(NumberFormatException ex) {
            nonValidWarning("Insira um dos números informados (0 - " + getOperationSet().size() + ")");
            main(null);
        }
    }
}
