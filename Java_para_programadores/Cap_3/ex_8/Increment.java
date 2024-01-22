// Figura 4.15: Increment.Java
// Operadores de pré-incremento e de pós-incremento

public class Increment 
{
    public static void main(String [] args)
    {
        // demostra o operador de pós-incremento
        int c = 5;
        System.out.printf("c before postincrement: %d%n", c); // imprime 5
        System.out.printf("postinvrementingc: %d%n", c++); // imprime 5
        System.out.printf("c after preincrement: %d%n", c); // imprime 6

        System.out.println(); // pula uma linha

        // demostra o operador de pré-incremento
        c = 5;
        System.out.printf("c before preincrement: %d%n", c); // imprime 5
        System.out.printf("preincrement c: %d%n", ++c); //imprime 6
        System.out.printf("c after preincrement: %d%n", c); // imprime 6
    }
} // fim da classe Increment
