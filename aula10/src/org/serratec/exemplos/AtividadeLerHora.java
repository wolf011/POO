package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class AtividadeLerHora {
// Faça um programa para ler uma data no formato dd/MM/yyyy e apresente ela no formato yyyyMMdd
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a dara desejada no formato dd/MM/yyyy: ");
		String lerData = sc.nextLine();
		
		DateTimeFormatter dataIn = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.parse(lerData, dataIn);
		System.out.println(data);

		DateTimeFormatter dataOut = DateTimeFormatter.ofPattern("yyyyMMdd");
		System.out.println(data.format(dataOut));
		
		sc.close();
		
	}

}
