import java.util.Scanner;

public class Comparison {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter first integer: ");
        number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d e igual a %d\n", number1, number2);
        
        if(number1 != number2)
            System.out.printf("%d e diferente de %d\n", number1, number2);

        if(number1 < number2)
            System.out.printf("%d e menor que %d\n", number1, number2);
        
        if(number1 > number2)
            System.out.printf("%d e maior que %d\n", number1, number2);

    }
}
