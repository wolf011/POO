package br.org.serratec;

public class Casa extends Imovel {
	private Boolean garagem;

	
	public Casa(String local, Double valor, Proprietario proprietario, Boolean garagem) {
		super(local, valor, proprietario);
		this.garagem = garagem;
	}


	@Override
	public String toString() {
//		return super.toString() + "Tem garagem = " + (garagem==true?"Sim":"Não");
		return super.toString() + "Tem garagem = " + (garagem?"Sim":"Não"); // true é o padrão.
//		return super.toString() + "Tem garagem = " + (!garagem?"Sim":"Não"); //Nega tudo
	}
	
}
