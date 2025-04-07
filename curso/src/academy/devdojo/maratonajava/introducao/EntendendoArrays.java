package academy.devdojo.maratonajava.introducao;

public class EntendendoArrays {

	public static void main(String[] args) {
		matrix(2, 2);
	}
	
	public static int[][] matrix (int  lin, int col) {
		int [][] matriz = new int [lin][col];
		int n = 0;
		for (int[] arrayBase : matriz) {
			for (int number : arrayBase) {
				n += 1;
				number = n;
//				System.out.println(arrayBase);
				System.out.println(number);
			}
		}
		return matriz;
		
	}

}
