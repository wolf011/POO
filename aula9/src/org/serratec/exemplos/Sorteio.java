package org.serratec.exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {
	
	private List<T> lista;
	private Random random;
	
	
	public Sorteio() {
		lista = new ArrayList<>();
		random = new Random();
	}
	
	
	public void adicionar(T elemto) {
		lista.add(elemto);
	}

	
	public void adicionarVarios(T... elemto) {
		lista.addAll(Arrays.asList(elemto));
	}
	
	public void remover(T elemento) {
		lista.remove(elemento);
	}
	
	public T sorteio () {
		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}
}
