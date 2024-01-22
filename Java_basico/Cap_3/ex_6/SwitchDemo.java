package Java_basico.Cap_3.ex_6;

// Demostra switch sem instruções break
// Quanto encotrar um valor correspondente, será executado todas as instruções seguintes até o final do switch ou até encotrar um break, idependente de qualquer comparação
public class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three"); 
                    break; 
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is in five or more");
            }
    }
}
