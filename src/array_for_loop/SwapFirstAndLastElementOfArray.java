package array_for_loop;

import java.util.Arrays;

public class SwapFirstAndLastElementOfArray {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int temp = nums[0]; // temp = nums[0] => 1
		nums[0] = nums[nums.length - 1]; // nums[0] = nums[4] => 5
		nums[nums.length - 1] = temp; // nums[4]=nums[0]=> nums[4]=1

		System.out.println("After swapping first and last: " + Arrays.toString(nums));


	}

}
