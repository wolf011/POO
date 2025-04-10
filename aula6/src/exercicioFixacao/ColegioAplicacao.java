package exercicioFixacao;

public abstract class ColegioAplicacao extends Universidade {
	protected String nomeCoordenador;
	
		
	public ColegioAplicacao(String nome, String nomeCoordenador) {
		super(nome);
		this.nomeCoordenador = nomeCoordenador;
	}


	@Override
	public void fazerMatricula() {
	}

	
	public abstract void reuniaoDePais();
}
