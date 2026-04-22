package dailyPractice.hashMap;

import java.util.HashMap;

public class NinteenFourTwentySix {

	public static void main(String[] args) {
		String s1= "anagram", s2="nagaram";
		System.out.println("Valid Anagram (without sorting — better version) : "+validAnagramWtOtSort(s1,s2));
	}

	private static boolean validAnagramWtOtSort(String s1, String s2) {
		// TODO Auto-generated method stub
//		if (s1 == null || s1.length() == 0 || s2 == null || s2.length()==0) return false;
//		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
//		HashMap<Character, Integer> map2=new HashMap<Character,Integer>();
//		
//		for(char ch: s1.toCharArray()) {
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		for(char ch: s2.toCharArray()) {
//			map2.put(ch, map2.getOrDefault(ch, 0)+1);
//		}
//		if(map.equals(map2)) {
//			return true;
//		}
//			
//		return false;
		if (s1 == null || s2 == null || s1.length() != s2.length()) {
	        return false;
	    }

	    HashMap<Character, Integer> map = new HashMap<>();

	    // count characters of s1
	    for (char ch : s1.toCharArray()) {
	        map.put(ch, map.getOrDefault(ch, 0) + 1);
	    }

	    // decrease using s2
	    for (char ch : s2.toCharArray()) {
	        if (!map.containsKey(ch)) return false;

	        map.put(ch, map.get(ch) - 1);

	        if (map.get(ch) == 0) {
	            map.remove(ch);
	        }
	    }

	    return map.isEmpty();
	}

}
