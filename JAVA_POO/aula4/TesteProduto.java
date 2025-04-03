package exemplos;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char resposta;
		double total=0, totalGeral=0;
		do {
			System.out.print("Descrição do produto: ");
			String descricao = scanner.nextLine();

			System.out.print("Valor do produto: ");
			double valor = scanner.nextDouble();

			System.out.print("Quantidade: ");
			int quantidade = scanner.nextInt();
			scanner.nextLine(); // Consumir a quebra de linha

			Produto produto = new Produto(descricao, valor, quantidade);

			System.out.println("\nProduto cadastrado:");
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Valor unitário: R$ " + produto.getValor());
			System.out.println("Quantidade: " + produto.getQuantidade());
			

			System.out.println("ICMS total: R$ " + produto.calcularIcms());
			System.out.print("Deseja cadastrar outro produto? (S/N): ");
			resposta = scanner.next().charAt(0);
			
		} while (resposta == 'S' || resposta == 's');

		System.out.println("Cadastro finalizado.");
		scanner.close();
	}

}
