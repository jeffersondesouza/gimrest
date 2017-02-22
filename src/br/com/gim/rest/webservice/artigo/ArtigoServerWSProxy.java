package br.com.gim.rest.webservice.artigo;

import javax.ejb.Stateless;

@Stateless
public class ArtigoServerWSProxy implements br.com.gim.rest.webservice.artigo.ArtigoServerWS {
  private String _endpoint = null;
  private br.com.gim.rest.webservice.artigo.ArtigoServerWS artigoServerWS = null;
  
  public ArtigoServerWSProxy() {
    _initArtigoServerWSProxy();
  }
  
  public ArtigoServerWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initArtigoServerWSProxy();
  }
  
  private void _initArtigoServerWSProxy() {
    try {
      artigoServerWS = (new br.com.gim.rest.webservice.artigo.ArtigoServerWSServiceLocator()).getArtigoServerWSPort();
      if (artigoServerWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)artigoServerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)artigoServerWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (artigoServerWS != null)
      ((javax.xml.rpc.Stub)artigoServerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.gim.rest.webservice.artigo.ArtigoServerWS getArtigoServerWS() {
    if (artigoServerWS == null)
      _initArtigoServerWSProxy();
    return artigoServerWS;
  }
  
  public br.com.gim.rest.webservice.artigo.Artigo[] getArtigos() throws java.rmi.RemoteException{
    if (artigoServerWS == null)
      _initArtigoServerWSProxy();
    return artigoServerWS.getArtigos();
  }
  
  
}