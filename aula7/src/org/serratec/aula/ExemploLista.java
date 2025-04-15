package org.serratec.aula;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploLista {

	public static void main(String[] args) {
//		É importante utilizar o polimorfismo nesse caso para podermos herdar os metodos da classe List.
		List<Object> lista = new ArrayList<>(); //Aceita qualquer tipo de dados;
//		
		lista.add("Fluminense");
//		lista.add(2);
		
		System.out.println("A lista está vazia? " + (lista.isEmpty()?"sim":"não"));

		List<String> times = new ArrayList<>(); //Aceita um tipo definido de dados;
		
		times.add("Fluminense");
		times.add("Vasco");
		times.add("Flamengo");
		times.add("Curitiba");
		times.add("Bangu");
		times.set(2, "Internacional");
		times.remove(2);
		
		System.out.println(times.get(0));
		System.out.println(times.size());
		System.out.println("A lista tem Botafogo? " + (times.contains("Botafogo")?"sim":"não"));

		System.out.println(times);
		Collections.sort(times);
		System.out.println(times);
		
		Aluno a1 =new Aluno("Adriana", 33, "ad@gmail.com");
		Aluno a2 =new Aluno("Brendon", 32, "bd@gmail.com");
		Aluno a3 =new Aluno("Carlos", 30, "CA@gmail.com");
		
		List<Aluno> alunos = Arrays.asList(a1, a2);
//		alunos.add(a3); //Não funciona porque os arrays são não incrementaveis, já que o tamanho da lista é final.
//		alunos.remove(0); //Nem removê-los.
		alunos.add(0, a3); //Mas é possível modificá-los.
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println("****************OF*****************");
		List<Aluno> alunosOf = List.of(a1, a2); // Não aceita valores nulos.
		alunosOf.set(0, a3);
		System.out.println(alunosOf);
		
	}

}
