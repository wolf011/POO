package exercicios;

public class Fatoriais {
	public static void main(String[]	args) {
		for (double j = 1.; j < 11.; j++) {
			System.out.println(j + "! = " + fatorial(j));
		}

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
