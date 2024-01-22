import java.util.Scanner;

public class IntxInt {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite o primerio numero: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = input.nextInt();

        if (num1 == num2)
            System.out.printf("O numero %d e igual a o numero %d\n", num1, num2);
        
        if (num1 != num2)
            System.out.printf("O numero %d e diferente do numero %d%n", num1, num2);

        if (num1 > num2)
            System.out.printf("O numero %d e maior que o numero %d\n", num1, num2);
        
        if (num1 < num2)
            System.out.printf("O numero %d e menor que o numero %d%n", num1, num2);
    }
}
