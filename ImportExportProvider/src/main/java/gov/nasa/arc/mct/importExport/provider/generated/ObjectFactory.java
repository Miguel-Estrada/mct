//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.23 at 03:24:45 PM CDT 
//


package gov.nasa.arc.mct.importExport.provider.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.nasa.arc.mct.importExport.provider.generated package. 
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

    private final static QName _Components_QNAME = new QName("http://gov.nasa.arc.mct", "components");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.nasa.arc.mct.importExport.provider.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssociatedComponentType }
     * 
     */
    public AssociatedComponentType createAssociatedComponentType() {
        return new AssociatedComponentType();
    }

    /**
     * Create an instance of {@link ComponentType }
     * 
     */
    public ComponentType createComponentType() {
        return new ComponentType();
    }

    /**
     * Create an instance of {@link ComponentRefType }
     * 
     */
    public ComponentRefType createComponentRefType() {
        return new ComponentRefType();
    }

    /**
     * Create an instance of {@link NameValueType }
     * 
     */
    public NameValueType createNameValueType() {
        return new NameValueType();
    }

    /**
     * Create an instance of {@link ComponentListType }
     * 
     */
    public ComponentListType createComponentListType() {
        return new ComponentListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gov.nasa.arc.mct", name = "components")
    public JAXBElement<ComponentListType> createComponents(ComponentListType value) {
        return new JAXBElement<ComponentListType>(_Components_QNAME, ComponentListType.class, null, value);
    }

}