package org.serratec.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loja {
	private String nomeLoja;
	List <Animal> animais = new ArrayList<>();
	
	
	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}


	public void addAnimal(Animal... animal) {
		animais.addAll(Arrays.asList(animal));
	}
	
	
	public void listarAnimais() {
		for (Animal animal : animais) {

			System.out.println(animal.imprimir());
		}
	}
	
	
	public void adotarAnimal(int index) throws IndexOutOfBoundsException {
		Animal animal = animais.get(index);
		if (animal instanceof AnimalDeEstimacao) {
			AnimalDeEstimacao bicho = (AnimalDeEstimacao) animal;
			
			if (bicho.isAdotado()) {
				throw new AnimalException("Este animal já adotado.");
			} else {
				bicho.setStatus(true);
				System.out.println("Você adotou: " + bicho.imprimir());
			}
		}
	}
	
	
}
