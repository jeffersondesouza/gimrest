package br.com.gim.rest.webservice.blogserver;

public class BlogServerWSProxy implements br.com.gim.rest.webservice.blogserver.BlogServerWS {
  private String _endpoint = null;
  private br.com.gim.rest.webservice.blogserver.BlogServerWS blogServerWS = null;
  
  public BlogServerWSProxy() {
    _initBlogServerWSProxy();
  }
  
  public BlogServerWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initBlogServerWSProxy();
  }
  
  private void _initBlogServerWSProxy() {
    try {
      blogServerWS = (new br.com.gim.rest.webservice.blogserver.BlogServerWSServiceLocator()).getBlogServerWSPort();
      if (blogServerWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)blogServerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)blogServerWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (blogServerWS != null)
      ((javax.xml.rpc.Stub)blogServerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.gim.rest.webservice.blogserver.BlogServerWS getBlogServerWS() {
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    return blogServerWS;
  }
  
  public br.com.gim.rest.webservice.blogserver.Artigo[] getArtigos() throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    return blogServerWS.getArtigos();
  }
  
  public void removerArtigo(br.com.gim.rest.webservice.blogserver.Artigo artigo) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    blogServerWS.removerArtigo(artigo);
  }
  
  public void salvarArtigo(br.com.gim.rest.webservice.blogserver.Artigo artigo) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    blogServerWS.salvarArtigo(artigo);
  }
  
  public void criarComentario(br.com.gim.rest.webservice.blogserver.Comentario comentario) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    blogServerWS.criarComentario(comentario);
  }
  
  public void curtirArtigo(java.lang.Long artigoId) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    blogServerWS.curtirArtigo(artigoId);
  }
  
  public br.com.gim.rest.webservice.blogserver.Artigo getArtigoById(java.lang.Long artigoId) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    return blogServerWS.getArtigoById(artigoId);
  }
  
  public void descurtirArtigo(java.lang.Long artigoId) throws java.rmi.RemoteException{
    if (blogServerWS == null)
      _initBlogServerWSProxy();
    blogServerWS.descurtirArtigo(artigoId);
  }
  
  
}