package aulas;

public class Calculadora {
	private Double valor1;
	private Double valor2;
	
		
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	
	
	public double soma() {
		return valor1 + valor2;
	}
	
	public double subtracao() {
		return valor1 - valor2;
	}

	public double multiplicacao() {
		return valor1 * valor2;
	}
	
	public double divisao() {
		return valor1 / valor2;
	}
	
}
