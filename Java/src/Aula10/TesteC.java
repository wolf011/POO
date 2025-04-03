package Aula10;

import Exercicios.Conta;

public class TesteC {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();

		c1.numero = 123;
		c1.titular = "Marcos";
		c1.saldo = 8000;

		c2.numero = 321;
		c2.titular = "Marcela";
		c2.saldo = 9000;
		
		System.out.println("Saldo do Marcos: "+c1.saldo);
		c1.depositar(1000);
		System.out.println("Saldo do Marcos: "+c1.saldo);

		if (c1.saque(3000)) {
			System.out.println("Saque efetuado!");
		} else {
			System.out.println("Saque não efetuado!");
		}
		
		System.out.println("Saldo do Marcos: "+c1.saldo);

	}

}
