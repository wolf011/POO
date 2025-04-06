package aulas;

public class TesteMedico {

	public static void main(String[] args) {
		Medico medico1 = new Medico("12345", "Ana Maria", 0., 250.);
		Medico medico2 = new Medico("456789", "Antônio", 0., 300.);
		
//		Consulta dinheiro?
		medico1.pagamentoDinheiro();

//		Consulta plano?
		medico2.pagamentoPlano();
		
//		Dados médicos 1:
		System.out.println("Nome: " + medico1.getNome() + "\nCRM: " + medico1.getCrm() + "\nSalario: " + medico1.getSalario());

//		Dados médicos 2:
		System.out.println("\nNome: " + medico2.getNome() + "\nCRM: " + medico2.getCrm() + "\nSalario: " + medico2.getSalario());
	}

}
