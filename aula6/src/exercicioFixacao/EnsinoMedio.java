package exercicioFixacao;

public final class EnsinoMedio extends ColegioAplicacao {
	private int numeroAlunos;

	
	public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
	}

	
	@Override
	public void fazerMatricula() {
		super.fazerMatricula();
	}

	
	@Override
	public void reuniaoDePais() {
	}

}
