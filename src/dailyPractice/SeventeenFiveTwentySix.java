package dailyPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeventeenFiveTwentySix {

	public static void main(String[] args) {
		String s = "swiss";
		System.out.println("1. Find First Non-Repeating Character: " + findFirstNonRepChar(s));
		String s1 = "abcabcbb";
		System.out.println("2. Longest Substring Without Repeating Characters: " + findLongestSubstring(s1));
		 List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
		 System.out.println("3. Group Anagrams: " + groupAnagrams(words));
	}

	private static String groupAnagrams(List<String> words) {
		if (words == null || words.size() == 0) {
			return "null or empty list";
		}

		Map<String, List<String>> anagramMap = words.stream()
				.collect(Collectors.groupingBy(word -> {
					char[] charArray = word.toCharArray();
					Arrays.sort(charArray);
					return new String(charArray);}));
		return anagramMap.values().toString();
	}

	private static String findLongestSubstring(String s1) {
		if (s1 == null || s1.length() == 0) {
			return "null or empty string";
		}

		int left = 0, right = 0, startIndex = 0, maxLength = 0;
		LinkedHashSet<Character> charSet = new LinkedHashSet<Character>();
		while (right < s1.length()) {

			char ch = s1.charAt(right);
			if (!charSet.contains(ch)) {
				charSet.add(ch);
				if (right - left + 1 > maxLength) {
					maxLength = right - left + 1;
					startIndex = left;
				}
				right++;
			} else {
				charSet.remove(s1.charAt(left));
				left++;
			}

		}
		return s1.substring(startIndex, startIndex + maxLength);

	}

	private static char findFirstNonRepChar(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		LinkedHashMap<Character, Integer> countChar = new LinkedHashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			countChar.put(ch, countChar.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;

	}

}
