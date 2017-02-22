/**
 * ArtigoServerWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.artigo;

import javax.jws.WebMethod;
import javax.jws.WebService;

public interface ArtigoServerWS extends java.rmi.Remote {
	
    public br.com.gim.rest.webservice.artigo.Artigo[] getArtigos() throws java.rmi.RemoteException;
}
