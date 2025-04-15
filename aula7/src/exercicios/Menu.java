package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		try {
			menu();
		} catch (InputMismatchException e) {
			System.out.println("Erro! Dados informados incompatíveis com o último campo preenchido.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void menu() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		Biblioteca cdc = new Biblioteca();
		boolean on = true;
		
		while(on == true) {
			System.out.println("----------MENU----------");
			System.out.println("1 - Listar livros");
			System.out.println("2 - Adicionar livros");
			System.out.println("3 - Pesquisar Faixa de Preços");
			System.out.println("4 - Calcular o valor total de livros da biblioteca");
			System.out.println("5 - Finalizar");
			System.out.println("\nInsira sua opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcao) {
			case 1: {
				cdc.listar();
				break;
			} 
			
			case 2: {
				System.out.println("Título: ");
				String titulo = sc.nextLine();
				System.out.println("Autor: ");
				String autor = sc.nextLine();
				System.out.println("Preço: ");
				Double preco = sc.nextDouble();
				sc.nextLine();
				Livro livro = new Livro(titulo, autor, preco);
				cdc.adicionar(livro);
				break;
			} 
			
			case 3: {
				System.out.println("Insira o valor mínimo: ");
				Double min = sc.nextDouble();
				
				System.out.println("Insira o valor máximo: ");
				Double max = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Existem " + cdc.pesquisarFaixaDePreco(min, max) + " nessa faixa de preço.");
				break;
			}
			
			case 4: {
				System.out.println("O valor total de livros nessa biblioteca é: R$ " + cdc.calcularTotalLivros());
				break;
			}
			case 5: {
				System.out.println("Programa finalizado com sucesso!");
				on = false;
				sc.close();
				break;
				
			}
			
			default:
				throw new IllegalArgumentException("A opção " + opcao + " não existe!");
			}
		}
	}
	
}
