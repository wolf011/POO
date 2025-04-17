package org.serratec.exemplos;

import java.io.File;
import java.util.Scanner;

public class LerArquivoPasta {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o caminho da pasta ou arquivo: ");
		String nome = sc.nextLine();
		
		File file = new File(nome);
		
		if (file.exists()) {
			if (file.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d ", file.getName(), file.length());
			} else {
				System.out.println("Conteúdo da pasta: ");
				for (File arquivo : file.listFiles()) {
					System.out.println(arquivo);
				}
			}
		} else {
			System.out.println("Arquivo/pasta não encontrado(a)!");
		}
		sc.close();
	}

}
