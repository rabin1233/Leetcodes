package mathSoln;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Solution {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.print("N : ");
	        int N = Integer.parseInt(scanner.nextLine());

	        if (N%2 == 1){
	        	System.out.println("Weird");
	        } else if(N%2 == 0 || (2<=N && N <=5)) {
	        	System.out.println("Not Weird");
	        } else if(N%2 == 0 && (N >= 6 && N <= 20)) {
	        	System.out.println("Weird");
	        }else if(N%2 == 0 || (N > 20)) {
	        	System.out.println("Weird");
	        scanner.close();
	    }
	}
}