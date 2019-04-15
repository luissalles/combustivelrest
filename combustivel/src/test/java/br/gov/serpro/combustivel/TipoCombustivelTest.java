package br.gov.serpro.combustivel;

import org.junit.Assert;
import org.junit.Test;

import junit.*;;

public class TipoCombustivelTest {

	@Test
	public void testSeDeveAbastecerComEtanol() {
		PrecoCombustivel precoEtanol = new PrecoCombustivel("Etanol");
		PrecoCombustivel precoGasolina = new PrecoCombustivel("Gasolina");
		
		Assert.assertTrue((precoEtanol/precoGasolina)<=0.7);
		
	}

}
