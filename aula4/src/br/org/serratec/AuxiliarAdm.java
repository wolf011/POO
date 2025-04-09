package br.org.serratec;


public class AuxiliarAdm extends Auxiliar {

	
	public AuxiliarAdm(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario, categoria);
	}

	
	// Como esse auxiliar não é abstract ele é obrigado a seguir as regras mesmo sendo "filho" da classe auxiliar.
	@Override
	public void reajusteSalarial(Double valor) {

	}

}
