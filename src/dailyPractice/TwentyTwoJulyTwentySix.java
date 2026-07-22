package dailyPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwentyTwoJulyTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "sameeksha";
		System.out.println("Reverse a string: " + reverseString(s));

		String s1 = "madam";
		System.out.println("Is Palindrome : " + isPalindrome(s1));
		String s3 = "swiss";
		System.out.println("First Non-Repeating Character : " + findFirstNonRepChar(s3));
		String s4 = "banana";
		System.out.println("Character Frequency using : " + findCharacterFrequency(s4));
		String a = "aabb", b = "abab";
		System.out.println("Check Anagram: " + checkAnagram(a, b));
		String s5 = "programming";
		System.out.println("Remove Duplicate Characters : " + removeDuplicates(s5));
		String s6 = "Java is powerful";
		System.out.println("Reverse Words in a Sentence : " + reverseWordsInSentence(s6));
		String[] strs = { "flower", "flow", "flight" };
		System.out.println("Longest Common Prefix : " + longestCommonPrefix(strs));
		System.out.print("Count Vowels and Consonants : ");
		countVowelsAndConsonants(s);

		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println("Two Sum : ");
		int[] result = twoSum(nums, target);

		// Prints in [0, 1] format
		System.out.println(Arrays.toString(result));
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println("Filter even numbers : " + filterEvenNumber(arr));

		List<Integer> arr1 = Arrays.asList(1, 2, 3, 2, 4, 1);
		System.out.println("Find Duplicates : " + findDuplicates(arr1));

		List<Integer> arr2 = Arrays.asList(1, 2, 2, 3, 3, 4);
		System.out.println("RemoveDuplicates : " + removeDuplicates(arr2));
		List<Integer> list = Arrays.asList(10, 40, 20, 40, 30);
		System.out.println("Find second-highest number : " + findSecondHigestNumber(list));

		System.out.println("Character frequency" + findCharacterFrequencyUsingStream(s4));
	}

	private static Map<Character, Long> findCharacterFrequencyUsingStream(String s4) {
		// TODO Auto-generated method stub
		return s4.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						Function.identity(), LinkedHashMap::new, 
						Collectors.counting()));
	}

	private static Integer findSecondHigestNumber(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
	}

	private static List<Integer> removeDuplicates(List<Integer> arr2) {
		if (arr2 == null || arr2.isEmpty())
			throw new IllegalArgumentException("Input list cannot be null or empty");
		return arr2.stream().distinct().toList();
	}

	private static Set<Integer> findDuplicates(List<Integer> arr1) {
		if (arr1 == null || arr1.isEmpty())
			throw new IllegalArgumentException("Input list cannot be null or empty");
		Set<Integer> seen = new HashSet<>();

		Set<Integer> duplicates = arr1.stream().filter(i -> !seen.add(i)).collect(Collectors.toSet());
		return duplicates;
	}

	private static List<Integer> filterEvenNumber(List<Integer> arr) {
		if (arr == null || arr.isEmpty())
			throw new IllegalArgumentException("Input list cannot be null or empty");
		return arr.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	private static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}

	private static void countVowelsAndConsonants(String s) {
		if (s == null || s.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
		int vowels = 0, consonants = 0;
		s.toLowerCase();
		for (char ch : s.toCharArray()) {
			if (Character.isLetter(ch)) {
				if ("aeiou".indexOf(ch) != -1)
					vowels++;
				else
					consonants++;
			}

		}
		System.out.println("Vowels = " + vowels + ", Consonants = " + consonants + " for string: 'sameeksha'");
	}

	private static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			throw new IllegalArgumentException("Input string cannot be null or empty");
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty())
					return "";
			}
		}
		return prefix;

	}

	private static String reverseWordsInSentence(String s6) {
		if (s6 == null || s6.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
		String[] words = s6.trim().split("\\s+");
//		for(String word: words) {
//			
//		}

		int left = 0;
		int right = words.length - 1;
		while (left < right) {
			String temp = words[left];
			words[left] = words[right];
			words[right] = temp;
			left++;
			right--;
		}
		// return new String(Arrays.toString(words));
		return String.join(" ", words);
	}

	private static String removeDuplicates(String s5) {
		if (s5 == null || s5.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
//		Set<Character> set=new LinkedHashSet<Character>();
//		for(char ch:s5.toCharArray()) {
//			if(!set.contains(ch)) {
//				set.add(ch);
//			}
//		}
//		return set.toString();
		Set<Character> set = new LinkedHashSet<Character>();
		StringBuilder result = new StringBuilder();
		for (char ch : s5.toCharArray()) {
			if (set.add(ch)) {
				result.append(ch);
			}
		}
		return result.toString();

	}

	private static boolean checkAnagram(String a, String b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");

		if (a.length() != b.length()) {
			return false;
		}

//		Map<Character,Integer> freqMapA = new HashMap<Character,Integer>();
//		for(char c: a.toCharArray()) {
//			freqMapA.put(c, freqMapA.getOrDefault(c, 0)+1);
//		}
//		
//		for(char ch: b.toCharArray())
//		{
//			if(!freqMapA.containsKey(ch)) {return false;}
//			else {
//				freqMapA.remove(ch);
//			}
//		}
//		return freqMapA.isEmpty();
		Map<Character, Integer> freqMapA = new HashMap<Character, Integer>();
		for (char c : a.toCharArray()) {
			freqMapA.put(c, freqMapA.getOrDefault(c, 0) + 1);
		}
		for (char ch : b.toCharArray()) {
			Integer count = freqMapA.get(ch);
			if (count == null) {
				return false;
			}
			if (count == 1) {
				freqMapA.remove(ch);
			} else {
				freqMapA.put(ch, count - 1);
			}
		}
		return freqMapA.isEmpty();

	}

	private static Map<Character, Integer> findCharacterFrequency(String s4) {
		if (s4 == null || s4.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
		Map<Character, Integer> freq = new LinkedHashMap<Character, Integer>();
		for (char ch : s4.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}

		return freq;
	}

	private static Character findFirstNonRepChar(String s3) {
		if (s3 == null || s3.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
//		Map<Character,Integer> freq = new LinkedHashMap<Character,Integer>();
//		
//		for(char ch: s3.toCharArray()) {
//			freq.put(ch, freq.getOrDefault(ch, 0)+1);
//		}
//		
//		for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
//			if(entry.getValue()==1) {
//				return entry.getKey();
//			}
//		}
//		return null; 

		Map<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (char ch : s3.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
		}

		for (char ch : s3.toCharArray()) {
			if (freqMap.get(ch) == 1) {
				return ch;
			}
		}
		return null;
	}

	private static boolean isPalindrome(String s1) {
		if (s1 == null || s1.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");
//		char[] carr = s1.toCharArray();
//		int left =0;
//		int right=carr.length-1;
//		while(left<right) {
//			char temp = carr[left];
//			carr[left]= carr[right];
//			carr[right]=temp;
//			left++;
//			right--;
//		}
//		
//		String newStr = new String(carr);
//		if(s1.equals(newStr)) {
//			return true;
//		}
//		return false;

		int left = 0;
		int right = s1.length() - 1;

		while (left < right) {

			if (s1.charAt(left) != s1.charAt(right))
				return false;

			left++;
			right--;
		}

		return true;
	}

	private static String reverseString(String s) {
		if (s == null || s.isEmpty())
			throw new IllegalArgumentException("Input string cannot be null or empty");

//		return new StringBuilder(s).reverse().toString();

//		StringBuilder sb=new StringBuilder();
//		for(int i=s.length()-1;i>=0;i--) {
//			sb.append(s.charAt(i));
//		}
//		return sb.toString();

		char[] carr = s.toCharArray();
		int left = 0;
		int right = carr.length - 1;
		while (left < right) {
			char temp = carr[left];
			carr[left] = carr[right];
			carr[right] = temp;
			left++;
			right--;
		}
		return new String(carr);
	}

}
