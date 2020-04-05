package stringSoln;

import java.util.Scanner;
public class FreqAlphabets {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Input: ");
		String input = reader.nextLine();
		String output = freqAlphabet(input);
		System.out.println("Output:" + output);
		reader.close();
	}
		 public static String freqAlphabet(String s) {
	        // check the pos of i + 2 equals # or not
	        if (s == null || s.length() == 0) return "";
	        StringBuilder sb = new StringBuilder();
	        int index = 0;
	        while (index < s.length()) {
	            if (index + 2 < s.length() && s.charAt(index + 2) == '#') {
	                char ch = 'j';
	                ch += (Integer.parseInt(s.substring(index, index + 2)) - 10);
	                sb.append(String.valueOf(ch));
	                index += 3;
	            } else {
	                char ch = 'a';
	                ch += (Integer.parseInt(s.substring(index, index + 1)) - 1);
	                sb.append(String.valueOf(ch));
	                index++;
	            }
	        }
	        return sb.toString();
	    }

}
