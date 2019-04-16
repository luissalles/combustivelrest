package br.gov.serpro.combustivel;

import java.util.List;

import org.junit.Test;

import br.gov.serpro.combustivel.rest.CombustivelREST;;

public class CombustivelTest {
	
	@Test
	public void testSeDeveAbastecerComEtanolOuGasolinaRest() {
		double precoEtanol = 0.00;
		double precoGasolina = 0.00;
		List<Combustivel> listaCombustivel;
		CombustivelREST combustivelREST = new CombustivelREST();
		
		listaCombustivel = combustivelREST.listarCombustivel();

		for(Combustivel combustivel : listaCombustivel) {
			if(combustivel.getTipo().equals("Etanol")) {
				precoEtanol = combustivel.getPreco();
			}else if(combustivel.getTipo().equals("Gasolina")) {
				precoGasolina = combustivel.getPreco();
			}
		}
		
		if((precoEtanol/precoGasolina) <= 0.7) {
			System.out.println("Comprar Etanol");
		}else {
			System.out.println("Comprar Gasolina");
		}
	}
}
