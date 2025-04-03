package aula8;

public class TestePedido {
	public static void main(String[] args) {
		// Imprime o cardápio
		Pedido.imprimirCardapio();

		// Criando um pedido
		Pedido pedido = new Pedido(Bebida.REFRIGERANTE, Sanduiche.HAMBURGUER);

		// Exibindo os dados do pedido
		System.out.println("\nDetalhes do Pedido:");
		pedido.exibirPedido();
	}
}
