package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Produto {
    @Id
    @Column(name = "id")
    private Long id;
    private String nome;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(Long id, BigDecimal valor, String nome) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }
}