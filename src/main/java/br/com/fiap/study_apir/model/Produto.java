package br.com.fiap.study_apir.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Produto {
    private Long id;
    private String nome;
    private BigDecimal valor;

    public Produto(long l, String uva, BigDecimal bigDecimal) {
    }
}