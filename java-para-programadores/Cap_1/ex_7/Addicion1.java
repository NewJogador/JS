import java.util.Scanner;

public class Addicion1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;

        System.out.print("Digite o primeiro numero: ");
        number1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        number2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;

        System.out.printf("A soma corresponde a %d", sum);

    }

}
