package exemplos;

public class Funcionario {
	private String nome;
	private double salario;

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	double getSalario() {
		return salario;
	}

	void setSalario(double salario) {
		this.salario = salario;
	}

	public double calcularValeTranporte() {
		return salario * 0.06;
	}

	public double calcularInss() {
		return salario * 0.11;
	}
}
