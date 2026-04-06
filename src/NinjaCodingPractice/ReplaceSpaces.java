package NinjaCodingPractice;

public class ReplaceSpaces {

	public static void main(String[] args) {
		//StringBuilder s = "Hello World";
		StringBuilder s = new StringBuilder("Hello World");
		System.out.println(replaceSpaces(s));
	}

	private static StringBuilder replaceSpaces(StringBuilder s) {
		StringBuilder newStr = new StringBuilder();
		
//		for(char ch: s.toCharArray()) {
//			if(ch==' ') {
//				newStr.append("@40");
//			}
//			else {
//				newStr.append(ch);
//			}
//		}
//		return newStr;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ' ') {
				newStr.append("@40");
			}
			else {
				newStr.append(s.charAt(i));
			}
		}
		return newStr;
	}

}
