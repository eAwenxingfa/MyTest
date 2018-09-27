package test;

public class TwoSum {

	public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 5, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.todo(nums, target);
        System.out.println("index1=" + result[0] + "  index2=" + result[1]);
        
    }

	public int[] todo(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (target == nums[i] + nums[j]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}

}
