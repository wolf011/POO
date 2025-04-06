package aulas;

public class Medico {
	private String crm;
	private String nome;
	private double salario;
	private double valorDaConsulta;
	
	
	public Medico(String crm, String nome, double salario, double valorDaConsulta) {
		super();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorDaConsulta = valorDaConsulta;
	}

	public void pagamentoDinheiro() {
		this.salario += valorDaConsulta;
	}
	
	public void pagamentoPlano() {
		this.salario += valorDaConsulta * 0.7;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public double getValorDaConsulta() {
		return valorDaConsulta;
	}
	
	
	
}
