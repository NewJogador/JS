import java.util.Scanner;

class Galoes 
{
    public static void main(String args [])
    {
        Scanner input = new Scanner(System.in);

        double galoes;
        double litros;

        System.out.print("Quantos galoes ainda restam? ");
        galoes = input.nextDouble();

        litros = galoes * 3.7854;

        System.out.print("Sobraram " +litros +" litros!");
    }
}