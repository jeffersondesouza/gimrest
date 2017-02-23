/**
 * BlogServerWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.blogserver;

public interface BlogServerWSService extends javax.xml.rpc.Service {
    public java.lang.String getBlogServerWSPortAddress();

    public br.com.gim.rest.webservice.blogserver.BlogServerWS getBlogServerWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.gim.rest.webservice.blogserver.BlogServerWS getBlogServerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
