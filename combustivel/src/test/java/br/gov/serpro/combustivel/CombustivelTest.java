package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;;

public class CombustivelTest {

	@Test
	public void testSeDeveAbastecerComEtanol() {
		Combustivel etanol = new Combustivel("Etanol");
		Combustivel gasolina = new Combustivel("Gasolina");
		
		if(etanol.getPreco()/gasolina.getPreco()<=0.7) {
			Assert.assertEquals("Etanol", etanol.getTipo());
		}
	}

}
