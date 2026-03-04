package InterPrac;

public class ReverseEachWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "PwC interview questions are tough";
		System.out.println("Reverse Each word in a sentence : "+revEchWordInSent(sentence));
	}

	private static String revEchWordInSent(String sentence) {
		// TODO Auto-generated method stub
		if(sentence.isEmpty()) return null;
		String[] words= sentence.split(" ");
		StringBuilder result=new StringBuilder();
		
		for(String word:words) {
			result.append(new StringBuilder(word).reverse()).append(" ");
		}
		return result.toString().trim();
	}

}
