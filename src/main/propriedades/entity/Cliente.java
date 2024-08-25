package entity;
import lombok.*;
import javax.persistence.*;


@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    private String cpf;

    private String contato;

    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name = "cpf")
    private PessoaFisica pessoaFisica;

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", contato='" + contato + '\'' +
                ", ativo=" + ativo +
                ", pessoaFisica=" + pessoaFisica +
                '}';
    }

}
