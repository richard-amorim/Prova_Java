package com.senai.prova_ezequias.enums;

public enum ClassificacaoMovimento {
    ENTRADA("Entrada"),
    SAIDA("Saída");

    private final String descricao;

    ClassificacaoMovimento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
