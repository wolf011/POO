package org.serratec.exemplos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraGravacaoArquivo {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do arquivo: ");
			String nomeArquivo = sc.next();
			FileReader file = new FileReader(nomeArquivo);
			Scanner sc2 = new Scanner(file);
			List<Empregado> empregados = new ArrayList<>();
			
			
			while (sc2.hasNext()) {
				String linha = sc2.nextLine();
				if (!linha.isEmpty()) {
					String[] dados = linha.split(";");
					empregados.add(new Empregado(null, dados[1], dados[2], Double.parseDouble(dados[3])));
				}
			}
			
			sc2.close();
			sc.close();
			System.out.println("**********Dados importados do Arquivo*********");
//			for (Empregado empregado : empregados) {
//				System.out.println(empregado);
//			}
			
			//ForEach em uma única linha.
			empregados.forEach(empregado -> System.out.println(empregado));
//			empregados.forEach(empregado -> {System.out.println(empregado);System.out.println("teste");});
			
			
			FileWriter fw = new FileWriter("C:/curso/processado.csv");
			PrintWriter pw = new PrintWriter(fw);
			
			for (Empregado emp : empregados) {
//				String linha = emp.getNome() + ";" + emp.getProfissao() + ";" + emp.getSalario() + "\n";
				String linha = emp.toString() + "\n";
				
				pw.printf(linha);
			}
			pw.close();
			
		} catch (Exception e) {
			System.err.println("Arquivo não encontrado");
		}
	}

}
