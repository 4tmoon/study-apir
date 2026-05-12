package br.com.fiap.study_apir.dto;

import br.com.fiap.study_apir.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ProdutoMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public Produto toModel(ProdutoRequest dto){
        return modelMapper.map(dto, Produto.class);
    }
}
