package ProblemAndSolutions;
import java.util.*; 
public class LengthOfLastWord{

	public static void main (String [] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("the word you want the length of:");
		String Lword = reader.nextLine();
		reader.close();

		System.out.println("the length of last word: " + lengthOfLastWord(Lword));
	}
		public static int lengthOfLastWord(String s) {
			int len=s.length(), lastLength=0;
    
			while(len > 0 && s.charAt(len-1)==' '){
				len--;
			}
    
			while(len > 0 && s.charAt(len-1)!=' '){
				lastLength++;
					len--;
    }
    
    return lastLength;
}}
