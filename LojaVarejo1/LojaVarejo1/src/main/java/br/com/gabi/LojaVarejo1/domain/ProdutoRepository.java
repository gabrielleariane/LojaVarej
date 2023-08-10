package br.com.gabi.LojaVarejo1.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface ProdutoRepository
        extends JpaRepository <Produto, UUID> {
}

