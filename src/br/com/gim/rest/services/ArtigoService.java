package br.com.gim.rest.services;

import java.rmi.RemoteException;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.emailWS.webservice.Lesmail;
import br.com.emailWS.webservice.LesmailProxy;
import br.com.gim.rest.webservice.artigo.Artigo;
import br.com.gim.rest.webservice.artigo.ArtigoServerWS;
import br.com.gim.rest.webservice.artigo.ArtigoServerWSProxy;

public class ArtigoService {
	
	ArtigoServerWS artigoWS = new ArtigoServerWSProxy();		
		
	public Artigo[] getArtigos(){
		
		try {
			
			Lesmail enviadorEmail = new LesmailProxy();
			
			
			return artigoWS.getArtigos();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
		
		
	}

	public Artigo getArtigoById(Long id) {
		return artigoWS.getArtigoById(id);
	}

}
