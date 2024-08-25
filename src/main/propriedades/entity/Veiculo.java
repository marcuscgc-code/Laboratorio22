package entity;
import lombok.*;

import javax.persistence.*;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Veiculo {
    @EqualsAndHashCode.Include
    @Id
    private String numeroPlaca;

    @ManyToOne
    @JoinColumn(name = "filialNome")
    private Filial filial;

    @ManyToOne
    @JoinColumn(name = "tipoVeiculoId")
    private TipoVeiculo tipoVeiculo;

    @Override
    public String toString() {
        return "Veiculo{" +
                "numeroPlaca='" + numeroPlaca + '\'' +
                ", filial=" + filial +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }
}
