package entity;
import lombok.*;
import javax.persistence.*;
@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Filial {
    @EqualsAndHashCode.Include
    @Id

    private String nome;
    private String endereco;
    private String telefone;

    @Override
    public String toString() {
        return "Filial{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
