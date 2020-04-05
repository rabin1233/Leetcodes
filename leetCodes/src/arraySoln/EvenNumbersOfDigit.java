package arraySoln;
public class EvenNumbersOfDigit {

	public static void main(String[] args) {
	int [] nums = {12, 345, 2, 6, 7896};
	System.out.println("Output: "+ findNumbers(nums) );
	}
	  public static int findNumbers(int[] nums) {
	        
	        int count=0;
	        
	        for(int i =0 ; i< nums.length; i++){
	            
	            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000)){
	                count++;
	            }
	        }
	        
	        return count;
	        
	    }
	}

