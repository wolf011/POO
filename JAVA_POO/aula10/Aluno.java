package aula10;

public class Aluno {
	  private String nome;
	    private double nota1;
	    private double nota2;

	    // Construtor
	    public Aluno(String nome, double nota1, double nota2) throws AlunoException {
	        this.nome = nome;
	        setNota1(nota1);  // Definindo a primeira nota
	        setNota2(nota2);  // Definindo a segunda nota
	    }

	    // Getters
	    public String getNome() {
	        return nome;
	    }

	    public double getNota1() {
	        return nota1;
	    }

	    public double getNota2() {
	        return nota2;
	    }

	    // Métodos para configurar as notas com validação
	    public void setNota1(double nota1) throws AlunoException {
	        if (nota1 < 0 || nota1 > 10) {
	            throw new AlunoException("Nota 1 inválida. Deve ser entre 0 e 10.");
	        }
	        this.nota1 = nota1;
	    }

	    public void setNota2(double nota2) throws AlunoException {
	        if (nota2 < 0 || nota2 > 10) {
	            throw new AlunoException("Nota 2 inválida. Deve ser entre 0 e 10.");
	        }
	        this.nota2 = nota2;
	    }

	    // Método para calcular a média
	    public double calcularMedia() {
	        return (nota1 + nota2) / 2;
	    }
}
