package testes;

public class Multiplicacao {
    public static void main(String[] args) {
        int numero = 2;
        
        System.out.println("Tabela de multiplicação do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
