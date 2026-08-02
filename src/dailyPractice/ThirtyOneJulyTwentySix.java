package dailyPractice;

public class ThirtyOneJulyTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" -042";
		//String s="0-1";
		//int i = Integer.parseInt(s.trim());
		System.out.println("String to Integer : "+convertStringToInteger(s));
	}

	private static int convertStringToInteger(String s) {
		if(s.length()==0 || s.isEmpty()) {
			return 0;
		}
//		s = s.trim();
//		StringBuilder sb = new StringBuilder();
////		for(char ch: s.toCharArray()) {
//		for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            // Allow + or - only at the very beginning
//            if ((ch == '+' || ch == '-') && i == 0) {
//                sb.append(ch);
//            } else if (Character.isDigit(ch)) {
//                sb.append(ch);
//            } else {
//                break; // stop at first non-digit
//            }
//        }
//	if (sb.length() == 0 || sb.toString().equals("+") || sb.toString().equals("-")) {
//            return 0;
//        }
//
//        try {
//            return Integer.parseInt(sb.toString());
//        } catch (NumberFormatException e) {
//            return sb.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
//        }
//    }
		
		s = s.trim();
        int sign = 1;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Handle sign only at the beginning
            if (i == 0 && (ch == '+' || ch == '-')) {
                sign = (ch == '-') ? -1 : 1;
            } else if (Character.isDigit(ch)) {
                int digit = ch - '0';

                // Check for overflow before multiplying
                if (result > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
            } else {
                break; // stop at first non-digit
            }
        }

        return result * sign;
    }
}
