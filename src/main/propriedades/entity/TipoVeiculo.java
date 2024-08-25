package entity;
import lombok.*;
import javax.persistence.*;

@Getter @Setter @Builder // gera construtores mais simples
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class TipoVeiculo {
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private Float pesoMaximo;

    @Override
    public String toString() {
        return "TipoVeiculo{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", pesoMaximo=" + pesoMaximo +
                '}';
    }
}

