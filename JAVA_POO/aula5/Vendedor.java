package exemplos;

public class Vendedor {
	protected String nome;
	protected String cpf;

	public Vendedor(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
