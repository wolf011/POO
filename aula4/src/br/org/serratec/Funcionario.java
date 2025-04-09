package br.org.serratec;

public abstract class Funcionario {
	protected String cpf; 
	protected String nome;
	protected Double salario;
	
	
	public Funcionario(String cpf, String nome, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "CPF = " + cpf + ", nome=" + nome + ", salario=" + salario;
	}
			
//	Assinatura de método na qual os filhos terão que implementar. --Utiliza-se o abstract para isso.
	public abstract void reajusteSalarial(Double valor);

// Obs.: Para termos métodos abstratos precisamos ter uma clase abstrata.
}
