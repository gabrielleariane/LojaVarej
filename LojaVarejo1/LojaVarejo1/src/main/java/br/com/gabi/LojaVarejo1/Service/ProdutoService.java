package br.com.gabi.LojaVarejo1.Service;

import br.com.gabi.LojaVarejo1.domain.ProdutoRepository;
import br.com.gabi.LojaVarejo1.model.ProdutoModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel insert(ProdutoModel produtoModel) {
        return produtoModel;
    }

    public ProdutoModel update(ProdutoModel produtoModel) {
        return produtoModel;
    }
}




