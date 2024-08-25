package entity;

import lombok.*;
import javax.persistence.*;
@Getter @Setter @Builder //construtor
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cidade {
    @EqualsAndHashCode.Include
    @Id

    private String uf;

    @EqualsAndHashCode.Include
    @Id
    private String nome;
    private String estado;

    @Override
    public String toString(){
        return  "cidade{" +
                "uf='" + uf +'\'' +
                ", nome='"+ nome + '\'' +
                ", estado='" + estado +  '\'' +
                '}';
    }
}
