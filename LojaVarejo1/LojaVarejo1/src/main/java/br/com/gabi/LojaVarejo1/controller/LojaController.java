package br.com.gabi.LojaVarejo1.controller;
import br.com.gabi.LojaVarejo1.domain.Produto;
import br.com.gabi.LojaVarejo1.Service.ProdutoService;
import br.com.gabi.LojaVarejo1.dto.ProdutoDTO;
import br.com.gabi.LojaVarejo1.domain.ProdutoRepository;
import br.com.gabi.LojaVarejo1.model.ProdutoModel;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/produtos")
public class LojaController {
    private final ProdutoRepository repository;
    private final ProdutoService produtoService;

    public LojaController(ProdutoRepository repository, ProdutoService produtoService) {
        this.repository = repository;
        this.produtoService = produtoService;
    }

    public static void main(String[] args) {
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable UUID id) {

        Optional<Produto> produtoOptional = repository.findById(id);
        return produtoOptional.orElse(null);
    }
    @GetMapping
    public List<Produto> findAll() {
        return repository.findAll();

    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO clientDTO){
        var clientModel = new ProdutoModel();
        BeanUtils.copyProperties(clientDTO,clientModel);
        clientModel = ProdutoService.insert(clientModel);
        BeanUtils.copyProperties(clientModel,clientDTO);
        return new ResponseEntity<>(clientDTO, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ProdutoDTO> insert(@RequestBody ProdutoDTO clientDTO){
        var clientModel = new ProdutoModel();
        BeanUtils.copyProperties(clientDTO,clientModel);
        clientModel = ProdutoService.update(clientModel);
        BeanUtils.copyProperties(clientModel,clientDTO);
        return new ResponseEntity<>(clientDTO, HttpStatus.CREATED);
    }

}

