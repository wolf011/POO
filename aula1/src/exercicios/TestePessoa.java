package exercicios;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("Manoel");
		pessoa1.setPeso(67.8);
		pessoa1.setAltura(1.72);
		
		pessoa2.setNome("Manoel");
		pessoa2.setPeso(77.8);
		pessoa2.setAltura(1.82);

		System.out.println(pessoa1.getNome() + " você está " + pessoa1.resultado());
		System.out.println(pessoa2.getNome() + " você está " + pessoa2.resultado2());
		
		System.out.println(pessoa1 == pessoa2? "Iguais" : "Diferentes");
		System.out.println(pessoa1.getNome().equals(pessoa2.getNome()));
		System.out.println(pessoa1);
		System.out.println(pessoa2);
	}
}
