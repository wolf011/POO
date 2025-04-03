package exemplos;

import javax.swing.JOptionPane;

public class CalculoImposto {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		String nome;
		double salario;
		double salarioLiquido;
		
		nome = JOptionPane.showInputDialog("Digite o nome:");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário:"));
		
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
		
		salarioLiquido = funcionario.getSalario() - funcionario.calcularInss() - funcionario.calcularValeTranporte();
		
		JOptionPane.showMessageDialog(null,"Nome: " + funcionario.getNome() +"\n"+ 
										"Salário: " +funcionario.getSalario() +"\n"+
										"INSS: " + funcionario.calcularInss() +"\n"+
										"Vale Transporte: " + funcionario.calcularValeTranporte() +"\n"+
										"Salário Líquido: " + salarioLiquido );

	}

}

