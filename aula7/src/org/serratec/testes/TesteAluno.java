package org.serratec.testes;

import java.util.Scanner;

import org.serratec.aula.Aluno;

public class TesteAluno {

	public static void main(String[] args) {
//		Aluno [] alunos = {new Aluno("Marcos", 40, "m@gmail.com")};
		Aluno[] alunos = new Aluno[3];
		Scanner sc = new Scanner(System.in);
			for (int i = 0; i < alunos.length; i++) {
				System.out.println("Digite o nome do aluno " + (i+1) + ": ");
				String nome = sc.nextLine(); 
				
				Integer idade = 0;
				try {
				System.out.println("Digite a idade do aluno " + (i+1) + ": ");
				idade = sc.nextInt();
				throw new Exception("Valor errado");
				} catch (Exception e) {
					System.out.println("Valor inválido");
				
				} finally {
					sc.nextLine(); //Consome linha.
					System.out.println("Digite o email do aluno " + (i+1) + ": ");
					String email = sc.nextLine();
					
					alunos[i] = new Aluno(nome, idade, email);
				
			}

			//		Impressão
			for (Aluno aluno : alunos) {
				System.out.println(aluno);
			
		
			}
		}
	}
}
