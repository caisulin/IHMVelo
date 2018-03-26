
package fr.eseo.jee.agence.velo.sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour reservationVelo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservationVelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeClient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codeVelo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateDebut" type="{http://sw.velo.agence.jee.eseo.fr/}date" minOccurs="0"/&gt;
 *         &lt;element name="dateFin" type="{http://sw.velo.agence.jee.eseo.fr/}date" minOccurs="0"/&gt;
 *         &lt;element name="paiementEffectue" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservationVelo", propOrder = {
    "codeClient",
    "codeReservation",
    "codeVelo",
    "dateDebut",
    "dateFin",
    "paiementEffectue"
})
public class ReservationVelo {

    protected int codeClient;
    protected int codeReservation;
    protected int codeVelo;
    protected Date dateDebut;
    protected Date dateFin;
    protected boolean paiementEffectue;

    /**
     * Obtient la valeur de la propriété codeClient.
     * 
     */
    public int getCodeClient() {
        return codeClient;
    }

    /**
     * Définit la valeur de la propriété codeClient.
     * 
     */
    public void setCodeClient(int value) {
        this.codeClient = value;
    }

    /**
     * Obtient la valeur de la propriété codeReservation.
     * 
     */
    public int getCodeReservation() {
        return codeReservation;
    }

    /**
     * Définit la valeur de la propriété codeReservation.
     * 
     */
    public void setCodeReservation(int value) {
        this.codeReservation = value;
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
     * Obtient la valeur de la propriété dateDebut.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateDebut() {
        return dateDebut;
    }

    /**
     * Définit la valeur de la propriété dateDebut.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateDebut(Date value) {
        this.dateDebut = value;
    }

    /**
     * Obtient la valeur de la propriété dateFin.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDateFin() {
        return dateFin;
    }

    /**
     * Définit la valeur de la propriété dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDateFin(Date value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propriété paiementEffectue.
     * 
     */
    public boolean isPaiementEffectue() {
        return paiementEffectue;
    }

    /**
     * Définit la valeur de la propriété paiementEffectue.
     * 
     */
    public void setPaiementEffectue(boolean value) {
        this.paiementEffectue = value;
    }

}
