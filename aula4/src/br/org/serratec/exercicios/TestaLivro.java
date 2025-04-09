package br.org.serratec.exercicios;

public class TestaLivro {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Marco Antônio", "Cisco CCNA", 85.);
		Livro livro2 = new Livro("Kathy Sierra", "Use a Cabeça Java", 98.);
		
		Operacao operacao1 = new Operacao("Venda", livro1);
		Operacao operacao2 = new Operacao("Emprestimo", livro2);
		
		
		livro1.reajuste(6.);
		operacao1.venderLivro();
		System.out.println(operacao1.toString());
		
		operacao2.emprestarLivro();
		System.out.println(operacao2.toString());
		
		
	}

}
