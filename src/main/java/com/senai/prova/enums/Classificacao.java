package com.senai.prova.enums;

public enum Classificacao {
    SAIDA("Saída"),
    ENTRADA("Entrada"),
    OBSERVACAOO("Observação");

    private final String tipo;


    Classificacao(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
