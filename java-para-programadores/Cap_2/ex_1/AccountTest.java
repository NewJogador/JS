import java.util.Scanner;

public class AccountTest {
    public static void main(String args [])
    {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account(); // criando um novo objeto com a class Account atriuída a variável myAccount | palavra-chave new estabelece um novo objeto da classe específicade, e os parênteses representam uma chamada para um construtor

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // será escaneado uma linha de texto | o método nextLine lê os caracteres até encontrar uma quebra de linha, e então retorna a string sem encluí-lo
        myAccount.setName(theName); // é chamado o método setName da class Account
        System.out.println();

        System.out.printf("Name in object myAccount is: %n%s%n", myAccount.getName());

    }
}
