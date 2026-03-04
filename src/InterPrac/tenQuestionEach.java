package InterPrac;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class tenQuestionEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1. Reverse a String
		String s="hello";
		System.out.println("Q1. Reverse String : "+reverseString(s));
		System.out.println("Q1. Reverse String using stream : "+reverseStringUsingStream(s));
//		Q2. Palindrome Check
		String s2 ="madam";
		System.out.println("Q2. Palindrome Check : "+palindromeCheck(s2));
		System.out.println("Q2. Palindrome Check using Stream: "+palindromeCheckUsingStream(s2));
		
		//Q3. Count Vowels
		String s3 = "education";
		System.out.println("Q3. Count Vowels : "+countVowels(s3));
		String num1= "6913259244";
		String num2 ="71103343";
		System.out.println("concat :"+addStrings(num1,num2));
	}

	private static String addStrings(String num1, String num2) {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = n1+n2;
        String result = String.valueOf(n3);
        return result;
	}

	private static String countVowels(String s3) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean palindromeCheckUsingStream(String s2) {
		// TODO Auto-generated method stub
		String clean = s2.replaceAll("\\s+", "").toLowerCase();

		return IntStream.range(0, clean.length()/2)
				.allMatch(i->clean.charAt(i)== clean.charAt(clean.length()-i-1));
	}

	private static boolean palindromeCheck(String s2) {
		// TODO Auto-generated method stub
		if(s2.equals(reverseString(s2))) {
			return true;
		}
		return false;
	}

	private static String reverseStringUsingStream(String s) {
		// TODO Auto-generated method stub
		return IntStream.range(0, s.length())
	            .mapToObj(i -> s.charAt(s.length() - 1 - i))
	            .map(String::valueOf)
	            .collect(Collectors.joining());

	}

	private static String reverseString(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for(int i = s.length()-1; i>=0;i--) {
			sb.append(s.charAt(i));
		}
		
		//sb.toString();
		return sb.toString();
	}

}
