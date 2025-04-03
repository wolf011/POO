package aula8;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private int cilindradas;

	public Moto(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		return valorCobrado = TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		return valorCobrado = TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		return valorCobrado = TipoServico.REVISAO.getValorPorServico();
	}

}
