package br.gov.serpro.combustivel;

public class Combustivel {
	private String tipo;
	private double preco;
	
	public double getPreco() {
		preco = RandomNumber.getRandomNumberInRange(1, 10);
		return preco;
	}

	public Combustivel(String tipoCombustivel){
		this.tipo = tipoCombustivel;
		this.preco = getPreco();
	}

	public String getTipo() {
		return tipo;
	}
}
