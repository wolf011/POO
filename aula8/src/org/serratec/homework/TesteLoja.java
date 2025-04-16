package org.serratec.homework;

public class TesteLoja {

	public static void main(String[] args) {
		try {
			
			Loja lojinha = new Loja("Pet4U");
			Cachorro c1 = new Cachorro("Fred", 12, "Pastor Alemão");
			Gato g1 = new Gato("Shrek", 12, "Branco");
			Cachorro c2 = new Cachorro("Fiona", 12, "Mesclado");
			Gato g2 = new Gato("Violeta", 14, "Pinscher");
			Cachorro c3 = new Cachorro("Mel", 13, "Bulldog");
			Gato g3 = new Gato("Bolha", 1, "colorido");
			Cachorro c4 = new Cachorro("Princesa", 2, "Pinscher");
			
			lojinha.addAnimal(c1, g1, c2, g2, c3, g3, c4);
			
			lojinha.listarAnimais();
			
			lojinha.adotarAnimal(2);
			lojinha.adotarAnimal(2);

		} catch (AnimalException e) {
			System.out.println(e.getMessage());

		}

	}

}
