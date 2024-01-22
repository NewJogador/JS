import java.util.Scanner;

public class Calc {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int ano;
        int mes;
        int mesAtual;
        int idade;

        System.out.print("Digite seu ano de nascimento: ");
        ano = input.nextInt();

        System.out.print("Digite o numero do mes do seu aniversario: ");
        mes = input.nextInt();

        System.out.print("Digite o mes atual: ");
        mesAtual = input.nextInt();

        idade = 2023 - ano;

        if (mesAtual >= mes)
            System.out.printf("Voce tem %d de idade!", idade);
        else 
            System.out.printf("Voce tem %d de idade!", (idade - 1));
    }
}