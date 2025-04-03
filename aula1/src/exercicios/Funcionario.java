package exercicios;

public class Funcionario {
	private String nome;
	private double salario;
	private static int contador = 0; // Pertence a CLASSE
		
//	Toda vez, que usar o construtor cheio é interessante tê-lo vazio tbm
	public Funcionario() {
		super();
	}

	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		contador ++;
	}
	

	public static int getContador() {
		return contador;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	
}
