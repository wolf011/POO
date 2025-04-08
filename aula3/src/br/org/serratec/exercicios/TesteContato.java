package br.org.serratec.exercicios;

import java.util.Scanner;

public class TesteContato {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

//	Nome:
	System.out.println("Insira seu nome: ");
	String nomeUsuario = scan.nextLine();
		

//	Endereço:		
		
		System.out.println("Digite seu Bairro: ");
		String bairro = scan.nextLine();
		
		System.out.println("Digite sua rua: ");
		String rua = scan.nextLine();
		
		System.out.println("Digite seu CEP: ");
		String cep = scan.nextLine();
		

		System.out.println("Digite seu Município: ");
		String Mun = scan.nextLine(); 


		System.out.println("Digite seu Estado: ");
		String UF1 = scan.nextLine();
		System.out.println("Digite seu UF: ");
		String UF2 = scan.nextLine(); 
		
		Estado estado = new Estado(UF1, UF2);     
        Cidade cidade = new Cidade(Mun, estado);    
        Endereco endereco = new Endereco(rua, bairro, cep, cidade);

        
// Telefones:
        
        int qtdTel;
        while(true) {
        	System.out.println("Quantos telefone você irá registrar:");
        	qtdTel = scan.nextInt();
        	if (qtdTel <= 0) {
        		System.out.println("É preciso inserir pelo menos um telefone válido.\n");
        	} else {
        		break;
        	}
        }
        
        scan.nextLine();      // Consome a quebra de linha.
        	
        Contato contato = new Contato(nomeUsuario, endereco, new Telefone[qtdTel]);
        for(int i = 0; i < qtdTel; i++) {
        	System.out.println("Insira o " + (i+1) +"º telefone: ");
        	String entradaTel = scan.nextLine();
        	Telefone t = new Telefone (entradaTel);
        	contato.adicionarTelefone(t);
        	
        }
        
        System.out.println(contato.toString());
        contato.getTelefones();
    }
}

