package exemplos;

public class Fixo extends Vendedor {
	private double salarioBase;
	private double comissao;
	private double salarioBruto;

	public Fixo(String nome, String cpf, double salarioBase, double comissao) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "nome:" + nome + "\nsalário Bruto:" + salarioBruto;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void calcularSalario(double valorVenda) {
		double calculoComissao = valorVenda * comissao / 100;
		salarioBruto += calculoComissao;
	}

}
