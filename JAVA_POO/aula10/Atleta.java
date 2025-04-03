package aula10;

public class Atleta {
	private String nome;
	private int id;

	public Atleta(String nome, int id) {
		super();
		this.nome = nome;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", id=" + id + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
