package stringSoln;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

	public class RomanToInteger {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader = new Scanner(System.in);
			System.out.println("Input: ");
			String Input = reader.nextLine();
			int Output = romanToInt(Input);
			System.out.println("Output: "+ Output );
			reader.close();

		}

		public static int romanToInt(String s) {
	        int sum = 0;
	        for(int i = 0; i < s.length();){
	            if(s.charAt(i) == 'I'){
	                if(i+2 <= s.length() && s.substring(i,i+2).equals("IV")){
	                    sum = sum + 4;
	                    i = i + 2;
	                } else if(i+2 <= s.length() &&  s.substring(i,i+2).equals("IX")) {
	                    sum = sum + 9;
	                    i = i + 2;
	                } else {
	                    sum = sum + 1;
	                    i = i + 1;
	                }
	            } else if(s.charAt(i) == 'X'){
	                if(i+2 <= s.length() && s.substring(i,i+2).equals("XL")){
	                    sum = sum + 40;
	                    i = i + 2;
	                } else if(i+2 <= s.length() && s.substring(i,i+2).equals("XC")) {
	                    sum = sum + 90;
	                    i = i + 2;
	                } else {
	                    sum = sum + 10;
	                    i = i + 1;
	                }
	            }  else if(s.charAt(i) == 'C'){
	                if(i+2 <= s.length() && s.substring(i,i+2).equals("CD")) {
	                    sum = sum + 400;
	                    i = i + 2;
	                } else if(i+2 <= s.length() && s.substring(i,i+2).equals("CM")) {
	                    sum = sum + 900;
	                    i = i + 2;
	                } else {
	                    sum = sum + 100;
	                    i = i + 1;
	                }
	            } else if(s.charAt(i) == 'V'){
	                sum = sum + 5;
	                i = i + 1;
	            } else if(s.charAt(i) == 'L'){
	                sum = sum + 50;
	                i = i + 1;
	            } else if(s.charAt(i) == 'D'){
	                sum = sum + 500;
	                i = i + 1;
	            } else if(s.charAt(i) == 'M'){
	                sum = sum + 1000;
	                i = i + 1;
	            }
	        }
	        return sum;
	    }
	}
