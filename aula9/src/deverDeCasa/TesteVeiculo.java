package deverDeCasa;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public final class TesteVeiculo {
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		Map<String, Veiculo> automoveis = new HashMap<>();
		
		
		try {
			menu(automoveis);
		} catch (InputMismatchException e) {
			System.out.println("Erro! A ultima entrada de dados está incorreta com os tipos de dados aceitos");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		
	}
	
	
	public static void preencherMapa(Map<String, Veiculo> mapas) throws InputMismatchException {
		while (true) {
			System.out.println("Adicione os dados do seu verículo: ");
			System.out.println("Marca: ");
			String marca = sc.nextLine();
			System.out.println("Modelo: ");
			String modelo = sc.nextLine();
			System.out.println("Placa: ");
			String placa = sc.nextLine();
			System.out.println("Ano: ");
			Integer ano = sc.nextInt();
			sc.nextLine();
			
			Veiculo meioDeTransporte = new Veiculo(marca, modelo, ano); 
			mapas.put(placa, meioDeTransporte);
			
			System.out.println("Continuar? (S/N)");
			String op = sc.nextLine();
			if (op.equalsIgnoreCase("n")) {
				break;
			}
		}
	}
	
	
	public static void pesquisarAutomoveis(Map<String, Veiculo> mapas) throws InputMismatchException{
		while (true) {
			System.out.println("Qual a placa do automóvel que você procura?");
			String plc = sc.nextLine();
			
			if(!mapas.containsKey(plc)) {
				System.out.println("Automóvel com a placa " + plc + " Não encontrado!");
			} else {
				System.out.println(mapas.get(plc));
			}
			
			System.out.println("Continuar? (S/N)");
			String op = sc.nextLine();
			if (op.equalsIgnoreCase("n")) {
				break;
			}	
		}
	}
	
	
	public static void menu(Map<String, Veiculo> mapas) throws InputMismatchException {
		
		Integer op = 0;
		while (op != 3) {
			System.out.println("----------MENU--------");
			System.out.println("1 - Adicionar um automóvel");
			System.out.println("2 - Pesquisar automóvel p/placa");
			System.out.println("3 - Finalizar o código");
			System.out.println("----------------------");
			System.out.println("\nInsira a sua opção: ");
			op = sc.nextInt();
			sc.nextLine();
			
			switch (op) {
			case 1: 
				preencherMapa(mapas);
				break;
			case 2:
				pesquisarAutomoveis(mapas);
				break;
			case 3:
				System.out.println("Programa finalizado com sucesso!");
				break;
			default:
			throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
	}

	
}



