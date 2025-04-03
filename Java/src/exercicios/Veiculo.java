package exercicios;

public class Veiculo {
	public String placa;
	public String tipo;
	public int valor;

	public String ipva() {
//		return (tipo.equals("Flex")? "O valor do IPVA é: " + valor * 0.04: "O valor do IPVA é: " + valor * 0.015);
		return (tipo.equalsIgnoreCase("Flex") ? "O valor do IPVA é: " + valor * 0.04
				: "O valor do IPVA é: " + valor * 0.015);
	}

}
