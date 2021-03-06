package fr.eseo.jee.agence.hotel.sw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-04-04T14:49:15.435+02:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://sw.eseo/", name = "GestionHotelsSEI")
@XmlSeeAlso({ObjectFactory.class})
public interface GestionHotelsSEI {

    @WebMethod
    @RequestWrapper(localName = "payerChambre", targetNamespace = "http://sw.eseo/", className = "eseo.sw.PayerChambre")
    @ResponseWrapper(localName = "payerChambreResponse", targetNamespace = "http://sw.eseo/", className = "eseo.sw.PayerChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String payerChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "annulerChambre", targetNamespace = "http://sw.eseo/", className = "eseo.sw.AnnulerChambre")
    @ResponseWrapper(localName = "annulerChambreResponse", targetNamespace = "http://sw.eseo/", className = "eseo.sw.AnnulerChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public boolean annulerChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebMethod
    @RequestWrapper(localName = "reserverChambre", targetNamespace = "http://sw.eseo/", className = "eseo.sw.ReserverChambre")
    @ResponseWrapper(localName = "reserverChambreResponse", targetNamespace = "http://sw.eseo/", className = "eseo.sw.ReserverChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public int reserverChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.eseo.jee.agence.hotel.sw.ReservationChambre arg0
    );

    @WebMethod
    @RequestWrapper(localName = "trouverChambre", targetNamespace = "http://sw.eseo/", className = "eseo.sw.TrouverChambre")
    @ResponseWrapper(localName = "trouverChambreResponse", targetNamespace = "http://sw.eseo/", className = "eseo.sw.TrouverChambreResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<fr.eseo.jee.agence.hotel.sw.Chambre> trouverChambre(
        @WebParam(name = "arg0", targetNamespace = "")
        fr.eseo.jee.agence.hotel.sw.Chambre arg0
    );
}
