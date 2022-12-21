package org.tppe.tp1;

import org.tppe.tp1.exceptions.*;
import org.tppe.tp1.usecases.IRPF;

import javax.swing.JOptionPane;
import java.util.Set;

public class App
{
    private static final CalculadoraController calcIRPF = new CalculadoraController();
    private final static int EXIT_APP = 0;

    public static void menu(int option) {
        switch (option) {
            case CalculadoraController.CADASTRO_RENDIMENTO -> cadastrarRendimento();
            case CalculadoraController.CADASTRO_DEPENDENTE -> cadastrarDependente();
            case CalculadoraController.CADASTRO_PENSAO -> cadastrarPensao();
            case CalculadoraController.CADASTRO_PREVIDENCIA -> cadastrarPrevidencia();
            case CalculadoraController.CADASTRO_OUTRAS_DEDUCOES -> cadastrarDeducao();
            case CalculadoraController.RESULTADO_TOTAL -> printTotal();
            // To-do
            /**
             * showDependentes
             * showDeducoes
             * showRendimentos
             * showFaixasAliquotas (Com aliquota total)
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
            return -1;
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
        String desc = inputDialogString("Descrição da contribuição");
        try {
           calcIRPF.addPrevidencia(desc, value);
        } catch(ValorContribuicaoInvalidoException | DescricaoEmBrancoException ex) {
            nonValidWarning("A contribuição deve ter descrição e um valor > 0");
        }
    }

    public static void cadastrarDeducao() {
        double value = inputDialogValue("Valor da previdência");
        String desc = inputDialogString("Descrição da contribuição");
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
                String.format("%.2f",irpf.getTotalImposto()).concat("\n")
                        .concat(String.format("%.2f", irpf.getAliquotaEfetiva()))
        );
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
                """;
    }

    public static void nonValidWarning(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main( String[] args )
    {
        Set<Integer> valids = CalculadoraController.getOperationSet();
        try {
            int option = Integer.parseInt(JOptionPane.showInputDialog(printOptions()));
            while(option != EXIT_APP) {
                if (! valids.contains(option)) nonValidWarning("Opção Inválida");
                menu(option);
                option = Integer.parseInt(JOptionPane.showInputDialog(printOptions()));
            }
        } catch(NumberFormatException ex) {
            nonValidWarning("Insira um dos números informados (0 - 6)");
            main(null);
        }
    }
}
