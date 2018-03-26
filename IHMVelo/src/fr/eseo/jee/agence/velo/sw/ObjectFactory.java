
package fr.eseo.jee.agence.velo.sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.eseo.jee.agence.velo.sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnnulerVelo_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "annulerVelo");
    private final static QName _AnnulerVeloResponse_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "annulerVeloResponse");
    private final static QName _PayerVelo_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "payerVelo");
    private final static QName _PayerVeloResponse_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "payerVeloResponse");
    private final static QName _ReserverVelo_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "reserverVelo");
    private final static QName _ReserverVeloResponse_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "reserverVeloResponse");
    private final static QName _TrouverVelo_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "trouverVelo");
    private final static QName _TrouverVeloResponse_QNAME = new QName("http://sw.velo.agence.jee.eseo.fr/", "trouverVeloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.eseo.jee.agence.velo.sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AnnulerVelo }
     * 
     */
    public AnnulerVelo createAnnulerVelo() {
        return new AnnulerVelo();
    }

    /**
     * Create an instance of {@link AnnulerVeloResponse }
     * 
     */
    public AnnulerVeloResponse createAnnulerVeloResponse() {
        return new AnnulerVeloResponse();
    }

    /**
     * Create an instance of {@link PayerVelo }
     * 
     */
    public PayerVelo createPayerVelo() {
        return new PayerVelo();
    }

    /**
     * Create an instance of {@link PayerVeloResponse }
     * 
     */
    public PayerVeloResponse createPayerVeloResponse() {
        return new PayerVeloResponse();
    }

    /**
     * Create an instance of {@link ReserverVelo }
     * 
     */
    public ReserverVelo createReserverVelo() {
        return new ReserverVelo();
    }

    /**
     * Create an instance of {@link ReserverVeloResponse }
     * 
     */
    public ReserverVeloResponse createReserverVeloResponse() {
        return new ReserverVeloResponse();
    }

    /**
     * Create an instance of {@link TrouverVelo }
     * 
     */
    public TrouverVelo createTrouverVelo() {
        return new TrouverVelo();
    }

    /**
     * Create an instance of {@link TrouverVeloResponse }
     * 
     */
    public TrouverVeloResponse createTrouverVeloResponse() {
        return new TrouverVeloResponse();
    }

    /**
     * Create an instance of {@link ReservationVelo }
     * 
     */
    public ReservationVelo createReservationVelo() {
        return new ReservationVelo();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Velo }
     * 
     */
    public Velo createVelo() {
        return new Velo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "annulerVelo")
    public JAXBElement<AnnulerVelo> createAnnulerVelo(AnnulerVelo value) {
        return new JAXBElement<AnnulerVelo>(_AnnulerVelo_QNAME, AnnulerVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "annulerVeloResponse")
    public JAXBElement<AnnulerVeloResponse> createAnnulerVeloResponse(AnnulerVeloResponse value) {
        return new JAXBElement<AnnulerVeloResponse>(_AnnulerVeloResponse_QNAME, AnnulerVeloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "payerVelo")
    public JAXBElement<PayerVelo> createPayerVelo(PayerVelo value) {
        return new JAXBElement<PayerVelo>(_PayerVelo_QNAME, PayerVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "payerVeloResponse")
    public JAXBElement<PayerVeloResponse> createPayerVeloResponse(PayerVeloResponse value) {
        return new JAXBElement<PayerVeloResponse>(_PayerVeloResponse_QNAME, PayerVeloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "reserverVelo")
    public JAXBElement<ReserverVelo> createReserverVelo(ReserverVelo value) {
        return new JAXBElement<ReserverVelo>(_ReserverVelo_QNAME, ReserverVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserverVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "reserverVeloResponse")
    public JAXBElement<ReserverVeloResponse> createReserverVeloResponse(ReserverVeloResponse value) {
        return new JAXBElement<ReserverVeloResponse>(_ReserverVeloResponse_QNAME, ReserverVeloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverVelo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "trouverVelo")
    public JAXBElement<TrouverVelo> createTrouverVelo(TrouverVelo value) {
        return new JAXBElement<TrouverVelo>(_TrouverVelo_QNAME, TrouverVelo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrouverVeloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.velo.agence.jee.eseo.fr/", name = "trouverVeloResponse")
    public JAXBElement<TrouverVeloResponse> createTrouverVeloResponse(TrouverVeloResponse value) {
        return new JAXBElement<TrouverVeloResponse>(_TrouverVeloResponse_QNAME, TrouverVeloResponse.class, null, value);
    }

}
