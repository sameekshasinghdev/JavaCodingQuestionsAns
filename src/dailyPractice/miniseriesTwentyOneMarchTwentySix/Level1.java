package dailyPractice.miniseriesTwentyOneMarchTwentySix;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Level1 {

	public static void main(String[] args) {
		// 1. Reverse a String
//		Input: "hello"
//			Output: "olleh"
//
//			👉 Try:
//
//			Without using StringBuilder.reverse()
		String str = "hello";
		System.out.println("1. Reverse a String 'hello' : "+reversedString(str));
		
//		2. Check Palindrome
//		Input: "madam"
//		Output: true
		String str1= "N2 i&nJA?a& jnI2n";
		System.out.println("2. Check Palindrome  "+isPalindrome(str1));
		
//		3. Find Missing Number in Array (1 to N)
//		Input: [1,2,4,5]
//		Output: 3
		int[] arr= {1,2,3,4,5,7};
		System.out.println("3. Find Missing Number in Array (1 to N) :"+findMissingNumInAnArr(arr));
		
//		4. Find Duplicate Elements
//		Input: [1,2,3,2,4,1]
//		Output: 1,2
		
		int[] arr1 = {1,2,3,2,4,1};
		System.out.println("4. Find Duplicate Elements : "+findDuplicateElementsInAnArr(arr1));
		
//		5. Move Zeros to End
//		Input: [0,1,0,3,12]
//		Output: [1,3,12,0,0]
		int[] arr2 = {0,1,0,3,12};
		System.out.println("5. Move Zeros to End : "+ Arrays.toString(moveZerosToEnd(arr2)));
		//HOT : reverse senternce
//			Sample Input :
//			I am a star
//			Sample Output:
//			star a am I
		String sent = "I am a star";
		System.out.println("Reverse a senetence : "+revSentence(sent));
	}

	private static String revSentence(String sent) {
		if(sent.isBlank()) return null;
		String[] strArr = sent.split(" ");
		String[] newStrArr = new String[strArr.length];
		for(int i = 0; i<strArr.length;i++) {
			newStrArr[i]=strArr[strArr.length-1-i];
		}
		String result = String.join(" ", newStrArr);
		return result;
	}

	private static int[] moveZerosToEnd(int[] arr2) {
		if(arr2==null || (arr2.length==0)) {
			return null;
		}
//		else {
//			int[] newArr = new int[arr2.length];
//			int right = arr2.length-1;
//			int left = 0;
//			for(int i: arr2) {
//				if(i==0) {
//					newArr[right]=i;
//					right--;
//				}
//				else {
//					newArr[left]=i;
//					left++;
//				}
//			}
//			return newArr;
//		}
		int index = 0;

	    for(int i = 0; i < arr2.length; i++) {
	        if(arr2[i] != 0) {
	            arr2[index++] = arr2[i];
	        }
	    }

	    while(index < arr2.length) {
	        arr2[index++] = 0;
	    }

	    return arr2;
	}

	private static Set<Integer> findDuplicateElementsInAnArr(int[] arr1) {
		if(arr1==null || (arr1.length==0)) {
			return null;
		}
		else {
			Set<Integer> seen = new HashSet<>();
	        Set<Integer> duplicates = new HashSet<>();
			for(int i: arr1) {
				if(!seen.add(i)) {
					duplicates.add(i);
				}
			}
			return duplicates;
		}
	}

	private static int findMissingNumInAnArr(int[] arr) {
		if(arr==null || (arr.length==0)) {
			return -1;
		}
//		else {
//			for(int i=0;i<=arr.length-1;i++) {
//				if(arr[i] !=i+1) {
//					return i+1;
//				}
//			}
//		}
//		return 0;
		
		int n = arr.length + 1;
	    int expectedSum = n * (n + 1) / 2;
	    int actualSum = Arrays.stream(arr).sum();

	    return expectedSum - actualSum;
	}

	private static boolean isPalindrome(String str1) {
		
		if(str1.isBlank()) return false;
//		else if(str1.equals(reversedString(str1))) {return true;}
//		return false;
		String cleaned = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		return cleaned.equals(reversedString(cleaned));
	} 

	private static String reversedString(String str) {
		
//		return IntStream.range(0, str.length())
//				.mapToObj(i->str.charAt(str.length()-1-i))
//				.map(ch-> str.valueOf(ch))
//				.collect(Collectors.joining());
		
		char[] result = new char[str.length()];
	    for(int i = 0; i < str.length(); i++) {
	        result[i] = str.charAt(str.length() - 1 - i);
	    }
	    return new String(result);
	}

}
