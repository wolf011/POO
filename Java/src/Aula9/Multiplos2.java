package Aula9;

public class Multiplos2 {

	public static void main(String[] args) {
		int totalMultiplos = 0;
		System.out.println("Percorrendo números de 1 até 22:");

		for (int i = 1; i <= 22; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ": Java");
				totalMultiplos++;
			}
		}
		System.out.println("Total de múltiplos de 2 encontrados: " + totalMultiplos);
	}
}
