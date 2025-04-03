package aula10;

import java.util.ArrayList;
import java.util.List;

public class TesteAluno {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>();

		try {
			alunos.add(new Aluno("João", 8.0, 9.0));
			alunos.add(new Aluno("Maria", 10.0, 7.5));
			alunos.add(new Aluno("Lucas", -1.0, 11.0));
			alunos.add(new Aluno("Pedro", 5.5, 6.0));


		} catch (AlunoException e) {
			System.out.println("Erro ao criar aluno: " + e.getMessage());
		}

		for (Aluno aluno : alunos) {
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Nota 1: " + aluno.getNota1());
			System.out.println("Nota 2: " + aluno.getNota2());
			System.out.println("Média: " + aluno.calcularMedia());
			System.out.println("----------------------------------");
		}
	}

}
