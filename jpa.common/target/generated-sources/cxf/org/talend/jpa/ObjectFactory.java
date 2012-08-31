
package org.talend.jpa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.talend.jpa package. 
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

    private final static QName _PersistRequest_QNAME = new QName("http://www.talend.org/jpa", "persistRequest");
    private final static QName _DeleteRequest_QNAME = new QName("http://www.talend.org/jpa", "deleteRequest");
    private final static QName _DeleteResponse_QNAME = new QName("http://www.talend.org/jpa", "deleteResponse");
    private final static QName _PersistResponse_QNAME = new QName("http://www.talend.org/jpa", "persistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.talend.jpa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.talend.org/jpa", name = "persistRequest")
    public JAXBElement<PersonType> createPersistRequest(PersonType value) {
        return new JAXBElement<PersonType>(_PersistRequest_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.talend.org/jpa", name = "deleteRequest")
    public JAXBElement<IdType> createDeleteRequest(IdType value) {
        return new JAXBElement<IdType>(_DeleteRequest_QNAME, IdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.talend.org/jpa", name = "deleteResponse")
    public JAXBElement<String> createDeleteResponse(String value) {
        return new JAXBElement<String>(_DeleteResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.talend.org/jpa", name = "persistResponse")
    public JAXBElement<String> createPersistResponse(String value) {
        return new JAXBElement<String>(_PersistResponse_QNAME, String.class, null, value);
    }

}
