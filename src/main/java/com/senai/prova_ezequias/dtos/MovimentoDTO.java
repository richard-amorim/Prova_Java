package com.senai.prova_ezequias.dtos;

import com.senai.prova_ezequias.models.Movimento;

public class MovimentoDTO {

    private Long id;
    private String dataMovimento;
    private String valor;
    private String Classificacao;
    private String observacao;

    public MovimentoDTO(Long id, String dataMovimento, String valor, String Classificacao, String observacao) {
        this.id = id;
        this.dataMovimento = dataMovimento;
        this.valor = valor;
        this.Classificacao = Classificacao;
        this.observacao = observacao;
    }

    public MovimentoDTO() {
    }

    public MovimentoDTO(Movimento movimento) {
        this.id = movimento.getId();
        this.dataMovimento = movimento.getDataMovimento();
        this.valor = movimento.getValor();
        this.Classificacao = movimento.getClassificacao();
        this.observacao = movimento.getObservacao();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataMovimento() {
        return dataMovimento;
    }

    public void setDataMovimento(String dataMovimento) {
        this.dataMovimento = dataMovimento;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String Classificacao) {
        this.Classificacao = Classificacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
