package Exercicios;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		Veiculo v2 = new Veiculo();

		veiculo.placa = "LZX9090";
//		veiculo.tipo = "Flex";
		veiculo.tipo = "flex";
		veiculo.valor = 20000;

		v2.placa = "KYZ1080";
		v2.tipo = "Gás";
		v2.valor = 40600;

//Isso aqui é desnecessário visto que as variáveis estão definidas no escopo global de onte está o método.
//		v1.ipva(v1.tipo, v1.valor); 

		System.out.println(veiculo.ipva());
		System.out.println(v2.ipva());
		
		
//		Inferência  -- permite que a variável só receba um tipo quando ela recebe o seu valor.
		var texto = "Aula de Java";
//		texto = 10;		// erro
		var aula = veiculo;
		
		String nome = "Antonio";
		int idade = 50;
		double altura = 1.79;
		
		System.out.printf("%s tem %d anos e %.2f de altura.", nome, idade, altura);



	}

}
