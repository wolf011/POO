package aulas;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Hugo Martins", 1200.);
		
		JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome() + "\n"
				+ "Salario: " + funcionario.getSalario() 
				+ "\nINSS: " + funcionario.calcularInss() 
				+ "\nVale Transporte: " + funcionario.calcularValeTransporte() 
				+ "\nSalario Liquido: " + (funcionario.getSalario() - funcionario.calcularInss() - funcionario.calcularValeTransporte()) );
	}
}
