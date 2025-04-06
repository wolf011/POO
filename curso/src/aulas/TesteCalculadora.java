package aulas;

import javax.swing.JOptionPane;

public class TesteCalculadora {
	private static int opcao;
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		while(opcao != 5) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1- SOMA\n2- SUBTRAÇÃO\n3- MULTIPLICAÇÃO\n4- DIVISÃO\n5- SAIR\n\nEscolha uma opção:"));
//	        String[] options = {"Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
//			opcao = JOptionPane.showOptionDialog(
//                    null,
//                    "Escolha uma operação:",
//                    "Hugo's Calc",
//                    JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.INFORMATION_MESSAGE,
//                    null,
//                    options,
//                    options[0]);
			
			if (opcao == 5) {
				break;
			}

			calculadora.setValor1(Double.parseDouble(JOptionPane.showInputDialog("\nValor 1:")));
			calculadora.setValor2(Double.parseDouble(JOptionPane.showInputDialog("\nValor 2:")));
			
			
			switch (opcao) {
			case 1:
				JOptionPane.showMessageDialog(null, calculadora.soma());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, calculadora.subtracao());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, calculadora.multiplicacao());
				break;			
			case 4:
				JOptionPane.showMessageDialog(null, calculadora.divisao());
				break;			
			}
		}
	}

}
