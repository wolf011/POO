package aula9;
	
import javax.swing.JOptionPane;

public class LeituraGrafico {

	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("Número: ");
		String num2 = JOptionPane.showInputDialog("Número: ");

		double numero1 = Double.parseDouble(num1);
		double numero2 = Double.parseDouble(num2);
		double resultado = (numero1 + numero2) / 2;
		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "O resultado foi 0");
		} else {
			JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
		}
	}
}