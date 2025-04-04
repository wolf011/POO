package exercicios;

import javax.swing.JOptionPane;

public class Antecessor {
    private Double number;
    private Double antecessor;

    public void processingNumber() {
        String num = JOptionPane.showInputDialog("Insira o número desejado");
        this.number = Double.parseDouble(num);
        this.antecessor = number - 1; 
    }

    public void anterior () {
        JOptionPane.showMessageDialog(null, antecessor, "Número anterior", 0);
    }

}
