package aula8;

public enum Bebida {
	SUCO("Suco", 5.00),
    REFRIGERANTE("Refrigerante", 4.50),
    AGUA("Água", 2.00);

    private String tipo;
    private double valor;

    Bebida(String tipo, double valor) {
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
