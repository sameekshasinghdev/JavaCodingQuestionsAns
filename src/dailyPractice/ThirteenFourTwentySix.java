package dailyPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class ThirteenFourTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		System.out.println("1. Check if a string is palindrome : "+checkPalindrome(s));
		int a= 121;
		System.out.println("2. Check if a number is palindrome : "+checkNumIsPalindrome(a));
		String s1="aabccdeff";
		try {
			System.out.println("3. Find the first non-repeating character in a string : "+findFirstNonRepChar(s1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int[] arr= {3, 7, 2, 9, 5};
		System.out.println("4. Find max element in array : "+findMax(arr));
		System.out.println("5. Second largest element in array : "+secondLargest(arr));
		int[] arr1= {0,1,0,3,12};
		System.out.println("6. Move all zeros to end: "+Arrays.toString(moveZerosAtEnd(arr1)));
		
		int[] arr2= {1,1,2,2,3,4,4};
		int len = rmvDupFromsortArr(arr2);
		System.out.println("7. Remove duplicates from sorted array: " + Arrays.toString(Arrays.copyOf(arr2, len)));
		//System.out.println(+rmvDupFromsortArr(arr2));
		
//		HashMap Pattern
//		👉 Two Sum
		int[] arr3 = {2,7,1,15,8};
		int target=9;
		//Output: [0,1]
		System.out.println("8. Two Sum: "+Arrays.toString(towSum(arr3,target)));
		String A1= "listen";
		String A2 ="silent";
		System.out.println("9. Anagram Check : "+isAngram(A1,A2));
		String par = "{[()]}";
		System.out.println("10. Valid Parentheses : "+validParentheses(par));
		String str = "abcabcbb";
		System.out.println("11. Longest substring without repeating characters: "+lngstSubStrWtoutRep(str));
	}

	private static int lngstSubStrWtoutRep(String str) {
		if (str == null || str.length() == 0) return 0;
		
		int left =0,maxLength=0;
		Set<Character> nonRepSet = new HashSet<Character>();
		
		for(int right=0;right<str.length();right++) {
			while(nonRepSet.contains(str.charAt(right))) {
				nonRepSet.remove(str.charAt(left));
				left++;
			}
		nonRepSet.add(str.charAt(right));
        maxLength = Math.max(maxLength, right - left + 1);
		}
		
		return maxLength;
	}

	private static boolean validParentheses(String par) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch: par.toCharArray()) {
			if(ch=='{'||ch=='['||ch=='(') //if any open braces are present
			{
				stack.push(ch);
			}
			else {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if((ch=='}')&& (top != '{') || (ch==')')&& (top != '(') || (ch==']')&& (top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private static boolean isAngram(String A1, String A2) {
		if(A1.length() != A2.length()) {
			return false;
			}
		char[] arr1 = A1.toCharArray();
		char[] arr2 = A2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);

	}

	private static int[] towSum(int[] arr3, int target) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<arr3.length;i++) {
			int comp = target-arr3[i];
			if(map.containsKey(comp)) {
				return new int[] {map.get(comp),i};
			}
			map.put(arr3[i], i);
		}
		throw new IllegalArgumentException("No solution found");

	}

	private static int rmvDupFromsortArr(int[] arr2) {
		if (arr2.length == 0) return 0;

		int j=0;
		
		for(int i=1;i<arr2.length;i++) {
			if(arr2[i]!=arr2[j]) {
				j++;
				arr2[j]=arr2[i];
			}
		}
		return j+1;
	}

	private static int[] moveZerosAtEnd(int[] arr1) {
		// TODO Auto-generated method stub
		int insertPos = 0;
		for (int num : arr1) {
		    if (num != 0) {
		        arr1[insertPos++] = num;
		    }
		}
		while (insertPos < arr1.length) {
		    arr1[insertPos++] = 0;
		}

		return arr1;
	}

	private static int secondLargest(int[] arr) {
		if (arr == null || arr.length == 0) {
		    throw new RuntimeException("Array is empty");
		}
		int max=Integer.MIN_VALUE;
		int sndMax = Integer.MIN_VALUE;
		for(int i: arr) {
			if(i>max) {
				sndMax = max;   // shift old max down
	            max = i;
			}
			else if(i<max && i>sndMax) {
				sndMax=i;
			}
		}
		 if (sndMax == Integer.MIN_VALUE) {
		        throw new RuntimeException("No second largest element");
		    }

		
		return sndMax;
	}

	private static int findMax(int[] arr) {
		if (arr == null || arr.length == 0) {
		    throw new RuntimeException("Array is empty");
		}
		int max=Integer.MIN_VALUE;
		for(int i: arr) {
			if(i>max) {
				max=i;
			}
		}
		return max;
	}

	private static Character findFirstNonRepChar(String s1) throws Exception {
		// TODO Auto-generated method stub
		LinkedHashMap<Character,Integer>countMap = new LinkedHashMap<Character,Integer>();
		for(char c: s1.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0)+1);
		}
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("No non-repeating character found");
	}

	private static boolean checkNumIsPalindrome(int a) {
	    if (a < 0) return false; // negative numbers are not palindrome

	    int rev = 0;
	    int orig = a;

	    while (a > 0) {
	        int digit = a % 10;
	        rev = rev * 10 + digit;
	        a = a / 10;
	    }

	    return rev == orig;
	}

	private static boolean checkPalindrome(String s) {
		
//		char[] chr = new char[s.length()];
//		
//		for(int i=s.length()-1; i>=0;i--) {
//			chr[s.length()-1-i] = s.charAt(i);
//		}
//		String revStr = new String(chr);
//		if(s.equals(revStr)) {
//			return true;
//		}
//		return false;
		
		int left = 0;
	    int right = s.length() - 1;

	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) //comparing first and last char
	        {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	}

}
