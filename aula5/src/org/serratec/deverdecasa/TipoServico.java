package org.serratec.deverdecasa;

public enum TipoServico {
	OLEO(100.), LAVAGEM(50.), REVISAO(200.);
	
	private Double valorPorServico;

	
	private TipoServico(Double valorPorServico) {
		this.valorPorServico = valorPorServico;
	}


	public Double getValorPorServico() {
		return valorPorServico;
	}
	

}
