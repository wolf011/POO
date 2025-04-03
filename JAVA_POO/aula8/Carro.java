package aula8;

import java.time.LocalDate;

public final class Carro extends Veiculo {
	private String categoria;

	public Carro(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = valorCobrado + TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		if (dataConserto.getDayOfWeek().name().equals("SATURDAY")) {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico() - 50;
		} else {
			valorCobrado = valorCobrado + TipoServico.OLEO.getValorPorServico();
		}
		return valorCobrado;
	}

	@Override
	public double revisao() {
		if (dataConserto.getDayOfMonth() == 8) {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico() * 0.90;
		} else {
			valorCobrado = valorCobrado + TipoServico.REVISAO.getValorPorServico();
		}
		return valorCobrado;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
