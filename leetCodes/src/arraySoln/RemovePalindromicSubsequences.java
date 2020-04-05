package arraySoln;

import java.util.*;

public class RemovePalindromicSubsequences {
	//String can be divided in 2 palindromic 
	//subsequences where all a's are combined in one 
	//subsequence and all 'b's in other. 	
	public static void main(String [] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Input: ");
		String input = reader.nextLine(); 
		
		if (isPalindrome(input) == true) {
			System.out.println("String is palindrome");
			System.out.println("Output :"+ removePalindromeSub(input));
		} else
		{
		System.out.println("String is not palindrome");
		System.out.println("Output :"+ removePalindromeSub(input));
		}
		reader.close();
		
	}
	 public static int removePalindromeSub(String s) {
	       if (s.length() == 0) return 0;
	       if (isPalindrome(s)) return 1;
	       else return 2;
	   }

	 public static boolean isPalindrome(String s) {
	        int left = 0, right = s.length() - 1;
	        while (left < right) {
	            if (!(s.charAt(left++) == s.charAt(right--))) {
	                return false;
	            }
	        }
	        return true;
	    }
}
 
 
