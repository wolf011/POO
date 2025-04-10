package exercicioFixacao;

public class Faculdade extends Universidade{
	protected String nomeFaculdade;
	protected int bloco;
	
	
	public Faculdade(String nome, String nomeFaculdade, int bloco) {
		super(nome);
		this.nomeFaculdade = nomeFaculdade;
		this.bloco = bloco;
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Faculdade: " + nomeFaculdade + ", bloco: " + bloco;
	}


	@Override
	public void fazerMatricula() {
		
	}


	public String getNomeFaculdade() {
		return nomeFaculdade;
	}


	public int getBloco() {
		return bloco;
	}

	
	public String matrizCurricular() {
		return "string";
	}
	
	
}
