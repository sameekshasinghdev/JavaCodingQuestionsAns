package InterPrac;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "SameekshAE";
		System.out.println("Count vowels : "+countVowels(s));
	}

	private static int countVowels(String s) {
		// TODO Auto-generated method stub
		if(s.isEmpty())
		return -1;
		int count =0;
		for(char ch: s.toCharArray()) {
			
			if("AEIOUaeiou".indexOf(ch) != -1) count++;
		}
		return count;
	}

}
