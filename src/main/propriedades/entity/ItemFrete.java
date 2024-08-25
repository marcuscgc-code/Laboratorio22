package entity;
import lombok.*;

import javax.persistence.*;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class ItemFrete {
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private Float peso;

    @ManyToOne
    @JoinColumn(name = "freteId")
    private Frete frete;

    @Override
    public String toString() {
        return "ItemFrete{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", frete=" + frete +
                '}';
    }
}
