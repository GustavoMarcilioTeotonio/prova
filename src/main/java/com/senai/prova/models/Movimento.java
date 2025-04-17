package com.senai.prova.models;

import com.senai.prova.enums.Classificacao;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "movimentos")
public class Movimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data_movimento;
    private Double valor;
    private Classificacao classificacao;
    public Movimento () {

    }

    public Movimento(Long id, Date data_movimento, Double valor, Classificacao classificacao) {
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

    public void setClassificacao(Classificacao classificação) {
        this.classificacao = classificação;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movimento movimento = (Movimento) o;
        return Objects.equals(id, movimento.id) && Objects.equals(data_movimento, movimento.data_movimento) && Objects.equals(valor, movimento.valor) && classificacao == movimento.classificacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, data_movimento, valor, classificacao);
    }
}
