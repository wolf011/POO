package exemplos;

import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        String nome, nomeMaiorPeso = "", nomeMaiorAltura = "";
        double peso, altura;
        double maiorPeso = 0, maiorAltura = 0;
        double somaPesos = 0, somaAlturas = 0;
        int totalPessoas = 4;

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            nome = scanner.nextLine();
            
            System.out.println("Digite o peso de " + nome + " (kg):");
            peso = scanner.nextDouble();
            
            System.out.println("Digite a altura de " + nome + " (m):");
            altura = scanner.nextDouble();
            scanner.nextLine();
            
            if (peso > maiorPeso) {
                maiorPeso = peso;
                nomeMaiorPeso = nome;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaiorAltura = nome;
            }

            somaPesos += peso;
            somaAlturas += altura;
        }
        
        double mediaPeso = somaPesos / totalPessoas;
        double mediaAltura = somaAlturas / totalPessoas;
        
        System.out.println("\nResultados:");
        System.out.println("Pessoa com maior peso: " + nomeMaiorPeso + " (" + maiorPeso + " kg)");
        System.out.println("Pessoa com maior altura: " + nomeMaiorAltura + " (" + maiorAltura + " m)");
        System.out.println("Média de peso: " + mediaPeso + " kg");
        System.out.println("Média de altura: " + mediaAltura + " m");
        scanner.close();
    }
}
