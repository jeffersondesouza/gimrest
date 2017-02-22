/**
 * LesmailService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.emailWS.webservice;

public interface LesmailService extends javax.xml.rpc.Service {
    public java.lang.String getLesmailPortAddress();

    public br.com.emailWS.webservice.Lesmail getLesmailPort() throws javax.xml.rpc.ServiceException;

    public br.com.emailWS.webservice.Lesmail getLesmailPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
