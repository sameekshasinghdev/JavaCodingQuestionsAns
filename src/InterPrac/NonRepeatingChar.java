package InterPrac;

import java.util.LinkedHashMap;

public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbcde";
		System.out.println("first non Repeating Char : "+firstNonRepeatingChar(s));
	}

	private static char firstNonRepeatingChar(String s) {
		// TODO Auto-generated method stub
		if(s==null || s.isEmpty()) {
			return '\0';
		}
		LinkedHashMap<Character,Integer> ch = new LinkedHashMap<Character,Integer>();
		for(char cha: s.toCharArray()) {
			ch.put(cha, ch.getOrDefault(cha,0)+1);
		}
		for (char cha : s.toCharArray()) {
	        if (ch.get(cha) == 1) {
	            return cha;
	        }
	    }
		return '\0';
	}

}
