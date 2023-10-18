import javax.swing.JOptionPane;

public class Janela {
    public static void main(String args [])
    {
        String number1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        ;
        String number2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
        ;

        int sum = Integer.parseInt(number1) + Integer.parseInt(number2);

        String message = String.format("A soma de %s e %s e igual a %d", number1, number2, sum);

        JOptionPane.showMessageDialog(null, message);
    }
}
