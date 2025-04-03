package exemplos;

public class Fatorial {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            long fatorial = calcularFatorial(i);
            System.out.println("O Fatorial de " + i + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

