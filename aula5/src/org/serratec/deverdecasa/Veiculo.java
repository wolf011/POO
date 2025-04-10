package org.serratec.deverdecasa;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina{
	private String modelo;
	protected Double valorCobrado = 0.;
	protected LocalDate dataConserto;
	private Proprietario proprietario;
	

	
	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}


	@Override
	public String toString() {
		return proprietario + "\nVeiculo: " + modelo + ", Valor = " + valorCobrado + ", Data Ccnserto = " + dataConserto;
	}


	public Double getValorCobrado() {
		return valorCobrado;
	}


	@Override
	public Double lavarVeiculo() {
		return TipoServico.LAVAGEM.getValorPorServico();
	}


	@Override
	public Double trocarOleo() {
			return TipoServico.OLEO.getValorPorServico();
	}


	@Override
	public Double revisao() {
		return TipoServico.REVISAO.getValorPorServico();
	}
}
