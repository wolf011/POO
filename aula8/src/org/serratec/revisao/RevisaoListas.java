package org.serratec.revisao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevisaoListas {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();
		cores.add("Branco");
		
//		método estático, por isso não é necessário adicionar o parâmetro new. NÃO É POSSÍVEL ADICIONAR ITENS DEPOIS DE INICIADO.
		List <Integer> numeros = Arrays.asList(10, 20, 30, 40);
//		numeros.add(60); // Dá erro
		numeros.set(0, 15); // Esse pode.
		
		List<String> times = List.of("Fluminense", "Vasco", "Flamengo", "Botafogo"); //  NÃO É POSSÍVEL ADICIONAR ITENS DEPOIS DE INICIADO.
//		times.add("Palmeiras"); // Dá erro
//		times.set(0, "Bangu"); //Dá erro.
	}

}
