package br.org.serratec.exercicios;

import java.util.Scanner;

public class TesteVendedor {
	public static void main(String[] args) {
		Fixo vendedor1 = new Fixo("Joana", "987.456.321-98", 2000., 10., 2000.);
		Fixo vendedor2 = new Fixo("Maria", "123.654.798-01", 1518., 10., 1518.);
		Double valor1 = 0.;
		Double valor2 = 0.;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------Sistema de Vendas----------");
			System.out.println("Vendedores:");
			System.out.println("1 - " + vendedor1.getNome());
			System.out.println("2 - " + vendedor2.getNome());
			
			System.out.println("Escolha o vendedor?");
			int opcao = scanner.nextInt();
			if (opcao < 1 || opcao > 2) {
				System.out.println("ERRO. Opcção inválida! Programa Encerrado!");
				break;
			}

			System.out.println("Digite o valor da venda");
			Double valorIn = scanner.nextDouble();
			if (valorIn <= 0) {
				System.out.println("ERRO. Valor de compra Incorreto!");
				break;
			}

			if (opcao == 1 ) {
				valor1 += valorIn;
			}else {
				valor2 += valorIn;
			}
			
			scanner.nextLine(); //Limpa o \n que ficou pendente.
			System.out.println("Deseja encerrar o programa? (S/N)");
			String alternativa = scanner.nextLine();
			if (alternativa.equalsIgnoreCase("S")) {
				System.out.println("---------Salário dos vendedores:--------");
				vendedor1.calcularSalario(valor1);
				vendedor2.calcularSalario(valor2);
				
				System.out.println(vendedor1.toString());
				System.out.println(vendedor2.toString());

				System.out.println("------------Total vendido:--------------");
				System.out.println(String.format("Total: %.2f", valor1+valor2));
				break;
			}
	
		}
		
		scanner.close();
				
    }
}