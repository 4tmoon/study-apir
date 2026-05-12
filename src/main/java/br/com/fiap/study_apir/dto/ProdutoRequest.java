package br.com.fiap.study_apir.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProdutoRequest {
    private String nome;
    private BigDecimal valor;

}
