package br.com.gim.rest.services;

import java.rmi.RemoteException;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import br.com.gim.rest.webservice.blogserver.Artigo;
import br.com.gim.rest.webservice.blogserver.BlogServerWS;
import br.com.gim.rest.webservice.blogserver.BlogServerWSProxy;

@Stateless
public class ArtigoService {
	
	BlogServerWS blogWS = new BlogServerWSProxy();		
		
	public String getArtigos(){
		
		try {
			
			return JsonConverter.toJson(blogWS.getArtigos());
			
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
		
		
	}

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Artigo getArtigoById(Long id) {
		try {
			return blogWS.getArtigoById(id);
		} catch (RemoteException e) {
			throw new RuntimeException("Erro ao tentar buscar um artigo por ID",e);
		}
	}

}
