package wse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.XMLField;

import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
// dis a jaxB je voudrais les mettre sur les champs et pas les getters
public class Compte {
    private int code;

    private double solde;
    @XmlTransient   //dis a JaxB qd tu converti cet objet en xml ignore cet attribut
    private Date dateCreation;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;

    }

    public Compte() {
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }
}
