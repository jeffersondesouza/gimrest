/**
 * BlogServerWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.gim.rest.webservice.blogserver;

public interface BlogServerWS extends java.rmi.Remote {
    public br.com.gim.rest.webservice.blogserver.Artigo[] getArtigos() throws java.rmi.RemoteException;
    public void removerArtigo(br.com.gim.rest.webservice.blogserver.Artigo artigo) throws java.rmi.RemoteException;
    public void salvarArtigo(br.com.gim.rest.webservice.blogserver.Artigo artigo) throws java.rmi.RemoteException;
    public void criarComentario(br.com.gim.rest.webservice.blogserver.Comentario comentario) throws java.rmi.RemoteException;
    public void curtirArtigo(java.lang.Long artigoId) throws java.rmi.RemoteException;
    public br.com.gim.rest.webservice.blogserver.Artigo getArtigoById(java.lang.Long artigoId) throws java.rmi.RemoteException;
    public void descurtirArtigo(java.lang.Long artigoId) throws java.rmi.RemoteException;
}
