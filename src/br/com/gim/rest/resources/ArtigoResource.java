package br.com.gim.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.gim.rest.services.ArtigoService;
import br.com.gim.rest.services.JsonConverter;
import br.com.gim.rest.webservice.blogserver.Artigo;

@Path("artigos")
public class ArtigoResource {

	ArtigoService artigoService = new ArtigoService(); // ver a injeção aqui
														// depois

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getArtigos() {

		String artigos = artigoService.getArtigos();

		return Response.status(200).entity(artigos).build();
	}

	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response busca(@PathParam("id") Long id) {
		System.out.println(id);

		Artigo artigo = artigoService.getArtigoById(id);

		return Response.status(200).entity(JsonConverter.toJson(artigo)).build();
	}

}
