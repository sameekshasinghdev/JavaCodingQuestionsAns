package dailyPractice;

import java.util.Collections;
import java.util.HashMap;

public class NinteenFourTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="eceba";
		int k=2;
		System.out.println("Longest substring with at most K distinct characters : "+longestSubstring(s,k));
		
		String s2="AABABBA";
		System.out.println("Longest Repeating Character Replacement: "+longestRepCharReplcmnt(s2,1));
	}

	private static int longestRepCharReplcmnt(String s2, int k) {
		if (s2 == null || s2.length() == 0 || k == 0) return 0;
		
		HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0,maxFreq=0;
        for(int right= 0; right <s2.length();right++) {
			char c = s2.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(c));

            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s2.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
//                if (map.get(leftChar) == 0) {
//                    map.remove(leftChar);
//                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
	}

	private static int longestSubstring(String s, int k) {
		if (s == null || s.length() == 0 || k == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

		for(int right= 0; right <s.length();right++) {
			char c = s.charAt(right);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;

	}

}
