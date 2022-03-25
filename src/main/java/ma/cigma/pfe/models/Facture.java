package ma.cigma.pfe.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date ;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name ="TFacture")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date date;

    @Column
    private Double amount;
   private  String description;
   @ManyToOne
   @JoinColumn(name="client_id")
   private Client client;

    @ManyToMany(cascade ={CascadeType.PERSIST})
    @JoinTable(name = "my_join_table_Facture_Produit",joinColumns = @JoinColumn(name = "Facture_fk",
            referencedColumnName = "id" ), inverseJoinColumns = @JoinColumn(name="Produit_fk",referencedColumnName="id"))
    private List<Produit> produits;

    public Facture()
    {}

    public Facture(Double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Facture(Date date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public Facture(long id, Date date, Double amount) {
        this.id = id;
        this.date = date;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
