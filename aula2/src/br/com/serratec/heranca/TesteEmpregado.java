package br.com.serratec.heranca;

public class TesteEmpregado {
	
	public static void main(String[] args) {
//		Polimorfismo:
		Gerente gerente = new Gerente("Alexia", "alexias@gmail.com", "(24)98658-7595", 5500., 10);
//		Empregado gerente = new Gerente("Alexia", "alexias@gmail.com", "(24)98658-7595", 5500., 10);
		Diretor diretor = new Diretor("Carlos", "ca@gmail.com", "223", 9000., "ADM");
		
		System.out.println(gerente.getNome() + " - " + gerente.getEmail());
		
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);
		System.out.println("Novo Salário: " + gerente.getSalario());
		System.out.println("Novo Salário: " + diretor.getSalario());
		

		
		System.out.println(gerente.toString());
		System.out.println(diretor.toString());
		
		System.out.println(diretor.getNome().equals(gerente.getNome()));
//		System.out.println(diretor.equals(gerente.getNome()));
		
	}
}
