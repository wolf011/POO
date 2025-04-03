package aula8;

public enum Sanduiche {
	HAMBURGUER("Hambúrguer", 10.00), CACHORRO_QUENTE("Cachorro Quente", 7.50), VEGETARIANO("Vegetariano", 8.00);

	private String tipo;
	private double valor;

	Sanduiche(String tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}
}
