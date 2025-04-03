package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;

	public Contato(String nome, List<Telefone> telefones, Endereco endereco) {
		super();
		this.nome = nome;
		this.telefones = new ArrayList<>();
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionarTelefone(Telefone telefone) {
		telefones.add(telefone);
	}
}
