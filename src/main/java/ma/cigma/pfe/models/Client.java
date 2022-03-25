package ma.cigma.pfe.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@ToString
@Table(name ="TClients")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="client_type")
//@DiscriminatorValue("client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(name ="CNAME")
    private String name;


    public Client(String ahmed) {
    }
    @OneToMany (cascade = {CascadeType.PERSIST}, mappedBy = "client")
    private List<Facture> factures;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
            name = "client_fk",
            referencedColumnName = "id"
    ),
            inverseJoinColumns = @JoinColumn(
                    name = "promotion_fk",
                    referencedColumnName = "id"
            ))
    private List<Promotion>promotions;

    @OneToOne(cascade ={CascadeType.PERSIST},mappedBy ="client")
    private  CarteFidelio carteFidelio;

    @OneToOne(cascade = {CascadeType.PERSIST},mappedBy = "client")
    private  Adresse adresse;

    public Client() {
    }

    public Client(long id, String name) {
        this.id = id;
        this.name = name;
    }


}
