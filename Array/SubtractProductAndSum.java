package ProblemAndSolutions;
import java.util.Scanner; 
public class SubtractProductAndSum { 

	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type Input:");
		int N = Integer.parseInt(reader.nextLine());
		System.out.println("The number you typed is: "+ subtractProductAndSum(N) );
		reader.close();

}
	 public static int subtractProductAndSum(int n) {
	        int sum = 0, product = 1;
	        while (n > 0) {
	            sum += n % 10;
	            product *= n % 10;
	            n /= 10;
	        }
	        return product - sum;
	    }
	}
