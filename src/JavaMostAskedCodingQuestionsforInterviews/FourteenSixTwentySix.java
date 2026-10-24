package JavaMostAskedCodingQuestionsforInterviews;

import java.util.HashMap;
import java.util.Map;

public class FourteenSixTwentySix {

	public static void main(String[] args) {
		 //1) Write a Java Program to reverse a string without using String inbuilt	function. 
		String s = "sammy";
		System.out.println("1) Write a Java Program to reverse a string without using String inbuilt function. :"+ reverseString(s));
		int a=5, b=8;
		System.out.println("2) Write a Java Program to swap two numbers without using the third variable. : ");
		swapNumber(a,b);
		
		System.out.println("3) Write a Java Program to count the number of words in a string using HashMap. : "+countNumofWrds(s));
	}

	private static Map countNumofWrds(String s) {
		HashMap<Character,Integer> count = new HashMap<Character,Integer>();
		for(char ch: s.toCharArray()) {
			count.put(ch, count.getOrDefault(ch, 0)+1);
		}
		return count;
	}

	private static void swapNumber(int a, int b) {
		a=a+b;
		b= a-b;
		a=a-b;
		System.out.println("a = "+ a+ " and b = "+b);
	}

	private static String reverseString(String s) {
		//String st ;
//		int j=0;
//		StringBuilder st = new StringBuilder();
//		for( int i=s.length()-1; i>=0;i--) {
//			st.append(s.charAt(i));
//		}
//		return st.toString();
		
		char[] ch = s.toCharArray();
		int left=0, right= ch.length-1;
		
		while(left<right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		return new String(ch);
	}

}
