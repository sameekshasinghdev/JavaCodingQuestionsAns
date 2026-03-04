package InterPrac;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codingNinja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S ="aabccba";
		System.out.println("Remove duplicate : "+removeConsecutiveDuplicates(S));
		
		String str1= "sinrtg" ;
		String str2 = "string";
		System.out.println("Check Permutation : "+isPermutation(str1,str2));
	}
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
//		String s1=str1.chars().mapToObj(c-> String.valueOf((char)c)).sorted().collect(Collectors.joining());
//		String s2=str2.chars().mapToObj(c-> String.valueOf((char)c)).sorted().collect(Collectors.joining());
//		if(s1.equals(s2)){
//			return true;
//		}
//		else{
//			return false;
//		}
		
		if (str1.length() != str2.length()) return false;

        int[] count = new int[256]; // assuming extended ASCII

        for (char c : str1.toCharArray()) {
            count[c]++;
        }
        for (char c : str2.toCharArray()) {
            count[c]--;
            if (count[c] < 0) return false; // more occurrences in str2
        }
        return true;

	}
	private static String removeConsecutiveDuplicates(String s) {
		// TODO Auto-generated method stub
		return IntStream.range(0, s.length())
				.filter(i -> i == 0 || s.charAt(i) != s.charAt(i - 1))
				.mapToObj(i -> String.valueOf(s.charAt(i)))
                .collect(Collectors.joining());
	}

//	private static String removeConsecutiveDuplicates(String s) {
//		// TODO Auto-generated method stub
//		return  s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
//				.entrySet().stream().filter(i->i.getValue()>1).map(Map.Entry::getKey).collect(Collectors.joining());
//	}
	
	
	

}
