package entity;

import  lombok.*;
import javax.persistence.*;
import java.time.LocalDate;

@Getter @Setter @Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Dependente {
    @EqualsAndHashCode.Include
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "matriculaFuncionario")
    private Funcionario funcionario;

    @Override
    public String toString() {
        return "Dependente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", funcionario=" + funcionario +
                '}';
    }
}
