package cracckify;

import java.util.ArrayList;
import java.util.Collections;

public class TwelveTenTwentySixSelfPractice {

	public static void main(String[] args) {
		// A leader is an element that is strictly greater than every element to its right. 
		//The rightmost element is always a leader.
		int[] arr = {16, 17, 4, 3, 5, 2};
		System.out.println(countLeaders(arr));
		
		int[] prices= {1, 2, 3, 4, 10};//{7, 1, 5, 3, 6, 4};
		System.out.println(maxProfit(prices));
		
		int[] arr1 = {2, 3, 10, 6, 4, 8, 1};
		System.out.println(maxDifference(arr1));

	}

	private static int maxDifference(int[] arr1) {
		
		
		//this is brut force approch problem is
//		Complexity:
//			- Time: (O(n^2)), because of two nested loops.
//			- Extra space: (O(1)).
//		int maxDiff=Integer.MIN_VALUE;
//		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=i+1; j< arr1.length;j++) {
//				int diff = arr1[j]-arr1[i];
//				maxDiff=Math.max(maxDiff, diff);
//			}
//		}
//		return maxDiff;
		
		int minSoFar = arr1[0];
		int maxDiff=Integer.MIN_VALUE;
		
		for(int i=1; i<arr1.length;i++) {
			
			int diff = arr1[i]-minSoFar;
			maxDiff = Math.max(maxDiff, diff);
			minSoFar = Math.min(minSoFar, arr1[i]);
			
		}
		return maxDiff;
		
	}

	private static ArrayList<Integer> countLeaders(int[] arr) {
		
		if (arr == null || arr.length == 0) {
	        return null;
	    }
		
		ArrayList<Integer> result = new ArrayList<>();
		int count=1;//beacuse last element is max only
		int maxRight=arr[arr.length-1];
		result.add(maxRight);
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>maxRight) {
				count++;
				maxRight= arr[i];
				result.add(arr[i]);
				
			}
		}
		Collections.reverse(result);
		return result;
	}
	
	public static int maxProfit(int[] prices) {
		
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int i=0; i<prices.length;i++) {
			
			minPrice = Math.min(prices[i], minPrice);
			
			int profit = prices[i]-minPrice;
			
			maxProfit=Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

}
