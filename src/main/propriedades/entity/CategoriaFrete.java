package entity;
import lombok.*;
import javax.persistence.*;
 @Getter @Setter @Builder
 @NoArgsConstructor @AllArgsConstructor
 @EqualsAndHashCode(onlyExplicitlyIncluded = true)
 @Entity
public class CategoriaFrete {
    @EqualsAndHashCode.Include
    @Id

     private Integer id;
    private String nome;
    private String descricao;
    private float percentualAdicional;
    @Override
    public String toString(){
        return "CategoriaFrete{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", percentualAdicional=" + percentualAdicional +
                '}';
    }
}
