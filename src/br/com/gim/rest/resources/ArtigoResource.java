package br.com.gim.rest.resources;

import java.rmi.RemoteException;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.gim.rest.services.ArtigoService;
import br.com.gim.rest.services.JsonConverter;
import br.com.gim.rest.webservice.artigo.Artigo;


@Path("artigos")
public class ArtigoResource {

	ArtigoService artigoService = new ArtigoService(); // ver a injeção aqui depois
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getArtigos(){
		
		Artigo[] artigos = artigoService.getArtigos();
		
		return Response.status(200).entity(JsonConverter.toJson(artigos)).build();
	}
	
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getArtigoPorId(@PathParam("id") Long id){
		
		Artigo artigo = artigoService.getArtigoById(id);
		
		return Response.status(200).entity(JsonConverter.toJson(artigo)).build();
	}
}
