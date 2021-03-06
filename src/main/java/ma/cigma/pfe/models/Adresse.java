package ma.cigma.pfe.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private  String avenue;
    private  String ville;
    private String pays;

    @OneToOne()
    @JoinColumn(name = "client_id")
    private Client client;

    public Adresse() {
    }



    public Adresse(String avenue, String ville, String pays) {
        this.avenue = avenue;
        this.ville = ville;
        this.pays = pays;
    }
}
