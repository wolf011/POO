package org.serratec.revisao;

public class RevisaoException {

	public static void main(String[] args) {
		int [] vetor = {10, 20, 56, 90, 100};
		String a = null;
		int c = 10;
		int d = 0;
		
		try {
			System.out.println(vetor[0]/d);
			System.out.println(vetor[5]/c);
			System.out.println(a.equals("aula"));
		} catch (ArithmeticException e) {
			System.out.println("Divisão por zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("índice incorreto");
		} catch (NullPointerException e) {
			System.out.println("prâmetro nulo");
		}
		
	}

}
