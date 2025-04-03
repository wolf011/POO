package exercicios;

import java.util.Scanner;
//JOptionpane

public class TesteProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
//		Construtor Default - implícito
		Produto p2 = new Produto(2, "Celular", 1000);
//						new Produto();

		System.out.println("Descrição:");
		String descricao = sc.next();
		System.out.println("Valor:");
		double valor = sc.nextDouble();
		
		p1.setDescricao(descricao);
		p1.setValor(valor);
		
		System.out.println(p1.getDescricao() + "-" + p1.getValor());

		//	Variáveis locais
		int a = 0;
		if (a == 0) {
			// variável local
			int c = 10;
		}
	}

}
