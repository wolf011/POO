package aula8;

import java.time.LocalDate;

public abstract class Veiculo implements Oficina {

	protected String modelo;
	protected double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public Veiculo(String modelo, double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public double lavarVeiculo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double trocarOleo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double revisao() {
		// TODO Auto-generated method stub
		return 0;
	}

}
