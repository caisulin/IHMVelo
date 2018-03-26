
package fr.eseo.jee.agence.velo.sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour velo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="velo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="categorie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeVelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prixLocation" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "velo", propOrder = {
    "categorie",
    "codeVelo",
    "prixLocation",
    "ville"
})
public class Velo {

    protected String categorie;
    protected int codeVelo;
    protected double prixLocation;
    protected String ville;

    /**
     * Obtient la valeur de la propriété categorie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * Définit la valeur de la propriété categorie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategorie(String value) {
        this.categorie = value;
    }

    /**
     * Obtient la valeur de la propriété codeVelo.
     * 
     */
    public int getCodeVelo() {
        return codeVelo;
    }

    /**
     * Définit la valeur de la propriété codeVelo.
     * 
     */
    public void setCodeVelo(int value) {
        this.codeVelo = value;
    }

    /**
     * Obtient la valeur de la propriété prixLocation.
     * 
     */
    public double getPrixLocation() {
        return prixLocation;
    }

    /**
     * Définit la valeur de la propriété prixLocation.
     * 
     */
    public void setPrixLocation(double value) {
        this.prixLocation = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
