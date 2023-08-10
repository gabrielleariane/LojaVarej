package br.com.gabi.LojaVarejo1.dto;
import br.com.gabi.LojaVarejo1.model.ProdutoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProdutoDTO {
    private UUID id;
    private LocalDate leaseDate;
    private LocalDate returnDate;
    private ProdutoModel clientModel;
    private float cost;
}