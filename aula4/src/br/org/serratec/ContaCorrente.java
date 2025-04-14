package br.org.serratec;

import br.org.serratec.exception.ContaCorrenteException;

public class ContaCorrente implements Conta{  // Assim que se cria a realção com a Interface. Além disso podemos chamar várias Interfaces, diferentemente de classes.
	private String titular;
	private Double saldo;
	
	
	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "Titular = " + titular + ", saldo = " + saldo;
	}


	public String getTitular() {
		return titular;
	}


	public Double getSaldo() {
		return saldo;
	}


	@Override
	public Boolean saque(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saldo atual: " + saldo);
			return true;
		}
		throw new ContaCorrenteException("Saldo insuficiente");
	}

	
	@Override
	public void deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
		}
		throw new ContaCorrenteException("Valor igual ou inferior a zero."); //encerra a execução
	}
	@Override
	public void investimentos(Double valor) throws ContaCorrenteException{	// Joga o encerramento para o tratamento
		saldo = saldo - valor;
	}
}
