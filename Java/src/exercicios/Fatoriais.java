package exercicios;

public class Fatoriais {
	public static void main(String[] args) {
		System.out.println(fatorial(1));
		System.out.println(fatorial(2));
		System.out.println(fatorial(3));
	}

	public static double fatorial(double a) {

		if (a == 0.0) {
			return 1.0;

		} else if (a < 0.0) {
			System.out.println("Valor inválido!");
			return a;

		} else {

			double b = a;
			for (double i = a - 1; i > 0; i--) {
				b *= i;
			}
			return b;
		}

	}
}
