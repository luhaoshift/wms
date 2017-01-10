package com.sf.integration.warehouse.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-08-26T11:17:07.437+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "OutsideToLscmServiceService", 
                  wsdlLocation = "http://219.134.187.154:9154/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl",
                  targetNamespace = "http://service.warehouse.integration.sf.com/") 
public class OutsideToLscmServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServiceService");
    public final static QName OutsideToLscmServicePort = new QName("http://service.warehouse.integration.sf.com/", "OutsideToLscmServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://219.134.187.154:9154/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OutsideToLscmServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://219.134.187.154:9154/bsp-wms/ws/OutsideToLscmServiceImpl?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OutsideToLscmServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OutsideToLscmServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OutsideToLscmServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OutsideToLscmServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OutsideToLscmServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public OutsideToLscmServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns IOutsideToLscmService
     */
    @WebEndpoint(name = "OutsideToLscmServicePort")
    public IOutsideToLscmService getOutsideToLscmServicePort() {
        return super.getPort(OutsideToLscmServicePort, IOutsideToLscmService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOutsideToLscmService
     */
    @WebEndpoint(name = "OutsideToLscmServicePort")
    public IOutsideToLscmService getOutsideToLscmServicePort(WebServiceFeature... features) {
        return super.getPort(OutsideToLscmServicePort, IOutsideToLscmService.class, features);
    }

}