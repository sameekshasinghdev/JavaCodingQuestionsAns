package cracckify;

import java.util.HashSet;

public class TwentyOneNineTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence= "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
		
		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		System.out.println(longestConsecutive(nums));
	}
	
	public static boolean checkIfPangram(String sentence) {
        HashSet<Character> hashSet = new HashSet<Character>();

        for(char ch : sentence.toCharArray()){
            
            hashSet.add(ch);
        }
        return hashSet.size()==26;
    }
	
	public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i: nums){
            set.add(i);
        }

        int longest=0;

        for(int j: set){
            if(!set.contains(j-1)){
                int currentValue=j;
                int maintainedValue =1;

                while(set.contains(currentValue+1)){
                    currentValue++;
                    maintainedValue++;
                }
                longest= Math.max(longest,maintainedValue);
            }
        }
        return longest;
    }

}
