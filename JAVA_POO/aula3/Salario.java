package exemplos;

import javax.swing.JOptionPane;

public class Salario {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
        String email = JOptionPane.showInputDialog("Digite seu e-mail:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));

        double novoSalario = salario * 1.10;

        String mensagem = "Nome: " + nome + 
                          "\nTelefone: " + telefone + 
                          "\nE-mail: " + email + 
                          "\nSalário com acréscimo de 10%: R$ " + String.format("%.2f", novoSalario);

        JOptionPane.showMessageDialog(null, mensagem, "Informações do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }
}
