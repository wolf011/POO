package aula10;

public class Vetor {

	public static void main(String[] args) {
		String[] vetor = new String[5];
		String[] times = new String[] { "Fluminense", "Vasco", "Flamengo" };
		vetor[0] = "Amarelo";
//		vetor[1] = "Vermelho";
		vetor[2] = "Verde";
//		vetor[3] = "Vermelho";
		vetor[4] = "Vermelho";

		System.out.println(vetor[0]);
		System.out.println(vetor[1]);

		for (int i = 0; i < times.length; i++) {
			System.out.println(times[i]);
		}

	}

}
