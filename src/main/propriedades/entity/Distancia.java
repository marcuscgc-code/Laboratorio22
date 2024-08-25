package entity;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@IdClass(Distancia.DistanciaId.class)

//INCOMPLETO
public class Distancia {

    @EqualsAndHashCode.Include
    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cidadeOrigemUf", referencedColumnName = "uf"),
            @JoinColumn(name = "cidadeOrigemNome", referencedColumnName = "nome")
    })
    private Cidade cidadeOrigem;

    @EqualsAndHashCode.Include
    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "cidadeDestinoUf", referencedColumnName = "uf"),
            @JoinColumn(name = "cidadeDestinoNome", referencedColumnName = "nome")
    })
    private Cidade cidadeDestino;

    private Float distanciaKm;

    @Override
    public String toString() {
        return "Distancia{" +
                "cidadeOrigem=" + cidadeOrigem +
                ", cidadeDestino=" + cidadeDestino +
                ", distanciaKm=" + distanciaKm +
                '}';
    }

    @Data @NoArgsConstructor @AllArgsConstructor
    public static class DistanciaId implements Serializable {
        private String cidadeOrigemUf;
        private String cidadeOrigemNome;
        private String cidadeDestinoUf;
        private String cidadeDestinoNome;
    }


    
}
