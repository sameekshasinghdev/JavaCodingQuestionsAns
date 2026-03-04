package InterPrac;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,0,2,0,3};
		System.out.println("Move zeros at end : "+Arrays.toString(moveZerosAtEnd(a)));
	}

	private static int[] moveZerosAtEnd(int[] a) {
		// TODO Auto-generated method stub
		if(a==null || a.length==0) {
			return null;
		}
		int[] result = new int[a.length];
		int left = 0;
		int right = a.length - 1;
		for(int i:a) {
			if(i==0) {
				result[right--]=i;
			}
			else {
				result[left++]=i;
		
			}
		}
		return result;
	}

}
