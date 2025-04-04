package com.senai.prova.enums;

public enum Classificação {
    SAIDA("Saída"),
    ENTRADA("Entrada;");

    private final String tipo;


    Classificação(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
