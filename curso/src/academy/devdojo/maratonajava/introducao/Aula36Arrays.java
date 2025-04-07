package academy.devdojo.maratonajava.introducao;

public class Aula36Arrays {
	public static void main(String[] args) {
		int[][] dias = new int[2][2];
		dias[0][0] = 31;
		dias[0][1] = 28;

		dias[1][0] = 31;
		dias[1][1] = 28;

        for (int i = 0; i< dias.length; i++){
            for (int j = 0; j< dias[0].length; j++){
                System.out.println(dias[i][j]);
            }

        }
//		Foreach
		for (int[] arrBase : dias) {
			for (int num : arrBase) {
				System.out.println(num);
			}
		}

//        Concatenando arrays de diferentes tamanho
		int[][] arrayInt = new int[3][];

		arrayInt[0] = new int[2];
		arrayInt[1] = new int[] { 1, 2, 3 };
		arrayInt[2] = new int[] { 6, 5, 4, 3, 2, 1 };

		for (int[] arrayBase : arrayInt) {
			System.out.println("\n-----");
			for (int num : arrayBase) {
				System.out.print(num + " ");
				
			}
		}
	}
}