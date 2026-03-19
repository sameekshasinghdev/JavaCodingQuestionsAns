package dailyPractice;

public class EighteenMarchTwentySix {
    public static void main(String[] args) {
        //1. Find First Non-Repeating Character
        String str = "swiss";
        System.out.println(firstNonRepeatingCharacter(str));
    }
    
    public static char firstNonRepeatingCharacter(String s) {
        int[] charCount = new int[26]; // Assuming only lowercase letters

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount[c - 'a'] == 1) {
                return c; // Return the first non-repeating character
            }
        }

        return '_'; // Return '_' if there is no non-repeating character
    }
    
}
