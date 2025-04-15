package org.serratec.aula;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteAluno3 {
	public static void main(String[] args) {
		// Não permite elemento iguais
			//Não mantém a ordem
		//Set<String> times = new HashSet<>();
		//Mantém a ordem de inserção
		//Set<String> times = new LinkedHashSet<>();
		//Ordena os elementos
		Set<String> times = new TreeSet<>();
		Set<Integer> numeros = new HashSet<>();
		numeros.add(20);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);

		for (Integer numero : numeros) {
			System.out.println(numero);
		}

		times.add("Flamengo");
		times.add("Vasco");
		times.add("Vasco");
		times.add("Bangu");
		times.add("Botafogo");
		times.add("Flamengo");

		for (String time : times) {
			System.out.println(time);
		}
		
	}

}

