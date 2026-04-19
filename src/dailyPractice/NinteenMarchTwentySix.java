package dailyPractice;

import java.util.ArrayList;
import java.util.List;

public class NinteenMarchTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Reverse a String
//		Problem: Write a program to reverse a given string.
		String str= "hello";
//		Output: "olleh"
		System.out.println("1. Reverse a String : "+ reverseString(str));
//
//		2. Check Palindrome Number
//		Problem: Determine if a number is a palindrome.
		int x= 121;
//		Output: true
		System.out.println("2. Check Palindrome Number : "+checkPalindrome(x));
//
//		3. Find Factorial (Iterative & Recursive)
//		Problem: Compute factorial of a number.
		int y= 5;
//		Output: 120
		System.out.println("3. Find Factorial (Iterative & Recursive) : "+factorialOfNum(y));
//
//		4. Fibonacci Series up to N
//		Problem: Print Fibonacci series up to N terms.
//		Input: 6
//		Output: 0 1 1 2 3 5
		System.out.println("4. Fibonacci Series : " + fibonacciSeries(6));

//		5. Count Vowels and Consonants
//		Problem: Count vowels and consonants in a string.
//		Input: "Java"
//		Output: Vowels: 2, Consonants: 2
		System.out.println("5. Count Vowels and Consonants : " + countVowelsConsonants("Java"));


//
//		6. Find Second Largest Element in Array
//		Problem: Given an array, find the second largest element.
//		Input: [10, 20, 4, 45, 99]
//		Output: 45
//
//		7. Check Anagram Strings
//		Problem: Check if two strings are anagrams.
//		Input: "listen", "silent"
//		Output: true
//
//		8. Sum of Digits of a Number
//		Problem: Find sum of digits of a number.
//		Input: 987
//		Output: 24
//
//		9. Find Missing Number in Array
//		Problem: Given an array of size N containing numbers from 1 to N+1 with one missing, find the missing number.
//		Input: [1, 2, 4, 5, 6]
//		Output: 3
//
//		10. Matrix Transpose
//		Problem: Find transpose of a given matrix.


		

	}

	private static String countVowelsConsonants(String str) {
		int vowels =0, consonants=0;
		str = str.toLowerCase();
		for(char ch: str.toCharArray()) {
			if("aeiou".indexOf(ch) != -1) {
				vowels++;
			}
			else {
				consonants++;
			}
		}
		return "Vowels: " + vowels + ", Consonants: " + consonants;

	}

	private static List<Integer> fibonacciSeries(int n) {
		List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            series.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return series;

	}

	private static int factorialOfNum(int y) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=y;i++) {
			fact=fact*i;
		}
		return fact;
	}

	private static boolean checkPalindrome(int x) {
		// TODO Auto-generated method stub
		if(x == revInteger(x) ) {
			return true;
		}
		return false;
	}
	
	private static int revInteger(int x) {
		//123->321
		int reversed=0;
		//int digit =x;
		while(x!=0) {
			int digit = x %10;
			reversed = reversed*10+digit;
			x=x/10;
		}
		return reversed;
	}

	private static String reverseString(String str) {
		// TODO Auto-generated method stub
		//with stream api
//		return IntStream.range(0,str.length())
//				.mapToObj(i-> str.charAt(str.length()-1-i))
//				.map(ch->str.valueOf(ch))
//				.collect(Collectors.joining());
		
		//using loop
		char[] chr = new char[str.length()];
		for(int i=str.length(); i>= 0; i--) {
			chr[str.length()-i-1]=str.charAt(i);
		}
		return new String(chr);
	}

}
