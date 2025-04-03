package exemplos;

public class TesteCalculo {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        
        int resultado = soma.operacao(10, 20);
        System.out.println("Resultado da soma: " + resultado);
    }
}

