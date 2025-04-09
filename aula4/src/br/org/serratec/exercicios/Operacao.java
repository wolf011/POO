package br.org.serratec.exercicios;

public class Operacao implements Livraria {
	private String tipo;
	private double valorOperacao;
	private Livro livro;
	
	
	public Operacao(String tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
	}

	
	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}


	public String getTipo() {
		return tipo;
	}


	public double getValorOperacao() {
		return valorOperacao;
	}


	@Override
	public void emprestarLivro() {
		valorOperacao = (livro.getValor()*2/100) + taxaEmprestimo;
	}

	@Override
	public void venderLivro() {
		livro.reajuste(9.);
		valorOperacao = livro.getValor();
	}


	@Override
	public String toString() {
//		return "Tipo: " + tipo + " Valor: " + valorOperacao + livro;
		return String.format("Tipo: %s Valor: %.2f %s", tipo, valorOperacao , livro);
	}
	
	

}
