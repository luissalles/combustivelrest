package br.gov.serpro.combustivel;

public class Combustivel {
	private String tipo;
	private double preco;
	
	public double getPreco() {
		preco = RandomNumber.getRandomNumberInRange(1, 10);
		return preco;
	}

	Combustivel(String tipoCombustivel){
		this.tipo = tipoCombustivel;
	}

	public String getTipo() {
		return tipo;
	}
}
