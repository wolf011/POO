package aula8;

import java.util.Date;

public class Pedido {
	private Date dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;

	public Pedido(Bebida bebida, Sanduiche sanduiche) {
		this.dataPedido = new Date(); // Define a data do pedido como a data atual
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	// Método para calcular o total do pedido
	public double calcularTotal() {
		return bebida.getValor() + sanduiche.getValor();
	}

	// Método para imprimir o cardápio
	public static void imprimirCardapio() {
		System.out.println("Cardápio de Bebidas:");
		for (Bebida bebida : Bebida.values()) {
			System.out.println(bebida.getTipo() + " - R$ " + bebida.getValor());
		}

		System.out.println("\nCardápio de Sanduíches:");
		for (Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println(sanduiche.getTipo() + " - R$ " + sanduiche.getValor());
		}
	}

	// Método para exibir os dados do pedido
	public void exibirPedido() {
		System.out.println("Pedido realizado em: " + dataPedido);
		System.out.println("Bebida: " + bebida.getTipo() + " - R$ " + bebida.getValor());
		System.out.println("Sanduíche: " + sanduiche.getTipo() + " - R$ " + sanduiche.getValor());
		System.out.println("Total: R$ " + calcularTotal());
	}
}
