package br.gov.serpro.combustivel.rest;

import java.util.List;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;

import br.gov.serpro.combustivel.Combustivel;

public class CombustivelREST {
	private Client client;
	private WebResource webResource;
	
	public List<Combustivel> listarCombustivel() {
		return webResource.path("getpreco").get(new GenericType<List<Combustivel>>() {});
		
	}
	
	public CombustivelREST() {
		ClientConfig clientConfig = new DefaultClientConfig(GensonProvider.class);
		client=Client.create(clientConfig);
		client.addFilter(new LoggingFilter(System.out));

		webResource=client.resource("http://localhost:8080/combustivel/rest");
	}


}
