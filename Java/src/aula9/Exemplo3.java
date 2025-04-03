package aula9;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o quanto você gastou no dia: ");
		double gastos = scanner.nextInt();

//		if (gastos <= 2300) {
//			System.out.println("Você gastou dentro do orçamento");
//		} else if (gastos > 4000) {
//			System.out.println("Você gastou muuuuuuito mais do que havia planejado");
//		} else {
//			System.out.println("O valor inserido não é válido! Por favor, insira o valor ");
//		}

		System.out.println(gastos>4000?"Aumento de 5%: "+gastos*1.05:"Aumento de 10%: "+gastos*1.1);
		
	}

}
