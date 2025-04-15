package org.serratec.homework;

import java.util.*; //JV

public class TesteCliente {
	static List<Cliente> clientela = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Integer id = 0;
		while (id >= 0) {

			System.out.println("Escreva o nº de ID do cliente: ");
			id = sc.nextInt();
			if (id < 0) {
				continue;
			}
			sc.nextLine();

			System.out.println("Escreva o nome do cliente: ");
			String nome = sc.nextLine();
			
			System.out.println("Escreva a idade do cliente: ");
			Integer idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Escreva o telefone do cliente: ");
			String telefone = sc.nextLine();
			
			Cliente cl = new Cliente(id, nome, idade, telefone);
			addClientes(cl);
			
		}
		
		
		for (Cliente cliente : clientela) {
			System.out.println(cliente);
		}
		
		
	}
	
	
	public static void addClientes(Cliente c) {
		clientela.add(c);
		
	}

}
