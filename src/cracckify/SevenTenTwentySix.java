package cracckify;

import java.util.Arrays;

public class SevenTenTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		//String s= "race a car";
		System.out.println(isPalindrome(s));
		
		
		char[] sArr= {'h','e','l','l','o'};
		char[] reversed = reverseString(sArr);
		System.out.println(Arrays.toString(reversed));
	}

	private static boolean isPalindrome(String s) {
//		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//		int left = 0, right = s.length() - 1;
//		while (left < right) {
//			if (s.charAt(left)!= s.charAt(right)) {
//				return false;
//			} else {
//				left++;
//				right--;
//			}
//		}
//		return true;
		
		int left = 0, right = s.length() - 1;
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(s.charAt(left)) )left++;
			while(left<right && !Character.isLetterOrDigit(s.charAt(right)))right--;
			if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public static char[] reverseString(char[] s) {
        int left =0, right=s.length-1;
        while(left<right){
            char c= s[left];
            s[left]=s[right];
            s[right]=c;

            left++;
            right--;
        }
        return s;
    }
}
