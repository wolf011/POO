package br.com.serratec.heranca;


//	extends + classe puxa a herança.
public class Gerente extends Empregado {
	private Integer numEmpregadosGerenciados;

	public Gerente(String nome, String email, String telefone, Double salario, Integer numEmpregadosGerenciados) {
		super(nome, email, telefone, salario);
		this.numEmpregadosGerenciados = numEmpregadosGerenciados;
	}

	public Integer getNumEmpregadosGerenciados() {
		return numEmpregadosGerenciados;
	}
	
	@Override
	public Double aumentarSalario(Double valor) {
		return salario = super.aumentarSalario(valor) + 1000.;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " nº de empregados: " + numEmpregadosGerenciados ;

	}
}
