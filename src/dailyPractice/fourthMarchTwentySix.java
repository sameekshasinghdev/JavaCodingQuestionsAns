package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class fourthMarchTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Find indices of two numbers that add up to target.
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(
				"1. Find indices of two numbers that add up to target. : " + Arrays.toString(twoSum(nums, target)));
		// 2. Longest Substring Without Repeating Characters
		String s = "pwwkew";
		System.out.println("2. Longest Substring Without Repeating Characters : " + longestSubString(s));
		// 3. Merge Two Sorted Arrays
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		System.out.println("3. Merge Two Sorted Arrays : " + Arrays.toString(mergeTwoSortedArray(arr1, arr2)));
	}

	private static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] sortedMergedArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				sortedMergedArr[k++] = arr1[i++];
			} else {
				sortedMergedArr[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			sortedMergedArr[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			sortedMergedArr[k++] = arr2[j++];
		}

		return sortedMergedArr;
	}

	private static String longestSubString(String s) {
		// TODO Auto-generated method stub
		int left = 0, right = 0, maxLength = 0, startIndex = 0;

		LinkedHashSet<Character> set = new LinkedHashSet<>();
		while (right < s.length()) {
			char c = s.charAt(right);
			if (!set.contains(c)) {
				set.add(c);
				// maxLength = Math.max(maxLength, right - left + 1)
				if (right - left + 1 > maxLength) {
					maxLength = right - left + 1;
					startIndex = left;
				}
				right++;
			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}
		// return set.toString();
		return s.substring(startIndex, startIndex + maxLength);

	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);

		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
