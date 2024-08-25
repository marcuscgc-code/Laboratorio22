package entity;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity

//INCOMPLETO
public class Frete{
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private Integer numeroNotaFiscal;

    private BigDecimal valorKmRodado;

    @ManyToOne
    @JoinColumn(name = "tipoVeiculoId")
    private TipoVeiculo tipoVeiculo;

    @ManyToOne
    @JoinColumn(name = "categoriaFreteId")
    private CategoriaFrete categoriaFrete;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cidadeOrigemUf", referencedColumnName = "uf"),
            @JoinColumn(name = "cidadeOrigemNome", referencedColumnName = "nome")
    })
    private Cidade cidadeOrigem;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cidadeDestinoUf", referencedColumnName = "uf"),
            @JoinColumn(name = "cidadeDestinoNome", referencedColumnName = "nome")
    })
    private Cidade cidadeDestino;

    @Override
    public String toString() {
        return "Frete{" +
                "codigo=" + codigo +
                ", numeroNotaFiscal=" + numeroNotaFiscal +
                ", valorKmRodado=" + valorKmRodado +
                ", tipoVeiculo=" + tipoVeiculo +
                ", categoriaFrete=" + categoriaFrete +
                ", cidadeOrigem=" + cidadeOrigem +
                ", cidadeDestino=" + cidadeDestino +
                '}';
    }
}
