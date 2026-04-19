package SlidingWindowProblems;

import java.util.Arrays;

public class CountOccurrencesOfAnagrams {

	public static void main(String[] args) {
		//3. Count Occurrences of Anagrams
		String txt = "forxxorfxdofr";
        String pat = "for";
        System.out.println("3. Count Occurrences of Anagrams: " + countAnagrams(txt, pat));
        // Output: 3 (substrings: "for", "orf", "ofr")

	}

	private static int countAnagrams(String txt, String pat) {
		// TODO Auto-generated method stub
		int n = txt.length();
        int k = pat.length();
        int count = 0;

        // Frequency arrays
        int[] patFreq = new int[26];
        int[] winFreq = new int[26];

        for (char c : pat.toCharArray()) {
            patFreq[c - 'a']++;
        }
     // First window
        for (int i = 0; i < k; i++) {
            winFreq[txt.charAt(i) - 'a']++;
        }

        if (Arrays.equals(patFreq, winFreq)) count++;

        // Slide window
        for (int i = k; i < n; i++) {
            winFreq[txt.charAt(i) - 'a']++;              // add right char
            winFreq[txt.charAt(i - k) - 'a']--;          // remove left char

            if (Arrays.equals(patFreq, winFreq)) count++;
        }

        return count;
	}

}
