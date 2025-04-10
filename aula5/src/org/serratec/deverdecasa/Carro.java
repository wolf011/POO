package org.serratec.deverdecasa;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo {
	private String categoria;

	
	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	
	public String getCategoria() {
		return categoria;
	}

	
	@Override
	public Double lavarVeiculo() {
		valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	
	@Override
	public Double trocarOleo() {
		if (dataConserto.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
			valorCobrado += TipoServico.OLEO.getValorPorServico() - 50.;			
			return TipoServico.OLEO.getValorPorServico() - 50.;
		} else {
			valorCobrado += TipoServico.OLEO.getValorPorServico();
			return TipoServico.OLEO.getValorPorServico();
		}
	}

	
	@Override
	public Double revisao() {
		if (dataConserto.getMonth().equals(Month.AUGUST)) {
			valorCobrado += TipoServico.REVISAO.getValorPorServico() * 0.9;
			return TipoServico.REVISAO.getValorPorServico() * 0.9;
		} else {
			valorCobrado += TipoServico.REVISAO.getValorPorServico();
			return TipoServico.REVISAO.getValorPorServico();
		}
	}
}
