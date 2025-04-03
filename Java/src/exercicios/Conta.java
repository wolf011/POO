package exercicios;

public class Conta {
	public int numero;
	public String titular;
	public double saldo;

	// Metodos sem retorno

	// todo método tem que ser público
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito efetuado");
		} else {
			System.out.println("Valor insuficiente");
		}
	}

	// Métodos com retorno
	public boolean saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}
