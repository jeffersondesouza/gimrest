package br.com.gim.rest.config;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;


public class ServerRestConfig {
	
	public static void main(String[] args) throws IOException{
	
		HttpServer server = inicializaServidor();
		
		System.in.read();
		server.stop();
	}

	private static HttpServer inicializaServidor() {
		ResourceConfig configs = new ResourceConfig().packages("br.com.gim.rest"); 
		configs.register(ResponseFilter.class);
		
		URI uri = URI.create("http://localhost:8000/");
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, configs);
		System.out.println("Servidor rodando na porta: "+uri);
		return server;
	}	
}
