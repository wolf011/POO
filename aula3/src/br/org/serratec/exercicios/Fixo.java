package br.org.serratec.exercicios;

public class Fixo extends Vendedor{
	private Double salarioBase;
	private Double comissao;
	private Double salarioBruto;

	
	public Fixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
	}
	
	
	public Double getSalarioBase() {
		return salarioBase;
	}
	
	
	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
	public Double getComissao() {
		return comissao;
	}
	
	
	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
	public Double getSalarioBruto() {
		return salarioBruto;
	}
	
	
	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	@Override
	public String toString() {
//		return "Fixo [salarioBase=" + salarioBase + ", comissao=" + comissao + ", salarioBruto=" + salarioBruto	+ ", nome=" + nome + ", cpf=" + cpf + "]";
//		return String.format("Nome: %s \nCPF: %s \nSalário bruto: %.2f \nSalário líquido: %.2f \nComissão: %.2f", nome, cpf, salarioBruto, salarioBase, comissao);
		return String.format("Nome: %s \nSalário bruto: %.2f", getNome(), salarioBruto);
	}
	
	
	public void calcularSalario(Double valorVenda) {
		salarioBruto += valorVenda * comissao/100;
	}
	
}
