package aula11;

import java.util.Scanner;

public class TesteLivro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca("Antônio Silva");

		while (true) {
			System.out.println("\n---- Menu Biblioteca ----");
			System.out.println("1. Adicionar livro");
			System.out.println("2. Listar todos os livros");
			System.out.println("3. Pesquisar livros por faixa de preço");
			System.out.println("4. Calcular total em valor dos livros");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine(); 

			switch (opcao) {
			case 1:
				System.out.print("Digite o título do livro: ");
				String titulo = scanner.nextLine();
				System.out.print("Digite o autor do livro: ");
				String autor = scanner.nextLine();
				System.out.print("Digite o preço do livro: ");
				double preco = scanner.nextDouble();
				biblioteca.adicionarLivro(titulo, autor, preco);
				System.out.println("Livro adicionado com sucesso!");
				break;

			case 2:
				biblioteca.listarLivros();
				break;

			case 3:
				System.out.print("Digite o preço mínimo: ");
				double precoMinimo = scanner.nextDouble();
				System.out.print("Digite o preço máximo: ");
				double precoMaximo = scanner.nextDouble();
				biblioteca.pesquisarPorFaixaDePreco(precoMinimo, precoMaximo);
				break;

			case 4:
				double total = biblioteca.calcularTotalDeLivros();
				System.out.println("O valor total dos livros é: R$" + total);
				break;

			case 5:
				System.out.println("Saindo da biblioteca...");
				scanner.close();
				return;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}
}
