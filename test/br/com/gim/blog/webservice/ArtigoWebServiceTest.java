package br.com.gim.blog.webservice;

import java.rmi.RemoteException;

import br.com.gim.rest.services.JsonConverter;
import br.com.gim.rest.webservice.artigo.Artigo;
import br.com.gim.rest.webservice.artigo.ArtigoServerWS;
import br.com.gim.rest.webservice.artigo.ArtigoServerWSProxy;

public class ArtigoWebServiceTest {

	public static void main(String[] args) throws RemoteException {
		
		ArtigoServerWS artigoServerWS = new ArtigoServerWSProxy();
		
		Artigo[] artigos = artigoServerWS.getArtigos();
		
		for (Artigo artigo : artigos) {
			
			System.out.println(JsonConverter.toJson(artigo));
		}
		
		
		
	}
	
}
