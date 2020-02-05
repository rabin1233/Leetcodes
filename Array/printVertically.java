package ProblemAndSolutions;
import java.util.*;
import java.util.Scanner; 

public class printVertically {
 
	public static void main(String[] args) {
	Scanner reader = new Scanner (System.in);
	System.out.println("Input : ");
	String input = reader.nextLine();
	System.out.println("Output: "+ printVertical(input));
	
	reader.close();
	
	

	}
	public static List<String> printVertical(String s) {
        String[] words = s.split(" ");
        int mx = 0;
        for (int i = 0; i < words.length; ++i)
            mx = Math.max(mx, words[i].length());
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < mx; ++i) {
            StringBuilder sb = new StringBuilder();
            for (String word : words)
                sb.append(i < word.length() ? word.charAt(i) : " ");
            while (sb.charAt(sb.length() - 1) == ' ')
                sb.deleteCharAt(sb.length() - 1); // remove trailing space.
            ans.add(sb.toString());
        }
        return ans;
    }
}
