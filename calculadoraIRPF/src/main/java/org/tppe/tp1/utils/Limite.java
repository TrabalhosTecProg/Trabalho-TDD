package org.tppe.tp1.utils;

public class Limite {
    Boolean isValid;
    Double MINIMO = 0.0D;

    public Boolean isLimiteValido(Double valor) {
        return (valor > MINIMO && valor < Double.MAX_VALUE);
    }
}
