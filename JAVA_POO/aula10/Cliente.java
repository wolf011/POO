package aula10;

public class Cliente {
	 private int id;
	    private String nome;
	    private int idade;
	    private String telefone;

	    public Cliente(int id, String nome, int idade, String telefone) {
	        this.id = id;
	        this.nome = nome;
	        this.idade = idade;
	        this.telefone = telefone;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public String getTelefone() {
	        return telefone;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + id + "\nNome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone + "\n";
	    }
}
