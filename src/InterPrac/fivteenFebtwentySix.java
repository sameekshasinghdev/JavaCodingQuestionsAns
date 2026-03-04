package InterPrac;

import java.util.Arrays;
import java.util.Comparator;

public class fivteenFebtwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find the second highest number in an array.
		int[] arr = {3,2,1,5,6,4,7,9};
		
		System.out.println("Second higest number in array: " + secondHigestInArr(arr));

	}

	private static int secondHigestInArr(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		return Arrays.stream(arr)
				.distinct()
				.sorted()		//{1,2,3,4,5,6,7,9}
				.skip(n-2)	//{7,9}
				.findFirst() //7
				.orElseThrow(() -> new IllegalArgumentException("Array too small"));
	}

}
