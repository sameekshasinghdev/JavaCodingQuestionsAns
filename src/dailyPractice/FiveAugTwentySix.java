package dailyPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class FiveAugTwentySix {

	public static void main(String[] args) {
		int[]arr = {2, 7, 11, 15};
		int target = 9;
		System.out.println("Two sum: "+twoSumProblem(arr,target));
		
		int[] arr1 = {10, 20, 4, 45, 99};
		System.out.println("Second Largest number: "+secondLargestNumber(arr1));

	}

	private static int secondLargestNumber(int[] arr1) {
		// TODO Auto-generated method stub
//		return Arrays.stream(arr1).max.skip(1).findFirst().orElse(0);
		Arrays.sort(arr1);
		int l = arr1.length;
		return(arr1[l-2]);
	}

	private static int[] twoSumProblem(int[] arr, int target) {
		if (arr == null || arr.length == 0) {
		    throw new RuntimeException("Array is empty");
		}
		
//		Arrays.sort(arr);
//		
//		int left=0, right=arr.length-1;
//		while(left<=right) {
//			int sum = arr[left]+arr[right];
//			if(sum==target) {
//				return true;
//			}
//			else if(sum<target){
//				left++;
//				
//			}
//			else {
//				right--;
//			}
//		}
//		return false;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			 int complement = target - arr[i];
			 
//			 if(map.containsKey(complement)) {
//				 map.put(null, null)
//			 }
			 if(set.contains(complement)) {
				 result[0]=complement;
				 result[1] = arr[i];
	             return result;
			 }
			
			 set.add(arr[i]);
			
		}
		return new int[0];
	}

}
