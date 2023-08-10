package br.com.gabi.LojaVarejo1.domain;

import br.com.gabi.LojaVarejo1.model.ProdutoModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")

public class Produto {

    @Id
    private long id;
    private String nome;
    private double preco;

    public Produto(long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {

    }

    public Long getId(){
        return id;
    }

    public String getNome() {
        return nome;
    }



}