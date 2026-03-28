package dailyPractice.miniseriesTwentyOneMarchTwentySix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Level2 {

	public static void main(String[] args) {
//		6. First Non-Repeating Character
//		Input: "aabbcde"
//		Output: c
		String str = "aabbcde";
		System.out.println(
				"6. Find First Non-Repeating Character from string :" + str + " is : " + firstNonRepeatingChar(str));
//		7. Anagram Check
//		Input: "listen", "silent"
//		Output: true
		String str1 = "listen";
		String str2 = "silent";
		System.out.println("7. Anagram Check : " + isAnagram(str1, str2));
//		8. Longest Substring Without Repeating Characters
//		Input: "abcabcbb"
//		Output: 3  // "abc"
		String str3="abcabcbb";
		System.out.println("8. Longest Substring Without Repeating Characters: "+longestSubString(str3));
//		9. Two Sum Problem
//		Input: nums = [2,7,11,15], target = 9
//		Output: [0,1]
		int[] nums = {2,7,11,15};
		int k =9;
		System.out.println("9. Two Sum Problem: "+Arrays.toString(twoSumPrblm(nums,k)));
//		10. Sort a Map by Values
//		Use Stream API (important for your prep)
		Map<String, Integer> map = Map.of("Alice", 25,"Bob", 30,"Charlie", 28);
		System.out.println("10. Sort a Map by Values: "+sortMapByValues(map));

	}

	private static Map<String,Integer> sortMapByValues(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1,      // merge function (not needed here)
                          LinkedHashMap::new   // preserve order
                  ));
	}

	private static int[] twoSumPrblm(int[] nums, int k) {
		// TODO Auto-generated method stub
		if(nums==null || nums.length==0) {
			return null;
		}
		Map<Integer, Integer> map = new HashMap<>();

		int n = nums.length;
        
        for(int i=0;i<n;i++) {
        	int complement = k - nums[i];
        	 if (map.containsKey(complement)) {
                 return new int[] { map.get(complement), i };
             }
             map.put(nums[i], i);

        }
        throw new IllegalArgumentException("No solution found");

	}

	private static String longestSubString(String str3) {
		// TODO Auto-generated method stub
		if(str3==null || str3.isEmpty()) {
			return null;
		}
		 Map<Character, Integer> map = new HashMap<>();
	        int left = 0, maxLen = 0, startIndex = 0;

	        for (int right = 0; right < str3.length(); right++) {
	            if (map.containsKey(str3.charAt(right))) {
	                // Move left pointer to avoid duplicates
	                left = Math.max(left, map.get(str3.charAt(right)) + 1);
	            }
	            map.put(str3.charAt(right), right);

	            // Update max length and starting index
	            if (right - left + 1 > maxLen) {
	                maxLen = right - left + 1;
	                startIndex = left;
	            }
	        }
	        // Return substring using startIndex and maxLen
	        return str3.substring(startIndex, startIndex + maxLen);

	}

	private static boolean isAnagram(String str1, String str2) {

		if ((str1 == null || str1.length() == 0) && (str2 == null || str2.length() == 0)) {
			return false;
		}
		String s1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String s2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
		if(s1.length()!=s2.length())
		{
			return false;
		}
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
	}

	private static Character firstNonRepeatingChar(String str) {
		if (str == null || str.isEmpty()) {
			return null;
		}
		LinkedHashMap<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		// char[] charArr = str.toCharArray();
		for (char ch : str.toCharArray()) {
			countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}

}
