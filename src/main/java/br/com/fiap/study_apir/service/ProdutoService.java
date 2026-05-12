package br.com.fiap.study_apir.service;

import br.com.fiap.study_apir.model.Produto;
import br.com.fiap.study_apir.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return repository.findById(id);
    }

    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
