package exercicios;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	public static int contador = 0;
	
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, double altura, double peso) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		contador ++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
}
