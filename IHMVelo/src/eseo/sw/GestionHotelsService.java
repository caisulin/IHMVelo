package eseo.sw;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-04-04T14:49:15.447+02:00
 * Generated source version: 3.2.1
 * 
 */
@WebServiceClient(name = "GestionHotelsService", 
                  wsdlLocation = "http://192.168.4.78:8085/services/GestionHotelsPort?wsdl",
                  targetNamespace = "http://sw.eseo/") 
public class GestionHotelsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://sw.eseo/", "GestionHotelsService");
    public final static QName GestionHotelsPort = new QName("http://sw.eseo/", "GestionHotelsPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.4.78:8085/services/GestionHotelsPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GestionHotelsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.4.78:8085/services/GestionHotelsPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GestionHotelsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GestionHotelsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GestionHotelsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GestionHotelsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GestionHotelsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GestionHotelsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GestionHotelsSEI
     */
    @WebEndpoint(name = "GestionHotelsPort")
    public GestionHotelsSEI getGestionHotelsPort() {
        return super.getPort(GestionHotelsPort, GestionHotelsSEI.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GestionHotelsSEI
     */
    @WebEndpoint(name = "GestionHotelsPort")
    public GestionHotelsSEI getGestionHotelsPort(WebServiceFeature... features) {
        return super.getPort(GestionHotelsPort, GestionHotelsSEI.class, features);
    }

}
