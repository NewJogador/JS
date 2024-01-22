package Cap_4.ex_4;

import java.util.Scanner;

public class Contador {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;
        int count = 0;

        while (count<10) {
            System.out.print("Insira o resultado: ");
            int resultado = input.nextInt();

            if (resultado == 1) {
                aprovados = aprovados +1;
                count = count +1;
            } else if (resultado == 2) {
                reprovados = reprovados +1;
                count = count +1;
            } else {
                System.out.println("Numero invalido!");
            }
        }

        System.out.printf("Foram aprovados %d alunos e reprovados %d alunos.", aprovados, reprovados);

        if(aprovados > 8)
            System.out.println("\nBonus para o instrutor!");
    }
} 
