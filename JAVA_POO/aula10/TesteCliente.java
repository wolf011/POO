package aula10;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<>();

		while (true) {
			System.out.print("Digite o ID do cliente (ou número negativo para sair): ");
			int id = scanner.nextInt();

			if (id < 0) {
				break;
			}

			scanner.nextLine();

			System.out.print("Digite o nome do cliente: ");
			String nome = scanner.nextLine();

			System.out.print("Digite a idade do cliente: ");
			int idade = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Digite o telefone do cliente: ");
			String telefone = scanner.nextLine();

			Cliente cliente = new Cliente(id, nome, idade, telefone);
			clientes.add(cliente);
		}

		System.out.println("\nDados dos clientes cadastrados:");
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
			System.out.println("--------------------------------");
		}

		scanner.close();
	}
}
