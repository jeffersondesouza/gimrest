/**
 * BlogServerWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.blogserver;

public class BlogServerWSServiceLocator extends org.apache.axis.client.Service implements br.com.gim.rest.webservice.blogserver.BlogServerWSService {

    public BlogServerWSServiceLocator() {
    }


    public BlogServerWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BlogServerWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BlogServerWSPort
    private java.lang.String BlogServerWSPort_address = "http://localhost:8080/gim-infra/BlogServerWS";

    public java.lang.String getBlogServerWSPortAddress() {
        return BlogServerWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BlogServerWSPortWSDDServiceName = "BlogServerWSPort";

    public java.lang.String getBlogServerWSPortWSDDServiceName() {
        return BlogServerWSPortWSDDServiceName;
    }

    public void setBlogServerWSPortWSDDServiceName(java.lang.String name) {
        BlogServerWSPortWSDDServiceName = name;
    }

    public br.com.gim.rest.webservice.blogserver.BlogServerWS getBlogServerWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BlogServerWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBlogServerWSPort(endpoint);
    }

    public br.com.gim.rest.webservice.blogserver.BlogServerWS getBlogServerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.gim.rest.webservice.blogserver.BlogServerWSServiceSoapBindingStub _stub = new br.com.gim.rest.webservice.blogserver.BlogServerWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBlogServerWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBlogServerWSPortEndpointAddress(java.lang.String address) {
        BlogServerWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.gim.rest.webservice.blogserver.BlogServerWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.gim.rest.webservice.blogserver.BlogServerWSServiceSoapBindingStub _stub = new br.com.gim.rest.webservice.blogserver.BlogServerWSServiceSoapBindingStub(new java.net.URL(BlogServerWSPort_address), this);
                _stub.setPortName(getBlogServerWSPortWSDDServiceName());
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
        if ("BlogServerWSPort".equals(inputPortName)) {
            return getBlogServerWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "BlogServerWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.blogserver.gim.com.br/", "BlogServerWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BlogServerWSPort".equals(portName)) {
            setBlogServerWSPortEndpointAddress(address);
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
