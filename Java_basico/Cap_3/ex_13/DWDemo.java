package Java_basico.Cap_3.ex_13;

public class DWDemo {
    public static void main(String args[]) throws java.io.IOException {
        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }
}