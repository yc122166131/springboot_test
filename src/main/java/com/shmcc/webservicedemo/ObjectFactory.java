
package com.shmcc.webservicedemo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.shmcc.webservicedemo package. 
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

    private final static QName _Process_QNAME = new QName("http://webserviceDemo.shmcc.com", "process");
    private final static QName _ProcessResponse_QNAME = new QName("http://webserviceDemo.shmcc.com", "processResponse");
    private final static QName _UnsupportedEncodingException_QNAME = new QName("http://webserviceDemo.shmcc.com", "UnsupportedEncodingException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.shmcc.webservicedemo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link UnsupportedEncodingException }
     * 
     */
    public UnsupportedEncodingException createUnsupportedEncodingException() {
        return new UnsupportedEncodingException();
    }

    /**
     * Create an instance of {@link UserInputItem }
     * 
     */
    public UserInputItem createUserInputItem() {
        return new UserInputItem();
    }

    /**
     * Create an instance of {@link UserOutputDomain }
     * 
     */
    public UserOutputDomain createUserOutputDomain() {
        return new UserOutputDomain();
    }

    /**
     * Create an instance of {@link UserOutItem }
     * 
     */
    public UserOutItem createUserOutItem() {
        return new UserOutItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Process }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceDemo.shmcc.com", name = "process")
    public JAXBElement<Process> createProcess(Process value) {
        return new JAXBElement<Process>(_Process_QNAME, Process.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceDemo.shmcc.com", name = "processResponse")
    public JAXBElement<ProcessResponse> createProcessResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ProcessResponse_QNAME, ProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedEncodingException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceDemo.shmcc.com", name = "UnsupportedEncodingException")
    public JAXBElement<UnsupportedEncodingException> createUnsupportedEncodingException(UnsupportedEncodingException value) {
        return new JAXBElement<UnsupportedEncodingException>(_UnsupportedEncodingException_QNAME, UnsupportedEncodingException.class, null, value);
    }

}
