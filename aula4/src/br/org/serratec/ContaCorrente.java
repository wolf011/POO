package br.org.serratec;

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
		return false;
	}

	
	@Override
	public void deposito(Double valor) {
		if (valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor inválido!");
		}
	}
	

}
