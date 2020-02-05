package ProblemAndSolutions;

	public class TwoSums {

	    public static void main(String[] args) {
	    	int target = 9;
	    	int[] rabin = {4,5,8,9};
	    	
	    System.out.println("the indeces are" + twoSum(rabin, target));
	    }
	    public static int[] twoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	}