package stringSolutions;
import java.util.Scanner; 

public class Deposit {
	private String Account; 
    public static void main(String[]args) {
        Account A1 = new Account("Jane Green", 100.00);
        Account A2 = new Account("John Blue", -2.49);
        displayAccount(A1);
        displayAccount(A2);
        
        Scanner input = new Scanner(System.in);
        System.out.print("amount deposited for account1:");
        
        double depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account 1 balance %n%n", depositAmount);
        A1.deposit(depositAmount);
        displayAccount(A1);
        displayAccount(A2);
        
        System.out.print("amount deposited for account2:");
        depositAmount = input.nextDouble();
        
        System.out.printf("%nadding %.2f to account2 balance %n%n", depositAmount);
        
        A2.deposit(depositAmount);
        displayAccount(A1);
        displayAccount(A2);
    }
    
    public static void displayAccount
    (Account accountToDisplay) {
        
        System.out.printf("%s balance: $%.2f\n", accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
