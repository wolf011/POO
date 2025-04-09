package br.org.serratec;

public class TestecontaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente("João", 1000.);
		
		conta.saque(100.);
		conta.deposito(200.);
		
		System.out.println(conta);
	}

}
