package exercicios;

public class Livro {
	protected String titulo;
	protected String autor;
	protected Double preco;
	
	
	public Livro(String titulo, String autor, Double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}


	@Override
	public String toString() {
		return "Livro: " + titulo + ", autor: " + autor + ", preco: " + preco;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public Double getPreco() {
		return preco;
	}
}
