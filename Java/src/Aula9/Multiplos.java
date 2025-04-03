package Aula9;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor inicial: ");
		int inicio = scanner.nextInt();

		System.out.print("Digite o valor final: ");
		int fim = scanner.nextInt();

		System.out.print("Digite o divisor: ");
		int divisor = scanner.nextInt();

		System.out.println("Os múltiplos de " + divisor + " entre " + inicio + " e " + fim + " são:");
		for (int i = inicio; i <= fim; i++) {
			if (i % divisor == 0) {
				System.out.println(i);
			}
		}

		scanner.close();
	}
}