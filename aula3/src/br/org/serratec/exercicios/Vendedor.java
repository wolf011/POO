package br.org.serratec.exercicios;

public class Vendedor {

	public static void main(String[] args) {

	}
	
	private String nome;
	private String cpf;
	
	
	public Vendedor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
}
