package NinjaCodingPractice;

public class FindCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'Z';

        if (Character.isUpperCase(ch)) {
            System.out.println(1);
        } else if (Character.isLowerCase(ch)) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

	}

}
