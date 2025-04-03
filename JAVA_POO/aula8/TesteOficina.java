package aula8;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario proprietario = new Proprietario("Joaquim");
		Veiculo veiculo = new Carro("Sandero", 0,LocalDate.of(2025, 9, 9), proprietario, "Hatch");
		
		veiculo.trocarOleo();
		veiculo.revisao();
		
		System.out.println("Proprietário:" + proprietario.getNome());
		System.out.println("Veículo:"+ veiculo.toString());
	}

}
