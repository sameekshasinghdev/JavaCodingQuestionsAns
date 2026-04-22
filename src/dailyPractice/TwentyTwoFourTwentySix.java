package dailyPractice;

import java.util.HashMap;

public class TwentyTwoFourTwentySix {

	public static void main(String[] args) {
		String s1="listen", s2="silent";
		System.out.println("Check if two strings are anagrams (without sorting): "+isAnagram(s1,s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
//		if(s1.length()!=s2.length()||s1==null||s2==null) return false;
//		
//		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//		
//		for(char ch: s1.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		for(char ch: s2.toCharArray()) {
//			if(!map.containsKey(ch)) return false;
//			map.put(ch, map.get(ch) - 1);
//
//	        if (map.get(ch) == 0) {
//	            map.remove(ch);
//	        }
//		}
//		return map.isEmpty();
		
		
		//faster approach
		
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
	        return false;
	    }

	    int[] count = new int[26];

	    for (char ch : s1.toCharArray()) {
	        count[ch - 'a']++;
	    }

	    for (char ch : s2.toCharArray()) {
	        count[ch - 'a']--;
	        if (count[ch - 'a'] < 0) return false;
	    }

	    return true;
	}

}
