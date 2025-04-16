package org.serratec.homework;

public abstract class AnimalDeEstimacao implements Animal {
	private String nome;
	private Integer idade;
	protected Boolean status;
	
	
	public AnimalDeEstimacao(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
		this.status = false;
	}


	public String getNome() {
		return nome;
	}


	public Integer getIdade() {
		return idade;
	}
	

	public Boolean isAdotado() {
		return status;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	@Override
	public String imprimir() {
		return "Animal: " + nome + ", Idade: " + idade + status;

	}

	
}
