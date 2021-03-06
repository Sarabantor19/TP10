package ma.cigma.pfe.models;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Produit {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
     private double price;
    @ManyToOne
    @JoinColumn(name = "facture_id")
    private Facture facture;

    public Produit() {
    }

    public Produit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Produit(String name, double price, Facture facture) {
        this.name = name;
        this.price = price;
        this.facture = facture;
    }
}
