package br.org.serratec;

public class TesteTime {

	public static void main(String[] args) {
        Time fluminense = new Time("Fluminense", "Renato Gaúcho", new Atleta[11]);
        Atleta atleta1 = new Atleta("Fábio", 44);
        Atleta atleta2 = new Atleta("Samuel Xavier", 34);
        Atleta atleta3 = new Atleta("Thiago Silva", 40);
        Atleta atleta4 = new Atleta("Marlon", 28);
        Atleta atleta5 = new Atleta("Marcelo", 37);
        Atleta atleta6 = new Atleta("André", 23);
        Atleta atleta7 = new Atleta("Renato Augusto", 36);
        Atleta atleta8 = new Atleta("Jhon Arias", 27);
        Atleta atleta9 = new Atleta("Germán Cano", 37);
        Atleta atleta10 = new Atleta("Keno", 35);
        Atleta atleta11 = new Atleta("Agustín Canobbio", 27);

        fluminense.adicionarAtleta(atleta1);
        fluminense.adicionarAtleta(atleta2);
        fluminense.adicionarAtleta(atleta3);
        fluminense.adicionarAtleta(atleta4);
        fluminense.adicionarAtleta(atleta5);
        fluminense.adicionarAtleta(atleta6);
        fluminense.adicionarAtleta(atleta7);
        fluminense.adicionarAtleta(atleta8);
        fluminense.adicionarAtleta(atleta9);
        fluminense.adicionarAtleta(atleta10);
        fluminense.adicionarAtleta(atleta11);
        
   fluminense.imprimirElenco();

    }
}