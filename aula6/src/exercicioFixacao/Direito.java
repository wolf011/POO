package exercicioFixacao;

public final class Direito extends Faculdade implements Oab, Eventos {
	private int tempoDuracao;

	
	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

		
	@Override
	public String toString() {
		return super.toString() + ", TempoDuracao:" + tempoDuracao;
	}


	public int getTempoDuracao() {
		return tempoDuracao;
	}

	
	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	
	@Override
	public String matrizCurricular() {
		return super.matrizCurricular();
	}

	
	@Override
	public void fazerMatricula() {
		super.fazerMatricula();
	}

	
	@Override
	public String programacao() {
		return null;
	}
	
	
	@Override
	public void conteudoEventos() {
		
	}
	
	
	@Override
	public boolean realizarProva() {
		return false;
	}
}
