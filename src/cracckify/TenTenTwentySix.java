package cracckify;

import java.util.Arrays;

public class TenTenTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 4 };
		int target = 6;
		int[] ans = twoSum(arr, target);
		System.out.print(Arrays.toString(ans));

	}

	public static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		int left = 0;
		int right = n - 1;

		int sum = 0;
		while (left <= right) {
			sum = nums[left] + nums[right];

			if (sum == target) {
				return new int[] { left, right };
			}

			if (sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] { -1, -1 };
	}

}
