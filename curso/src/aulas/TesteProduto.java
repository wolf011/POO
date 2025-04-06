package aulas;

import java.util.Scanner;

public class TesteProduto {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String resposta = "s";
		
		do {
            System.out.print("Descrição do produto: ");
            String descricao = scanner.nextLine();

            System.out.print("Valor: ");
            double valor = scanner.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Produto produto = new Produto(descricao, valor, quantidade);
            produto.exibirDetalhes();

            System.out.print("Deseja encerrar o programa? (S/N): ");
            resposta = scanner.nextLine();
		} while (resposta.equalsIgnoreCase("s") );

		scanner.close();
	}

}
