package br.org.serratec.exercicios;

public class Atleta implements Olimpiadas {
	private String nome;
	private Double peso;
	private String modalidade;
	private int totalParticipantes;
	private Pais pais;
	static int contador = 0;
	
	
	public Atleta(String nome, Double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		contador += 1;
	}

	
	@Override
	public String verificaSituacao() {
		if (peso > 90) {
			modalidade = "peso pesado";
			return " Participará";
		}else if (peso > 60) {
			modalidade = "Peso médio";
			return " Participará";
		} else {
			return " não está apto a participar";
		}
	}
	
	
	public String getModalidade() {
		return modalidade;
	}


	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}


	public String getNome() {
		return nome;
	}


	public Double getPeso() {
		return peso;
	}


	public int getTotalParticipantes() {
		return totalParticipantes;
	}


	public Pais getPais() {
		return pais;
	}
	
	
	public static String getContador() {
		return "Total de participantes: " + contador;
	}


	@Override
	public String toString() {
		return "O atleta " + nome + verificaSituacao();
	}
	

	
	
}
