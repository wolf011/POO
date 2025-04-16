package org.serratec.exemplos;

public class TesteSorteio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 1);
		Aluno aluno2 = new Aluno("Rafael", 2);
		Aluno aluno3 = new Aluno("Marco", 3);
		
		
		Sorteio<Aluno> sortear =  new Sorteio<>();
		sortear.adicionar(aluno1);
		sortear.adicionar(aluno2);
		sortear.adicionar(aluno3);
		
		System.out.println("Aluno sorteado: " + sortear.sorteio());

		Sorteio<Integer> sortiador =  new Sorteio<>();
		sortiador.adicionarVarios(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println("Número sorteado: " + sortiador.sorteio());
		
	}

}
