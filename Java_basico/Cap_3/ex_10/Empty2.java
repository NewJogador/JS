package Java_basico.Cap_3.ex_10;

public class Empty2 {
    public static void main(String args[]) {
        int i;
        i = 0; // move a inicialização para fora do laço

        for( ; i<10; ) {
            System.out.println("Pass #" +1);
            i++; // incrementa a variável de controle de laço
        }
    }
}
