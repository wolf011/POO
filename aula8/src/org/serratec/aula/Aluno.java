package org.serratec.aula;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
	private String nome;
	private String email;
	private Integer idade;
	
	
	public Aluno(String nome, String email, Integer idade) {
		super();
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public Integer getIdade() {
		return idade;
	}

// Para HashSet
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(email, other.email);
	}

// Para TreeSet
	@Override
	public int compareTo(Aluno o) {
//		return idade.compareTo(o.idade); // crescente
		return o.idade.compareTo(idade); // decrescente
	}

	
}
