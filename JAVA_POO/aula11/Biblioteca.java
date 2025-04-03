package aula11;

import java.util.ArrayList;

public class Biblioteca {
	private String responsavel;
	private ArrayList<Livro> livros = new ArrayList<Livro>();

	public Biblioteca(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getResponsavel() {
		return responsavel;

	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	// Método para adicionar um novo livro
	public void adicionarLivro(String titulo, String autor, double preco) {
		Livro livro = new Livro(titulo, autor, preco);
		livros.add(livro);
	}

	// Método para listar todos os livros
	public void listarLivros() {
		if (livros.isEmpty()) {
			System.out.println("A biblioteca está vazia.");
		} else {
			System.out.println("Lista de livros:");
			for (Livro livro : livros) {
				System.out.println(livro);
			}
		}
	}

	// Método para pesquisar livros por faixa de preço
	public void pesquisarPorFaixaDePreco(double precoMinimo, double precoMaximo) {
		boolean encontrou = false;
		for (Livro livro : livros) {
			if (livro.getPreco() >= precoMinimo && livro.getPreco() <= precoMaximo) {
				System.out.println(livro);
				encontrou = true;
			}
		}
		if (!encontrou) {
			System.out.println("Nenhum livro encontrado na faixa de preço informada.");
		}
	}

	// Método para calcular o total de preços dos livros
	public double calcularTotalDeLivros() {
		double total = 0;
		for (Livro livro : livros) {
			total += livro.getPreco();
		}
		return total;
	}
}
