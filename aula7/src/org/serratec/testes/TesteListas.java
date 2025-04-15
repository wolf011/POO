package org.serratec.testes;

import java.util.Arrays;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		String[] carros = {"Sandero", "HB20", "Versa", "KA", "Corsa"};
//		List<String> listaCarros = Arrays.asList(carros); // Cria um novo vetor onde ele armazena a posição do antigo.
		List<String> listaCarros = List.of(carros); // Cria um novo vetor onde ele armazena o valor do antigo.
		
//		listaCarros.set(0, "Fusca");
		carros[1] = "Fox";
		
		for (String carro : listaCarros) {
			System.out.println(carro);
		}
		System.out.println(carros[1]);
	}
}

