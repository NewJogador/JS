import java.util.Scanner;

class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class AccountTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    
        Account myAccount = new Account("Jane Green");
    
        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

    }
}