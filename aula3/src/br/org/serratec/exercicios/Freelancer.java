package br.org.serratec.exercicios;

public class Freelancer extends Vendedor{
	private int diasTrabalhados;
	private Double valorDia;
	
	
	public Freelancer(String nome, String cpf, int diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}


	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}
	
	
	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}
	
	
	public Double getValorDia() {
		return valorDia;
	}
	
	
	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}
	
	
}
