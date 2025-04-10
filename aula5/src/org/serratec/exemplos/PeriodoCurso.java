package org.serratec.exemplos;

public enum PeriodoCurso {
	INTEGRAL("ter e qui", 40, 2000.), 
	NOTURNO("sex", 80, 3000.), 
	TARDE("seg e qua", 20, 500.);

	private String dias;
	private Integer cargaHoraria;
	private Double valor;

	//	Construtor do ENUM é usado somente para definir a ordem dos atributos, por conta disso seu construtor é privado.
	private PeriodoCurso(String dias, Integer cargaHoraria, Double valor) {
		this.dias = dias;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	
	public String getDias() {
		return dias;
	}

	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	
	public Double getValor() {
		return valor;
	}
	

}
