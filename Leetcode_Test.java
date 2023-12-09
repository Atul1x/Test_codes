//package task.test;

class Tester {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		// traverse whole array
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = nums[i];
					result[1] = nums[j];
				} else {
					int else_result[] = new int[1];
					return else_result;

				}

			}
			System.out.println();

			
		}
		return result;
	}
}

public class Leetcode_Test {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 11, 15 };
		int inputtarget = 9;
		Tester test = new Tester();
		test.twoSum(nums, inputtarget);
		// System.out.println("The expected output is " +output.toString());
	}

}
