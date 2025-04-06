package academy.devdojo.maratonajava.introducao;


public class Aula32Arrays {
    public static void main(String[] args) {
    int [] idades = new int[3];  // tipo reference
    idades[0] = 1;
    idades[1] = 2;
    idades[2] = 3;
        System.out.println(idades[0]);

    int [] numeros = {1, 2, 3, 4, 5 , 6}; // Valor calculado de maneira automático
    int[] nomerus =  new int[] {1, 2, 3, 4, 5 , 6};

    //Percorre todos os espaços do array
    for(int num:numeros) {
        System.out.println();
    }

    }
}
