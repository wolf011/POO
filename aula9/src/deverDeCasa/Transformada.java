package deverDeCasa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Transformada {

	public static void main(String[] args) {
		String[][] clientes = {{"123", "Marcos", "m@gmail.com"}, {"143","Carla","c@gmail.com" }, {"125", "Amarildo","a@gmail.com"}};
		Map<Integer, List<String>> mapa = new TreeMap<>();
	
		
		Integer id = 1;
		for (String[] itens: clientes) {
			mapa.put(id, Arrays.asList(itens));
			id++;
		}
		
		
		for (Map.Entry<Integer, List<String>> dados : mapa.entrySet()) {
			System.out.println(dados.getValue());
			
		}
	}
	
	
}
