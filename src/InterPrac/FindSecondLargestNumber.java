package InterPrac;

import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,50,30};
		System.out.println("Find second largest number : "+findSecondLargestNum(a));
	}

	private static int findSecondLargestNum(int[] a) {
		// TODO Auto-generated method stub
		if(a==null || a.length==0) {
			return -1;
		}
		Arrays.sort(a);
		return a[a.length-2];
	}

}
