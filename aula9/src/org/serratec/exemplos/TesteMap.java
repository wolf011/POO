package org.serratec.exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TesteMap {
	
	public static void main(String[] args) {
//		new LinkedHashmap // Mantém a ordem como os itens são inseridos.
//		new Treemap
//		new Hashmap // Não mantém a ordem como os itens são inseridos.
		
		Map<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Roni");
		mapa.put(2, "Vitor");
		mapa.put(3, "João");
		
		System.out.println(mapa);

		
		TreeMap<Aluno, Integer> mapa2 = new TreeMap<>();
		mapa2.put(new Aluno("Maria", 25), 1);
		mapa2.put(new Aluno("Sergio", 34), 200);
		mapa2.put(new Aluno("Carlos", 22), 300);

		System.out.println(mapa2);
	}
}
