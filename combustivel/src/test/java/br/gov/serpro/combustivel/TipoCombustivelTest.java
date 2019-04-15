package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

import junit.*;;

public class TipoCombustivelTest {

	@Test
	public void testSeDeveAbastecerComEtanol() {
		Combustivel etanol = new Combustivel("Etanol");
		Combustivel gasolina = new Combustivel("Gasolina");
		
		Assert.assertTrue((etanol.getPreco()/gasolina.getPreco)<=0.7);
		
	}

}
