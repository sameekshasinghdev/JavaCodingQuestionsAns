package InterPrac;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(isAnagram("listen", "silent"));
	}

	private static boolean isAnagram(String string, String string2) {
		// TODO Auto-generated method stub
		if(string.length()!=string2.length()) {
			return false;
		}
		char[] a1 = string.toLowerCase().toCharArray();
		char[] a2 = string2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}

}
