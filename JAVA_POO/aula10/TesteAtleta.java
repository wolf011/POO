package aula10;

public class TesteAtleta {
	
	public static void main(String[] args) {
		Time time = new Time("Flamengo");

	    Atleta atleta1 = new Atleta("Carlos Silva", 1);
	    Atleta atleta2 = new Atleta("Ana Souza", 2);
	    Atleta atleta3 = new Atleta("Felipe Oliveira", 3);
	    
	    time.adicionarAtleta(atleta1);
        time.adicionarAtleta(atleta2);
        time.adicionarAtleta(atleta3);
	    
        time.imprimirTime();
		
	}
    
    
}
