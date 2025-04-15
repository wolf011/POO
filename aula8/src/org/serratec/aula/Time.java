package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

public class Time {
	private String nome;
	private List<Atleta> atletas;
//	private Set<Atleta> time = new TreeSet<>();

	
	public Time(String nome) {
		this.nome = nome;
		atletas = new ArrayList<>();
	}


	@Override
	public String toString() {
		return "Time = " + nome;
	}


	public String getNome() {
		return nome;
	}


	public List<Atleta> getAtletas() {
		return atletas;
	}
	
	
	public void addAtleta(Atleta... jogador) {
//		atletas.add(jogador);
		atletas.addAll(Arrays.asList(jogador));
	}
	
	
}
