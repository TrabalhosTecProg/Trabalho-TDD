package org.tppe.tp1.utils;

public class Limite {
    Boolean isValid;

    public Boolean isLimiteValido(Double valor) {
        return (valor > 0.0D && valor < Double.MAX_VALUE);
    }
}
