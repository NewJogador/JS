import java.util.Scanner;

public class Comparison2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int nota1;
        int nota2;
        int soma;
        int recuperar;

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextInt();

        soma = (nota1 + nota2)/2;
        recuperar = 7 - soma;

        if (soma >= 7)
            System.out.printf("Parabens, voce passou!\n Sua media e %d", soma);
        if (soma < 7)
            System.out.printf("opss... nao foi dessa vez.\n Falta %d ponto(s).", recuperar);
    }
}
