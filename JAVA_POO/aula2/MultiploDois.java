package testes;
public class MultiploDois {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 1; i <= 22; i++) {
            if (i % 2 == 0) {
                System.out.println("Java");
                contador++; 
            }
        }
        System.out.println("Total de múltiplos de 2 encontrados: " + contador);
    }
}
