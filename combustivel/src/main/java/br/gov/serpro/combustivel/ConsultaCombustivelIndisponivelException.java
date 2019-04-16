package br.gov.serpro.combustivel;

public class ConsultaCombustivelIndisponivelException extends Exception{
	private static final long serialVersionUID = 1L;
	private final String erro;
	
	ConsultaCombustivelIndisponivelException(String erro, String message){
		super(message);
		this.erro = erro;
	}
}
