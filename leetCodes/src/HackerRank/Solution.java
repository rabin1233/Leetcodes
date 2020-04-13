package HackerRank;

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
	        int n = Integer.parseInt(scanner.nextLine());

	        if(n%2==1 || (n>=6 && n <= 20)){
	        	 System.out.println("Weird");
	        	}
	        else if(n%2 == 0 && (2 <= n && n <= 5)) {
		        	System.out.println("Not Weird");
	        }
	        else {System.out.println("Not Weird");
	        	}
	        scanner.close();
	    }
	}