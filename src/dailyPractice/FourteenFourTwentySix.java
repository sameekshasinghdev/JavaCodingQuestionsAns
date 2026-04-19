package dailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FourteenFourTwentySix {

	public static void main(String[] args) {
		
		int[] arr = {2,1,5,1,3,2};
		int k=3;
		System.out.println("1. Maximum sum of subarray of size K : "+ maxSumArr(arr,k));
		
		int[] arr1 = {12,-1,-7,8,-15,30,16,28};
		System.out.println("2. First negative number in every window of size K : "+ Arrays.toString(frstNegNum(arr1,k)));
	}

	private static int[] frstNegNum(int[] arr1, int k) {
		// TODO Auto-generated method stub
		if (arr1 == null || arr1.length < k) {
	        throw new RuntimeException("Invalid input");
	    }
		List<Integer> result = new ArrayList<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		
		//int[] negArr = new int[arr1.length-k+1];//array for firstNegative value per window
		int left = 0;

	    for (int right = 0; right < arr1.length; right++) {

	        // add negative numbers
	        if (arr1[right] < 0) {
	            q.add(arr1[right]);
	        }

	        // window size reached
	        if (right - left + 1 == k) {

	            // first negative
	            if (!q.isEmpty()) {
	                result.add(q.peek());
	            } else {
	                result.add(0);
	            }

	            // remove outgoing element
	            if (!q.isEmpty() && arr1[left] == q.peek()) {
	                q.poll();
	            }

	            left++;
	        }
	    }

	    return result.stream().mapToInt(i -> i).toArray();
	}

	private static int maxSumArr(int[] arr, int k) {
		if (arr == null || arr.length < k) {
	        throw new RuntimeException("Invalid input");
	    }
		int windowSum=0;
		
		for(int i=0;i<k;i++) {
			windowSum = windowSum+arr[i]; //for first window of size 3
		}
		int maxSum = windowSum; 
		for(int i=k;i<arr.length;i++) {
//			if(windowSum>maxSum)
//			{
				windowSum= windowSum+arr[i];
				windowSum = windowSum-arr[i-k];
				maxSum= Math.max(maxSum, windowSum);
			//}
		}
		return maxSum;
	}

}
