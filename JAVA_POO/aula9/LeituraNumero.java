package exemplos;

import java.util.Scanner;

public class LeituraNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();

			System.out.println("Número digitado: " + numero);
		} catch (Exception e) {
			System.out.println("Falha ao ler o número");
		} finally {
			scanner.close();
		}
	}
}