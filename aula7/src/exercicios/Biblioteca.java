package exercicios;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Biblioteca {
	private List<Livro> prateleira = new ArrayList<>();
	private String responsavel;
	

	public String getResponsavel() {
		return responsavel;
	}
	
	
	public List<Livro> getPrateleira() {
		return prateleira;
	}


	public void adicionar(Livro livro) {
		prateleira.add(livro);
	}
	
	
	public void listar() {
		for (Livro livro : prateleira) {
			System.out.println(livro);
		}
	}
	
	
	public int pesquisarFaixaDePreco(Double valorInicial, Double valorFinal) {
		List<Livro> livrosNoPreco = new ArrayList<Livro>();
		int qtd = 0;
		
		for (Livro livro : prateleira) {
			if (livro.preco >= valorInicial && livro.preco <= valorFinal) {
				qtd += 1;
				livrosNoPreco.add(livro);
			}
		}
		
		for (Livro livro : livrosNoPreco) {
			System.out.println(livro);
		}
		
		return qtd;
	}
	
	
	public Double calcularTotalLivros() {
		Double total = 0.;
		for (Livro livro : prateleira) {
			total += livro.preco;
		}
		return total;
	}

}
