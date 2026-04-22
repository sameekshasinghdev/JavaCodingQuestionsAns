package dailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class TwentyThreeFourTwentySix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		System.out.println("Longest substring without repeating characters: " + longSubStrWtOtRep(s));
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println("Find Duplicate Elements in Array: " + findDupElInAr(arr));
		int[] nums = { 2, 7, 11, 15 };
		System.out.println("Two Sum: " + Arrays.toString(twoSum(nums, 9)));
	}

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] {};
	}

	private static List<Integer> findDupElInAr(int[] arr) {

//		HashSet<Integer> set = new HashSet<Integer>();
//		HashSet<Integer> dup = new HashSet<Integer>();
//		if (arr == null || arr.length == 0) {
//			return dup;
//		}
//		for(int i:arr) {
//			if(!set.contains(i)) {
//				set.add(i);
//			}
//			else {
//			dup.add(i);}
//		}
//		return dup;

		// without extra spaces

		List<Integer> duplicates = new ArrayList<>();
		if (arr == null || arr.length == 0) {
			return duplicates;
		}

		for (int i = 0; i < arr.length; i++) {
			int index = Math.abs(arr[i]) - 1; // map value to index

			if (arr[index] < 0) {
				// already visited → duplicate
				duplicates.add(Math.abs(arr[i]));
			} else {
				// mark as visited
				arr[index] = -arr[index];
			}
		}
		return duplicates;
	}

	private static int longSubStrWtOtRep(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}

		int maxlen = 0, left = 0;
//		StringBuilder sub= new StringBuilder();
		HashSet<Character> sub = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			while (sub.contains(s.charAt(i))) {
				sub.remove(s.charAt(left));
				left++;
			}
			sub.add(s.charAt(i));
			maxlen = Math.max(maxlen, i - left + 1);
		}
		return maxlen;
	}

}
