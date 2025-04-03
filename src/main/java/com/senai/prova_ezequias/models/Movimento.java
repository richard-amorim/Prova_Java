package com.senai.prova_ezequias.models;

import jakarta.persistence.*;

@Entity
@Table(name = "movimento")
public class Movimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String dataMovimento;
    private String valor;
    private String Classificacao;
    private String observacao;

    public Movimento(Long id, String dataMovimento, String valor, String Classificacao, String observacao) {
        this.id = id;
        this.dataMovimento = dataMovimento;
        this.valor = valor;
        this.Classificacao = Classificacao;
        this.observacao = observacao;
    }

    public Movimento() {
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
