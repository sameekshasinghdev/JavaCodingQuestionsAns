package cracckify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwentyThreeNineTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "loveleetcode";
		System.out.println(firstUniqChar(s));
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams( strs));

	}
	
	
	    public static int firstUniqChar(String s) {
	        HashMap<Character,Integer> countermap = new HashMap<>();

	        for(char ch: s.toCharArray()){
	            countermap.put(ch, countermap.getOrDefault(ch, 0)+1);
	        }
	        for (int i = 0; i < s.length(); i++) {
	            if (countermap.get(s.charAt(i)) == 1) {
	                return i;
	            }
	        }
	        return -1;
	    }
	    public static List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String, List<String>> map = new HashMap<>();

	        for (String word : strs) {

	            char[] chars = word.toCharArray();
	            Arrays.sort(chars);
	            String key = new String(chars);

//	            if (!map.containsKey(key)) {
//	                map.put(key, new ArrayList<>());
//	            }
//	            
	            
	            map.putIfAbsent(key, new ArrayList<>());
	            map.get(key).add(word);
	        }

	        return new ArrayList<>(map.values());
	    }

}
