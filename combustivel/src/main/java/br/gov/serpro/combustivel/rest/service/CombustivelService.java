package br.gov.serpro.combustivel.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.gov.serpro.combustivel.Combustivel;

@Path("/combustivel")
public class CombustivelService {

	private static final String CHARSET_UTF8 = ";charset=utf-8";
	
	@GET
	@Path("/getpreco")
	@Produces(MediaType.APPLICATION_JSON + CHARSET_UTF8)
	public List<Combustivel> listarPrecosCombustivel() {
		Combustivel combustivel;
		List<Combustivel> lista = new ArrayList<Combustivel> ();

		
		combustivel = new Combustivel("Etanol");
		lista.add(combustivel);
		
		combustivel = new Combustivel("Gasolina");
		lista.add(combustivel);
		
		return lista;
	}
	
}
