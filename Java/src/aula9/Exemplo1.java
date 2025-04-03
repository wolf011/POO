package aula9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Insira o primeiro valor: ");
			double number = scanner.nextInt();
			
			System.out.println("Insira o segundo valor: ");
			double number2 = scanner.nextInt();
			
			double media = (number + number2) / 2;
			if(number > number2) {
				System.out.println("O maior número é: " + number);
			} else {
				System.out.println("O menor número é: " + number2);
			}
			
			System.out.println("A média entre " + number + " e " + number2 + " é: " + media);
			} catch (InputMismatchException e) {
				System.out.println("O número inserido não é válido! Por favor, insira um número válido");
		} finally {
			scanner.close();
	 }
	}
  }