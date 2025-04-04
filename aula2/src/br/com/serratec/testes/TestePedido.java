package br.com.serratec.testes;

import java.time.LocalDate;

import br.com.serratec.exemplos.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(1, LocalDate.of(2025, 02, 03), 2000., 2);

		System.out.println("N°Pedido:" + p1.getNumero() + " Total:" + p1.getTotal());

	}

}
