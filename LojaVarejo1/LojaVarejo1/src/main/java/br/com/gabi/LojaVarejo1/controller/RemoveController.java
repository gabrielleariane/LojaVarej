package br.com.gabi.LojaVarejo1.controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.view.RedirectView;
import br.com.gabi.LojaVarejo1.domain.ProdutoRepository;

import java.util.UUID;

@Controller
@RequestMapping("/produtos")
public class RemoveController {

    private ProdutoRepository produtoRepository;

    public RemoveController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @DeleteMapping("/{id}")
    public RedirectView removeProduto(@PathVariable UUID id) {
        produtoRepository.deleteById(id);
        System.out.println("PRODUTO EXCLUÍDO!");
        return new RedirectView("/produtos");
    }
}