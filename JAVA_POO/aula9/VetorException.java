package exemplos;

public class VetorException {
	public static void main(String[] args) {
		int[] vetor1 = { 1, 2, 3, 4, 5 };
		int[] vetor2 = { 3, 0, 2 };

		for (int i = 0; i < vetor1.length; i++) {
			if (i >= vetor2.length) {
				System.out.println("Erro: Índice do vetor1 fora do limite do vetor2.");
				break;
			}

			try {
				int resultado = vetor1[i] / vetor2[i];
				System.out.println("Resultado da divisão de " + vetor1[i] + " por " + vetor2[i] + " = " + resultado);
			} catch (ArithmeticException e) {
				System.out.println(
						"Erro: Tentativa de dividir " + vetor1[i] + " por " + vetor2[i] + " (divisão por zero).");
			} catch (Exception e) {
				System.out.println("Erro inesperado: " + e.getMessage());
			}
		}
	}
}