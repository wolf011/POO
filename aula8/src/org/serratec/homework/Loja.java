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
	
	
	public void adotarAnimal(int index) {
//		if (index < 0 && index < animais.size()) {
//			throw  new AnimalException("Animal não encontrado!");
//		} 
//		animal = animais.get(index);
//		if (animal.ad)
//		
//		
//		System.out.println("Você adotou um " + animais.get(index).imprimir());
//		animais.get(index).setStatus(true);
//		animais.remove(index);
		
		Animal animal = animais.get(index);
		if (animal instanceof AnimalDeEstimacao) {
	        AnimalDeEstimacao a = (AnimalDeEstimacao) animal;

	        if (a.isAdotado()) {
	            throw new AnimalException("Este animal já foi adotado.");
	        } else {
	            a.setStatus(true);
	            System.out.println("Você adotou:" + a);
	            a.imprimir();
	        }
		}
	}
}
