
package ups.prueba;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ups.prueba package. 
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

    private final static QName _InsertarObra_QNAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "insertarObra");
    private final static QName _InsertarObraResponse_QNAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "insertarObraResponse");
    private final static QName _ObtenerObras_QNAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "obtenerObras");
    private final static QName _ObtenerObrasResponse_QNAME = new QName("http://services.EVAMendezBryanSRV.prueba.ups/", "obtenerObrasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ups.prueba
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertarObraResponse }
     * 
     */
    public InsertarObraResponse createInsertarObraResponse() {
        return new InsertarObraResponse();
    }

    /**
     * Create an instance of {@link InsertarObra }
     * 
     */
    public InsertarObra createInsertarObra() {
        return new InsertarObra();
    }

    /**
     * Create an instance of {@link ObtenerObras }
     * 
     */
    public ObtenerObras createObtenerObras() {
        return new ObtenerObras();
    }

    /**
     * Create an instance of {@link ObtenerObrasResponse }
     * 
     */
    public ObtenerObrasResponse createObtenerObrasResponse() {
        return new ObtenerObrasResponse();
    }

    /**
     * Create an instance of {@link Obra }
     * 
     */
    public Obra createObra() {
        return new Obra();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObra }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.EVAMendezBryanSRV.prueba.ups/", name = "insertarObra")
    public JAXBElement<InsertarObra> createInsertarObra(InsertarObra value) {
        return new JAXBElement<InsertarObra>(_InsertarObra_QNAME, InsertarObra.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarObraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.EVAMendezBryanSRV.prueba.ups/", name = "insertarObraResponse")
    public JAXBElement<InsertarObraResponse> createInsertarObraResponse(InsertarObraResponse value) {
        return new JAXBElement<InsertarObraResponse>(_InsertarObraResponse_QNAME, InsertarObraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerObras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.EVAMendezBryanSRV.prueba.ups/", name = "obtenerObras")
    public JAXBElement<ObtenerObras> createObtenerObras(ObtenerObras value) {
        return new JAXBElement<ObtenerObras>(_ObtenerObras_QNAME, ObtenerObras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerObrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.EVAMendezBryanSRV.prueba.ups/", name = "obtenerObrasResponse")
    public JAXBElement<ObtenerObrasResponse> createObtenerObrasResponse(ObtenerObrasResponse value) {
        return new JAXBElement<ObtenerObrasResponse>(_ObtenerObrasResponse_QNAME, ObtenerObrasResponse.class, null, value);
    }

}
