package org.serratec.deverdecasa;

import java.time.LocalDate;

public class Moto extends Veiculo{
	private Integer cilindradas;

	
	
	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, Integer cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public Double trocarOleo() {
		valorCobrado += TipoServico.OLEO.getValorPorServico();
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public Double revisao() {
		valorCobrado += TipoServico.REVISAO.getValorPorServico();
		return TipoServico.REVISAO.getValorPorServico();
	}
	
}
