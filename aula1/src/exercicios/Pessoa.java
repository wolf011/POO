package exercicios;

public class Pessoa {
	private int id;
	private String nome;
	private double peso, altura;
	
//	setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//  getter
	public String getNome() {
		return nome;
	}
	
// Gerando automaticamente:	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso>=0) {
		this.peso = peso;
		}else {
			System.out.println("Você digitou um valor inválido!");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

// #####################################################################	
	
	private double calcularIMC() {
		return peso / (altura*altura);
	}
	
	public String resultado() {
		if (calcularIMC() < 18.5) {
			return "Você está abaixo do seu peso ideal.";
		} else if (calcularIMC() <=24.9) {
			return "Você está na faixa de peso ideal.";
		} else {
			return "Você está acima do seu peso ideal.";
		}
	}
	
//	Estrutura de ternário:
	public String resultado2() {
		return (calcularIMC() < 18.5)?"Você está abaixo do seu peso ideal.":(calcularIMC() <=24.9)?"Você está na faixa de peso ideal.":"Você está acima do seu peso ideal.";
	}
	
}
