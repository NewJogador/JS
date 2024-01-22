
import java.util.Scanner;

public class Addicion 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Dial first number: ");
        number1 = input.nextInt();

        System.out.print("Dial second number:");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("The result is %d", sum);
    }
}