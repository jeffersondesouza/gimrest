/**
 * ArtigoServerWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.artigo;

public class ArtigoServerWSServiceLocator extends org.apache.axis.client.Service implements br.com.gim.rest.webservice.artigo.ArtigoServerWSService {

    public ArtigoServerWSServiceLocator() {
    }


    public ArtigoServerWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ArtigoServerWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ArtigoServerWSPort
    private java.lang.String ArtigoServerWSPort_address = "http://localhost:8080/gim-infra/ArtigoServerWS";

    public java.lang.String getArtigoServerWSPortAddress() {
        return ArtigoServerWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ArtigoServerWSPortWSDDServiceName = "ArtigoServerWSPort";

    public java.lang.String getArtigoServerWSPortWSDDServiceName() {
        return ArtigoServerWSPortWSDDServiceName;
    }

    public void setArtigoServerWSPortWSDDServiceName(java.lang.String name) {
        ArtigoServerWSPortWSDDServiceName = name;
    }

    public br.com.gim.rest.webservice.artigo.ArtigoServerWS getArtigoServerWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ArtigoServerWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getArtigoServerWSPort(endpoint);
    }

    public br.com.gim.rest.webservice.artigo.ArtigoServerWS getArtigoServerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.gim.rest.webservice.artigo.ArtigoServerWSServiceSoapBindingStub _stub = new br.com.gim.rest.webservice.artigo.ArtigoServerWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getArtigoServerWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setArtigoServerWSPortEndpointAddress(java.lang.String address) {
        ArtigoServerWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.gim.rest.webservice.artigo.ArtigoServerWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.gim.rest.webservice.artigo.ArtigoServerWSServiceSoapBindingStub _stub = new br.com.gim.rest.webservice.artigo.ArtigoServerWSServiceSoapBindingStub(new java.net.URL(ArtigoServerWSPort_address), this);
                _stub.setPortName(getArtigoServerWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ArtigoServerWSPort".equals(inputPortName)) {
            return getArtigoServerWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.blog.gim.com.br/", "ArtigoServerWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.blog.gim.com.br/", "ArtigoServerWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ArtigoServerWSPort".equals(portName)) {
            setArtigoServerWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
