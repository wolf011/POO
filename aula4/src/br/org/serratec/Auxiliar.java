package br.org.serratec;

public abstract class Auxiliar extends Funcionario { // O abstract também permite quebrar regras de herança.
	protected String categoria;
	
	
	public Auxiliar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Categoria = " + categoria + ", cpf = " + cpf + ", nome = " + nome + ", salario = " + salario;
	}

	
	public String getCategoria() {
		return categoria;
	}

	
// Ex.:		
//	@Override
//	public void reajusteSalarial(Double valor) {
//		
//	}

	
}
