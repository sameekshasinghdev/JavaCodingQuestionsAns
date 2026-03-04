package InterPrac;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find missing number (1–n)
		int[] arr = {1,2,4,5};
		System.out.println("find missing Number form array "+ Arrays.toString(arr)+": "+findMissingNumber(arr));

	}

	private static int findMissingNumber(int[] arr) {
		// TODO Auto-generated method stub
		if(arr== null || arr.length==0) {
			return -1;
		}
		int j=1;
		for(int i : arr) {
			if(i!=j) {
				return j;
			}
			j++;
		}
		return 0;
//		int n=arr.length;
//		int sum = (n*(n-1))/2;
//		
//		for(int i: arr) {
//			sum -=i;
//		}
//		
//		return sum;
	}

}
