package exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Amarildo",5000);
		Funcionario f2 = new Funcionario("Ana",2890);
		
		
		System.out.println(f1.getNome());
		System.out.println(f2.getNome());
		System.out.println("Total Geral de Funcionarios:" + Funcionario.getContador());
	}

}
