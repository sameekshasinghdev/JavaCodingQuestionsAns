package NinjaCodingPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OneToNWithoutLoop {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(printNos(5)));

	}
	public static int[] printNos(int x) {
        
        return IntStream.rangeClosed(1, x).toArray();

    }
    

}
