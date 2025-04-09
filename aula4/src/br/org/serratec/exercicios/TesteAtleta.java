package br.org.serratec.exercicios;

public class TesteAtleta {

	public static void main(String[] args) {
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");
		
		
		Atleta a1 =  new Atleta("Anderson Silva", 98., pais1);
		Atleta a2 =  new Atleta("Jon Jones", 59., pais2);
		Atleta a3 =  new Atleta("Vitor Belfort", 110., pais1);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		System.out.println(Atleta.getContador());

	}

}
