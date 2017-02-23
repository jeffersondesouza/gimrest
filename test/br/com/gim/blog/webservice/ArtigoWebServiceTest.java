package br.com.gim.blog.webservice;

import java.rmi.RemoteException;

import br.com.gim.rest.services.JsonConverter;
import br.com.gim.rest.webservice.blogserver.Artigo;
import br.com.gim.rest.webservice.blogserver.BlogServerWS;
import br.com.gim.rest.webservice.blogserver.BlogServerWSProxy;

public class ArtigoWebServiceTest {

	public static void main(String[] args) throws RemoteException {
		
		BlogServerWS artigoServerWS = new BlogServerWSProxy();
		
		Artigo[] artigos = artigoServerWS.getArtigos();
		
		for (Artigo artigo : artigos) {
			
			System.out.println(JsonConverter.toJson(artigo));
		}
		
		
		
	}
	
}
