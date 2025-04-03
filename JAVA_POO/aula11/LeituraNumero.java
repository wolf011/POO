package aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();

			System.out.println("Número digitado: " + numero);
		} catch (InputMismatchException e) {
			System.out.println("Falha ao ler o número. Você deve digitar um número inteiro.");
		} finally {
			scanner.close();
		}
	}
}