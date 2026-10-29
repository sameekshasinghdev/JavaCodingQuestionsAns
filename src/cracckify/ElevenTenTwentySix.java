package cracckify;

public class ElevenTenTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,1,5,3,6,4};
		System.out.println(bestTimeToSell(arr));
		
		String s = "A9 man, a plan, a canal: Panam9a";
		
		System.out.println(isPalindrome(s));

	}
	private static boolean isPalindrome(String s) {
		
		int left = 0;
        int right = s.length() - 1;

        // First while loop: move left pointer to next alphanumeric        while (left < right) {
            while (left < right && !isAlphaNumeric(s.charAt(left))) {
                left++;
            }

            // Second while loop: move right pointer to previous alphanumeric
            while (left < right && !isAlphaNumeric(s.charAt(right))) {
                right--;
            }

            // Third while loop: compare characters
            if (left < right) {
                char cLeft = Character.toLowerCase(s.charAt(left));
                char cRight = Character.toLowerCase(s.charAt(right));
                if (cLeft != cRight) {
                    return false;
                }
                left++;
                right--;
            }
        
        return true;
	}
	
	private static boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }
	public static int bestTimeToSell(int[] arr) {
        // your code here
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i:arr){
            if(i<minPrice){
                minPrice=i;
            }
            else if(i-minPrice >maxProfit){
                maxProfit = i-minPrice;
            }
        }
        return maxProfit;

    }

	}
