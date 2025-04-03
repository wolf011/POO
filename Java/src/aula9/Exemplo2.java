package aula9;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) { // main with crtl+spacebar
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um mês: ");
		int mes = scanner.nextInt();
		if(mes == 1) {
			System.out.println("O mês escrito foi Janeiro.");
		} else if(mes == 2) {
			System.out.println("O mês escrito foi Fevereiro.");
		} else if(mes == 3){
			System.out.println("O mês escolhido foi Março.");
		} else {
			System.out.println("Insira um número válido!");
		}
		}
	}

