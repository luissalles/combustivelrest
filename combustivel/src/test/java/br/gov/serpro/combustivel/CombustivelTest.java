package br.gov.serpro.combustivel;

import org.junit.Test;;

public class CombustivelTest {
	Combustivel etanol;
	Combustivel gasolina;
	
	@Test
	public void testSeDeveAbastecerComEtanol() {
		double precoEtanol;
		double precoGasolina;
		
		etanol = new Combustivel("Etanol");
		precoEtanol = etanol.getPreco();
		gasolina = new Combustivel("Gasolina");
		precoGasolina = gasolina.getPreco();
		
		
		if((precoEtanol/precoGasolina) <= 0.7) {
			System.out.println("Comprar "+etanol.getTipo());
		}else {
			System.out.println("Comprar "+gasolina.getTipo());
		}
	}

}
