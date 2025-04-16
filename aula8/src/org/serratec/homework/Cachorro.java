package org.serratec.homework;

public final class Cachorro extends AnimalDeEstimacao {
	private String raca;

	
	public Cachorro(String nome, Integer idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}


	public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	@Override
	public String imprimir() {
		return super.imprimir() + ", raça: " + raca;
	}
	
	
}
