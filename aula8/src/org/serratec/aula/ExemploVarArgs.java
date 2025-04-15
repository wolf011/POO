package org.serratec.aula;

public class ExemploVarArgs {
	public static void main(String[] args) {
//		int[] numeros = {1, 2, 3};
//		somar(numeros);
		
		int total = somar(10, 24, 45, 32);
		System.out.println("Total: " + total);
		
		int total2 = somar2(10, 20, 30, 40, 60);
		System.out.println("Total2: " + total2);
	}

	// VarArgs
	public static int somar(int... numeros) { //Quando temos ... recebemos quantos valores quisermos, não é um vetor.
		int soma = 0;
		
		for (int i : numeros) {
			soma += i;
		}
		return soma;
	}
	
	
	// Nesse caso, a primeira entrada entra na primeira variável e o resto na segunda.
	public static int somar2(int numero, int... numeros) { //Quando temos ... recebemos quantos valores quisermos, não é um vetor.
		int soma = 0;
		
		for (int i : numeros) {
			soma += i;
		}
		return soma * numero;
	}
}
