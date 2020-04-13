package stringSoln;
import java.util.Scanner; 

public class Deposit {
	private String Account; 
	private static String name1;
	private static String name2;
    public static void main(String[]args) {
    	Scanner input = new Scanner(System.in);
    	String name1 = input.next();
    	String name2 = input.next();
        Account A1 = new Account(name1, 100.00);
        Account A2 = new Account(name2, -2.49);
        displayAccount(A1);
        displayAccount(A2);
        
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
        
        System.out.printf("%s balance: $%.2f\n", accountToDisplay.getName(name1), accountToDisplay.getBalance());
        System.out.printf("%s balance: $%.2f\n", accountToDisplay.getName(name2), accountToDisplay.getBalance());
    }


	public static String getName1() {
		return name1;
	}

	public static void setName1(String name1) {
		Deposit.name1 = name1;
	}
	
	public static String getName2() {
		return name2;
	}

	public static void setName2(String name2) {
		Deposit.name2 = name2;
	}
}
