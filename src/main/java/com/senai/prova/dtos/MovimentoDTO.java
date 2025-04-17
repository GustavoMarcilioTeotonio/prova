package com.senai.prova.dtos;

import com.senai.prova.enums.Classificacao;

import java.util.Date;

public class MovimentoDTO {
    private Long id;
    private Date data_movimento;
    private Double valor;
    private Classificacao classificacao;

    public MovimentoDTO () {

    }

    public MovimentoDTO(Long id, Date data_movimento, Double valor, Classificacao classificacao) {
        this.id = id;
        this.data_movimento = data_movimento;
        this.valor = valor;
        this.classificacao = classificacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData_movimento() {
        return data_movimento;
    }

    public void setData_movimento(Date data_movimento) {
        this.data_movimento = data_movimento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }
}
