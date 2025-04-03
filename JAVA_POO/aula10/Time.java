package aula10;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private List<Atleta> atletas = new ArrayList<Atleta>();

	public Time(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", atletas=" + atletas + "]";
	}

	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}

	public void adicionarAtleta(Atleta atleta) {
		this.atletas.add(atleta);
	}

	public void imprimirTime() {
		System.out.println("Nome do Time: " + nome);
		System.out.println("Atletas:");
		for (Atleta atleta : atletas) {
			System.out.println(atleta);
		}
	}
}