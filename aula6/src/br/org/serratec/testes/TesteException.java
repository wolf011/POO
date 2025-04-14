package br.org.serratec.testes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TesteException {
	public static void main(String[] args) {
		
//		System.out.println("Reusltado divisão: " + divisao(10, 0));

		
//		Tira as outra mensagens de erro e deixa somente a selecionada.
//		try {
//			System.out.println("Reusltado divisão: " + divisao(10, 0));
//		} catch (ArithmeticException ex) {
//			System.out.println("DIVISÃO POR 0.");
//		}

		
		
//		try {
//			System.out.println("Reusltado divisão: " + divisao(10, 0));
//		} catch (ArithmeticException ex) {
//			System.out.println("DIVISÃO POR 0."); // Mensagem de erro para o usuário.
//			ex.printStackTrace(); // Mensagem de erro para o programador.
//		}
////		Mensagem final
//		finally {
//			System.out.println("Finalizando o programa!");
//		}

		
		try

		{
			System.out.println("Reusltado divisão: " + divisao(10, 0));
			FileReader file = new FileReader("c:\temp\teste");
		} catch (ArithmeticException ex) {
			System.out.println("DIVISÃO POR 0."); // Mensagem de erro para o usuário.
			ex.printStackTrace(); // Mensagem de erro para o programador.
		} catch (FileNotFoundException ex) {
			System.out.println("Arquivo não encontrado!");
		} finally {
			System.out.println("Finalizando o programa!");
		}
	}

	
//	public static int divisao(int a, int b) {
//		if (b == 0) {
//			Encerra o código e printa uma String.
//			throw new ArithmeticException("DIVISÃO POR 0.");
//		}
//		return a/b;
//	}

	
	public static int divisao(int a, int b) throws ArithmeticException {
		return a / b;
	}
}