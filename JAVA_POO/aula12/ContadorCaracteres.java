package aula12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorCaracteres {
	 public static int contarCaracteres(String nomeArquivo) {
	        int quantidadeCaracteres = 0;

	        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
	            String linha;
	            while ((linha = br.readLine()) != null) {
	                quantidadeCaracteres += linha.length();
	            }
	        } catch (IOException e) {
	            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	        
	        return quantidadeCaracteres;
	    }

	    public static void main(String[] args) {
	        String nomeArquivo = "exemplo.txt"; 
	        int quantidade = contarCaracteres(nomeArquivo);
	        System.out.println("A quantidade de caracteres no arquivo é: " + quantidade);
	    }
}
