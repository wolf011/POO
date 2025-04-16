package org.serratec.homework;

public final class Gato extends AnimalDeEstimacao {
	private String cor;

	
	public Gato(String nome, Integer idade, String cor) {
		super(nome, idade);
		this.cor = cor;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	@Override
	public String imprimir() {
		return super.imprimir() + ", cor: " + cor;
	}
	
	
}
