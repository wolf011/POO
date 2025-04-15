package org.serratec.aula;

import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		// Não permite elementos iguais
//		Set<String> times = new HashSet<>();
//		Set<String> times = new LinkedHashSet<>(); // para manter a ordem dos itens.
//		Ordena os elementos:
		Set<String> times = new TreeSet<>(); // para manter a ordem dos itens.
		
		
		times.add("Fluminense");
		times.add("Vasco");
		times.add("Vasco");
		times.add("Flamengo");
		times.add("Botafogo");
		
		for (String time : times) {
			System.out.println(time);
		}
	}

}
