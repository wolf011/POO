package br.org.serratec.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palavras {


	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		String palavra = sc.nextLine();
//		String palavra = null;
		
		try {
			
			System.out.println("Escreva idade: ");
			int idade = sc.nextInt();
			System.out.println(upperCase(palavra));
			
		} catch (NullPointerException n) {
			
			System.out.println("Erro!");
			
		} catch (InputMismatchException i) {
			
			System.out.println("Caracter Inválido");
			
		} finally {
			
			sc.close();
	
		}
	}

	public static String upperCase(String palavrinha) throws NullPointerException {
		return palavrinha.toUpperCase();  
	}
	
	
}
