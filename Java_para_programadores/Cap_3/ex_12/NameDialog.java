package Cap_3.ex_12;

import javax.swing.JOptionPane;

public class NameDialog {
    public static void main(String args[]) {
        // pede para o usuário inserir um nome
        String name = JOptionPane.showInputDialog("What is your name?");

        // cria a mensagem
        String message = String.format("Welcome, %s, to Java Programing!", name);

        // exibe a mensagem para comprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);
    }
}
