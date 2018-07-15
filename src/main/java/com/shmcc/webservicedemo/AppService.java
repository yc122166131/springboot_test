package com.shmcc.webservicedemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.16
 * 2018-07-15T11:18:59.211+08:00
 * Generated source version: 3.1.16
 * 
 */
@WebService(targetNamespace = "http://webserviceDemo.shmcc.com", name = "AppService")
@XmlSeeAlso({ObjectFactory.class})
public interface AppService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "process", targetNamespace = "http://webserviceDemo.shmcc.com", className = "com.shmcc.webservicedemo.Process")
    @WebMethod
    @ResponseWrapper(localName = "processResponse", targetNamespace = "http://webserviceDemo.shmcc.com", className = "com.shmcc.webservicedemo.ProcessResponse")
    public com.shmcc.webservicedemo.UserOutputDomain process(
        @WebParam(name = "arg0", targetNamespace = "")
        com.shmcc.webservicedemo.UserInputItem arg0
    ) throws UnsupportedEncodingException_Exception;
}