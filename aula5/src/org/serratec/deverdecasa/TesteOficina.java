package org.serratec.deverdecasa;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Hugo");
		Carro carro = new Carro("Onix", LocalDate.of(2025,02,10), proprietario, "híbrido");
		Moto moto = new Moto("Kawasaki", LocalDate.of(2025,12,28), proprietario, 3000);

		carro.trocarOleo();
		carro.revisao();
		moto.lavarVeiculo();

		System.out.println(carro.toString());
		System.out.println(moto.toString());
		
	}

}
