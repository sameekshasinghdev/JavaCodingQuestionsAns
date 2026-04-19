package NinjaCodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rearrangeString("aabb"));
	}
	public static String rearrangeString(String str) {
//		int[] freq = new int[26];
//        for (char c : str.toCharArray()) {
//            freq[c - 'a']++;
//        }
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
//        for (int i = 0; i < 26; i++) {
//            if (freq[i] > 0) {
//                pq.add(new int[]{i, freq[i]});
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        int[] prev = {-1, 0}; // store last used char
//
//        while (!pq.isEmpty()) {
//            int[] curr = pq.poll();
//            result.append((char)(curr[0] + 'a'));
//            curr[1]--;
//
//            // push back previous if still has count
//            if (prev[1] > 0) {
//                pq.add(prev);
//            }
//            prev = curr;
//        }
//
//        // Check validity
//        if (result.length() != str.length()) {
//            return "NO SOLUTION";
//        }
//        return result.toString();
		
		
		int n = str.length();
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Find max frequency
        int maxFreq = Arrays.stream(freq).max().getAsInt();
        if (maxFreq > (n + 1) / 2) return "NO SOLUTION";

        // Sort characters by frequency
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) list.add(new int[]{i, freq[i]});
        }
        list.sort((a, b) -> b[1] - a[1]);

        char[] res = new char[n];
        int idx = 0;

        // Place most frequent characters first at even positions
        for (int[] pair : list) {
            int ch = pair[0], count = pair[1];
            while (count-- > 0) {
                if (idx >= n) idx = 1; // switch to odd indices
                res[idx] = (char)(ch + 'a');
                idx += 2;
            }
        }
        return new String(res);




	}

}
