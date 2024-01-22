package Java_basico.Cap_3.ex_11;

public class WhileDemo {
    public static void main(String args[]) {
        char ch;

        // exibe o alfabeto usando um laço while
        ch = 'a';

        while(ch <= 'z') {
            if(ch != 'z') System.out.printf("%c, ", ch);
            else System.out.printf("%c.", ch);
            
            ch++;
        }
    }
}
