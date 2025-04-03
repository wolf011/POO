package aula11;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
	private Map<String, String> agenda;

	public Agenda() {
		agenda = new HashMap<>();
	}

	public void inserir(String nome, String telefone) {
		agenda.put(nome, telefone);
		System.out.println("Contato " + nome + " adicionado com sucesso!");
	}

	public String buscar(String nome) {
		if (agenda.containsKey(nome)) {
			return agenda.get(nome);
		} else {
			return "Contato não encontrado!";
		}
	}

	public void remover(String nome) {
		if (agenda.containsKey(nome)) {
			agenda.remove(nome);
			System.out.println("Contato " + nome + " removido com sucesso!");
		} else {
			System.out.println("Contato não encontrado para remoção!");
		}
	}

	public int tamanho() {
		return agenda.size();
	}

	public void listarContatos() {
		if (agenda.isEmpty()) {
			System.out.println("A agenda está vazia.");
		} else {
			System.out.println("Contatos na agenda:");
			for (Map.Entry<String, String> entry : agenda.entrySet()) {
				System.out.println("Nome: " + entry.getKey() + ", Telefone: " + entry.getValue());
			}
		}
	}
}
