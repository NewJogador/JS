public class Mensagens {
    public static void main(String [] args){
        // uso de variáveis em frases
        String linguagem1 = "Java";
        String linguagem2 = "Python";
        String linguagem3 = "JavaScript";

        // imprimindo dados formatados
        System.out.printf("Bem-vindo ao aprendizado de %s!%n", linguagem1);
        System.out.printf("Bem-vindo ao aprendizado de %s!%n", linguagem2);
        System.out.printf("Bem-vindo ao aprendizado de %s!%n%n", linguagem3);

        System.out.print("Esta mensagem ");
        System.out.print("sera imprimida em ");
        System.out.print("apenas uma linha!");

        System.out.printf("%n%n"); // o objetivo é imprimir uma linha vazia
        System.out.print("\n\n"); // também é possível usando caracteres de barra invertida

        // impresão com quebra de linha altomática
        System.out.println("Esta mensagem sera imprimida em varia linha seguidas!");
        System.out.println("Esta mensagem sera imprimida em varia linha seguidas!");
        System.out.println("Esta mensagem sera imprimida em varia linha seguidas!");
        System.out.print("\n\n");

        System.out.println("using function\r print on this \rline this time"); // nesse caso retorno de carro ira sobrescrever a mensagem cada vez que for chamado
        System.out.printf("%s e simplesmente a melhor linguagem!", "Java");
    }
}
