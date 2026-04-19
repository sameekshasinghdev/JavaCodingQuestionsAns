package SlidingWindowProblems;

public class MaxSumOfSubArray {
//	Think of it like a window (subarray/substring) moving over your data.
//
//	👉 Instead of checking every possible subarray (brute force)
//	👉 You reuse previous work and just slide the window
	
//	[2,1,5] = 8
//	[1,5,1] = 7  
//	[5,1,3] = 9  
//	[1,3,2] = 6  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 5, 1, 3, 2};
		//size of sub array
		int k = 3;
		System.out.println(maxSumOfSubArr(arr,k));
		

	}

private static int maxSumOfSubArr(int[] arr, int k) {
	
	int windowSum=0, maxSum=0;
	for(int i =0; i<k;i++) {
		windowSum = windowSum+arr[i];
	}
	maxSum = windowSum;
	for(int i=k; i<arr.length;i++) {
		windowSum= windowSum+arr[i];
		windowSum = windowSum-arr[i-k];
		maxSum= Math.max(maxSum, windowSum);
	}
	return maxSum;
}

}
