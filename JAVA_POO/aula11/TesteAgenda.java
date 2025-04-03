package aula11;

public class TesteAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.inserir("João", "1234-5678");
		agenda.inserir("Maria", "9876-5432");
		agenda.inserir("Pedro", "1111-2222");
		agenda.inserir("Ana", "3333-4444");
		agenda.inserir("Carlos", "5555-6666");

		agenda.listarContatos();

		System.out.println("Telefone de João: " + agenda.buscar("João"));
		System.out.println("Telefone de Paula: " + agenda.buscar("Paula"));

		agenda.remover("Ana");
		agenda.remover("Paula");

		System.out.println("Total de contatos na agenda: " + agenda.tamanho());

		agenda.listarContatos();
	}
}
