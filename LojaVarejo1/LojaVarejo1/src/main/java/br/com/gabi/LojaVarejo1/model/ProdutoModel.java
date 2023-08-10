package br.com.gabi.LojaVarejo1.model;

import br.com.gabi.LojaVarejo1.domain.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nome;
    private double preco;

    public ProdutoModel(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoModel() {

    }

    public static void addAtribute(String produtos, List<Produto> produtos1) {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
