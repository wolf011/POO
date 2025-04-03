package aula8;

public enum TipoServico {
	OLEO(100), LAVAGEM(80), REVISAO(200);

	private double valorPorServico;

	private TipoServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}

	public void setValorPorServico(double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}

}
