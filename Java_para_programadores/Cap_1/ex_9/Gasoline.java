import java.util.Scanner;

public class Gasoline {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double preco = 5.49;
        String tipo;

        System.out.print("Digite dinheiro ou litro: ");
        tipo = input.nextLine(); // não consegue armazenar uma palavra sem a função correta(possivelmente)

        if (tipo == "dinheiro"){
            double valor;
            System.out.print("Quantos reais?: ");
            valor = input.nextDouble();

            if (valor != 0 && valor > preco){
                double pedido;
                pedido = valor/preco;
                System.out.printf("Seu pedido deu %.2f litros!", pedido);
            } else {
                System.out.print("Valor não válido!");
            }
        }
        
        else if (tipo == "litro"){
            double litro;
            double pedido;

            System.out.print("Quantos litros!: ");
            litro = input.nextDouble();
            pedido = litro * preco;
            System.out.printf("Seu pedido deu R$ %.2f", pedido);
        }
    }
}
