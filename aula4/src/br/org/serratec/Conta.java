package br.org.serratec;

//Toda interface é, por padrão, publica e abstract.
public interface Conta {
	
//	Estes três primeiros marcores são os default da interface.
	public static final Double TAXAS = 10.; // constante. SEMPRE QUE DEFINIR UMA CONSTANTE DEFINIR SEU NOME EM CAPSLOCK.
	
//	Implicitamente absctract
	public abstract Boolean saque(Double valor);
	public void deposito(Double valor);
	
	
	
}
