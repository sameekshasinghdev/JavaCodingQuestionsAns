package NinjaCodingPractice;

public class onvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love programming";
		System.out.println(convertString(str));

	}
	public static String convertString(String str) {
        // Write your code here
//        String[] strArr = str.split(" ");
//       // String[] newSAr = new String[str.length()];
//        StringBuilder result = new StringBuilder();
//
//        for (String word : strArr) {
//            if (word.length() > 0) {
//                result.append(Character.toUpperCase(word.charAt(0)))
//                      .append(word.substring(1).toLowerCase());
//            }
//            result.append(" ");
//        }
//        return result.toString().trim();
		
		String[] strArr = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : strArr) {
            if (word.length() > 0) {
                // First letter uppercase, rest unchanged
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1));  
            }
            result.append(" ");
        }
        return result.toString().trim();


    }
}
