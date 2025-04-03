package exercicios;

import javax.swing.JOptionPane;

public class InsercaoVisual {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog ("Digite seu nome: ");
		String telefone = JOptionPane.showInputDialog ("Digite seu telfone: ");
		String email = JOptionPane.showInputDialog ("Digite seu email: ");
		String salariostr = JOptionPane.showInputDialog ("Digite seu salario atual: ");
		
		double salario = Double.parseDouble(salariostr);

		double salarioAumento = salario * 1.10;
		String mensagem = "Nome: " + nome + "\n"
						+ "Telefone: " + telefone + "\n"
						+ "Email: " + email + "\n"
						+ "Salario atualizado: R$ " + String.format("%.2f", salarioAumento);
		
		JOptionPane.showMessageDialog(null,  mensagem);

	}
}

