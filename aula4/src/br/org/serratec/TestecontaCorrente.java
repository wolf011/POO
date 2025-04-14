package br.org.serratec;

import br.org.serratec.exception.ContaCorrenteException;

public class TestecontaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("João", 1000.);
		
		
		try {
//			conta.saque(100.);
			conta.saque(2000.);
//			conta.deposito(200.);
			conta.deposito(0.);
		} catch (ContaCorrenteException e) {
			System.out.println(e.getMessage());
		} finally {
//			System.out.println(conta);
			System.out.println("Saldo atual:" + conta.getSaldo());
		}
		
	}

}
