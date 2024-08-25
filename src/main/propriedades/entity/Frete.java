package entity;

import lombok.*;

import javax.persistence.*;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Frete implements EntidadeBase {

    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    private Integer numeroNotaFiscal;

    private Float valorKmRodado;

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
    public Integer getId() {
        return codigo;
    }
}
