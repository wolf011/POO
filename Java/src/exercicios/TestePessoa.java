package exercicios;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		
		
		p1.nome = "HUGO";
		p1.altura = 1.75;
		p1.peso = 65;
		
		p2.nome = "Alexia";
		p2.altura = 1.65;
		p2.peso = 65;

		p3.nome = "Lucas";
		p3.altura = 1.80;
		p3.peso = 72;

		p4.nome = "Dayane";
		p4.altura = 1.75;
		p4.peso = 65;
		
		double mediaPeso = (p1.peso + p2.peso + p3.peso + p4.peso)/4;
		double mediaAltura = (p1.altura + p2.altura + p3.altura + p4.altura)/4;
		
		double pesoMax = 0;
		String nome1 = "teste";
		for (int i = 0; i < 4; i++) {
			if (pesoMax<p1.peso) {
				pesoMax = p1.peso;
				nome1 = p1.nome;
			} else if (pesoMax<p2.peso) {
				pesoMax = p2.peso;
				nome1 = p2.nome;
			} else if (pesoMax<p3.peso) {
				pesoMax = p3.peso;
				nome1 = p3.nome;
			} else if (pesoMax<p4.peso) {
				pesoMax = p4.peso;
				nome1 = p4.nome;
			}
		}
			
			double alturaMax = 0;
			String nome2 = "teste";
			for (int j = 0; j < 4; j++) {
				if (alturaMax<p1.altura) {
					alturaMax = p1.altura;
					nome2 = p1.nome;
				} else if (alturaMax<p2.altura) {
					alturaMax = p2.altura;
					nome2 = p2.nome;
				} else if (alturaMax<p3.altura) {
					alturaMax = p3.altura;
					nome2 = p3.nome;
				} else if (alturaMax<p4.altura) {
					alturaMax = p4.altura;
					nome2 = p4.nome;
				}
			}
			
			System.out.println(nome1 + " é a pessoa mais pesada com " + pesoMax + "kg.");
			System.out.println(nome2 + " é a pessoa mais alta com " + alturaMax + "m.");
			
			System.out.println("A média de peso das pessoas é: " + mediaPeso + " kg.");
			System.out.println("A média de alturas das pessoas é: " + mediaAltura + " m.");
	
		}
	}

