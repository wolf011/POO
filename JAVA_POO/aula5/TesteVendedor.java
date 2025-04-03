package exemplos;

import java.util.Scanner;

public class TesteVendedor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		double valorVenda;
		int opcaoVendedor;
		double totalVendido=0;
		System.out.println("----------Sistema de Vendas----------");

		Fixo fixo1 = new Fixo("Joana", "12345678900", 2000, 3);
		Fixo fixo2 = new Fixo("Maria", "12345678901", 2000, 5);
		fixo1.setSalarioBruto(fixo1.getSalarioBase());
		fixo2.setSalarioBruto(fixo2.getSalarioBase());

		System.out.println("Vendedores:");
		System.out.println("1-" + fixo1.getNome());
		System.out.println("2-" + fixo2.getNome());

		while (opcao == 'N') {
			System.out.println("Escolha o vendedor?");
			opcaoVendedor = sc.nextInt();

			System.out.println("Digite o valor da venda");
			valorVenda = sc.nextDouble();

			if (opcaoVendedor == 1) {
				fixo1.calcularSalario(valorVenda);
			} else {
				fixo2.calcularSalario(valorVenda);
			}
			
			totalVendido += valorVenda;
			System.out.println("\nDeseja encerrar o programa? (S/N) ");
			opcao = sc.next().charAt(0);
		}

		System.out.println("---------Salário dos vendedores:--------");
		System.out.println(fixo1.toString());
		System.out.println(fixo2.toString());
		
		System.out.println("------------Total Vendido:--------------");
		System.out.println("Total:" + totalVendido);
	}

}