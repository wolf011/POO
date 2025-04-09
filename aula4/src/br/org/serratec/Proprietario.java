package br.org.serratec;

public class Proprietario {
	private String nome;

	
	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	
	public String getNome() {
		return nome;
	}

	
	@Override
	public String toString() {
		return "Proprietario = " + nome;
	}

}
