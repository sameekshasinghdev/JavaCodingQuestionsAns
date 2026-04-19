package dailyPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EighteenFourTwentySix {

	public static void main(String[] args) {
	String s= "aabccdeff";
	System.out.println("Find the first non-repeating character in a string: "+frstNonRepChar(s));
	}
	
	public static char frstNonRepChar(String s){
		LinkedHashMap<Character, Integer> freq = new LinkedHashMap<Character,Integer>();
		
		for(char ch: s.toCharArray()){
			freq.put(ch,freq.getOrDefault(ch, 0)+1);
		}
		for (Entry<Character, Integer> entry : freq.entrySet()){
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		return '_';
	}
}
