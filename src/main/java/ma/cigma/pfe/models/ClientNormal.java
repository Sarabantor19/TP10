package ma.cigma.pfe.models;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
//@PrimaryKeyJoinColumn(name="normal_id")
//@DiscriminatorValue("normal")
@Entity
public class ClientNormal extends Client {

    private int importanceLevel;


    public ClientNormal(String name, int importanceLevel) {
        super(name);
        this.importanceLevel = importanceLevel;
    }


}
