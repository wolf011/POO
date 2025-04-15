package org.serratec.aula;

import java.util.Set;
import java.util.TreeSet;

public class TesteAluno2 {

	public static void main(String[] args) {
		Set<Aluno> alunos = new TreeSet<>();
		alunos.add(new Aluno("Anotnio", "ant@gamil", 45));
		alunos.add(new Aluno("Maria", "maria@email.com", 22));
		alunos.add(new Aluno("Carlos", "carlos123@hotmail.com", 19));
		alunos.add(new Aluno("Juliana", "ju.liana@outlook.com", 25));
		alunos.add(new Aluno("Pedro", "pedro.silva@yahoo.com", 20));
		alunos.add(new Aluno("Fernanda", "feernanda@faculdade.edu", 23));
		
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}

}
