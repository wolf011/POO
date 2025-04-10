package org.serratec.exemplos;

/*
* final na classe não pode ter filhos
*public final class Policial {
*/

public class Policial {
	protected String nome;
//	protected final String LOTACAO = "Brasília";

	
	protected final String LOTACAO;
//	Quando existe um construtor que menciona a sua costante você não precisa iniciá-la.
	public Policial(String nome, String lOTACAO) {
		this.nome = nome;
		LOTACAO = lOTACAO;
	}


//	Métodos com final não podem ser sobrescritos.
	public final void imprimir() {
		System.out.println("Dados do Policial!");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLOTACAO() {
		return LOTACAO;
	}
	
	
//	Não é possível criar o método setLOTACAO pois o atributo foi definido como constante.
}
