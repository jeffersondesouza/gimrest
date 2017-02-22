/**
 * LesmailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.emailWS.webservice;

public class LesmailServiceLocator extends org.apache.axis.client.Service implements br.com.emailWS.webservice.LesmailService {

    public LesmailServiceLocator() {
    }


    public LesmailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LesmailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LesmailPort
    private java.lang.String LesmailPort_address = "http://localhost:9090/EmailWebService/Lesmail";

    public java.lang.String getLesmailPortAddress() {
        return LesmailPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LesmailPortWSDDServiceName = "LesmailPort";

    public java.lang.String getLesmailPortWSDDServiceName() {
        return LesmailPortWSDDServiceName;
    }

    public void setLesmailPortWSDDServiceName(java.lang.String name) {
        LesmailPortWSDDServiceName = name;
    }

    public br.com.emailWS.webservice.Lesmail getLesmailPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LesmailPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLesmailPort(endpoint);
    }

    public br.com.emailWS.webservice.Lesmail getLesmailPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.emailWS.webservice.LesmailServiceSoapBindingStub _stub = new br.com.emailWS.webservice.LesmailServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLesmailPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLesmailPortEndpointAddress(java.lang.String address) {
        LesmailPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.emailWS.webservice.Lesmail.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.emailWS.webservice.LesmailServiceSoapBindingStub _stub = new br.com.emailWS.webservice.LesmailServiceSoapBindingStub(new java.net.URL(LesmailPort_address), this);
                _stub.setPortName(getLesmailPortWSDDServiceName());
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
        if ("LesmailPort".equals(inputPortName)) {
            return getLesmailPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.emailWS.com.br/", "LesmailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.emailWS.com.br/", "LesmailPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LesmailPort".equals(portName)) {
            setLesmailPortEndpointAddress(address);
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
