package br.com.emailWS.webservice;

public class LesmailProxy implements br.com.emailWS.webservice.Lesmail {
  private String _endpoint = null;
  private br.com.emailWS.webservice.Lesmail lesmail = null;
  
  public LesmailProxy() {
    _initLesmailProxy();
  }
  
  public LesmailProxy(String endpoint) {
    _endpoint = endpoint;
    _initLesmailProxy();
  }
  
  private void _initLesmailProxy() {
    try {
      lesmail = (new br.com.emailWS.webservice.LesmailServiceLocator()).getLesmailPort();
      if (lesmail != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)lesmail)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)lesmail)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (lesmail != null)
      ((javax.xml.rpc.Stub)lesmail)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.emailWS.webservice.Lesmail getLesmail() {
    if (lesmail == null)
      _initLesmailProxy();
    return lesmail;
  }
  
  
}