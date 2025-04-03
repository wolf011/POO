package exemplos;

public class Endereco {
	private String rua;
	private String numero;
	private Cidade cidade;

	public Endereco(String rua, String numero, Cidade cidade) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}
