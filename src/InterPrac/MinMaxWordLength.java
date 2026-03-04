package InterPrac;

public class MinMaxWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "PwC interview questions are tough";
		minMaxWordLength(sentence);
	}

	private static void minMaxWordLength(String sentence) {
		// TODO Auto-generated method stub
		String[] words = sentence.split("\\s+");
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (String word: words) {
			min = Math.min(min, word.length());
		    max = Math.max(max, word.length());
		}
		System.out.println("Minimum word Length: "+ min + " and Maximum Word Length: "+max);
	}

}
