package cracckify;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OneTenTwentySix {

	public static void main(String[] args) {
		String s="cracckify";
		int ans = firstUniqueCharacter(s);
		System.out.println(ans);
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));

	}

	private static int firstUniqueCharacter(String s) {
		Map<Character,Integer> freq= new LinkedHashMap<Character,Integer>();
		for(char ch: s.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<s.length()-1;i++) 
		{
			if(freq.get(s.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
	public static int missingNumber(int[] nums) {
        //Write your code here
		int n = nums.length;
		int expectedSum = n*(n+1)/2;
		
		int sum =0;
		for(int i: nums) {
			sum=sum+i;
		}
		int actualSum = expectedSum-sum;
		
        return actualSum;
    }

}
