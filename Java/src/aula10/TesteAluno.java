package aula10;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		
//		Referência de Aluno
		Aluno a3 = new Aluno();
//		Outra referência distinta
		Aluno a4 = new Aluno();

//		Aluno a4 = a3;		// Aí eles ficariam iguais.
		
		System.out.println(a3);
		System.out.println(a4);
		if (a3 == a4) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
		
//		Modificador de acesso liberado
		a1.matricula = 10;
		a1.nome = "Hugo";
		a1.telefone= "2461-0997";
		
		a2.nome = "Roni";
		System.out.println(a1.nome);
		System.out.println(a2.nome);
	}

}
