package org.serratec.aula;

public class TesteTime {

	public static void main(String[] args) {
		Time time = new Time("Fluminense");
		
		
		Atleta a1 = new Atleta("Fabio", 1.90);
		Atleta a2 = new Atleta("G. Cano", 1.65);
		Atleta a3 = new Atleta("T.Silva", 1.85);
		Atleta a4 = new Atleta("Lima", 1.80);
		Atleta a5 = new Atleta("Keno", 1.70);
		Atleta a6 = new Atleta("J.Arias", 1.85);
		
		time.addAtleta(a1);
		time.addAtleta(a2);
		time.addAtleta(a3);
		time.addAtleta(a4, a5, a6);
		
	}

}
