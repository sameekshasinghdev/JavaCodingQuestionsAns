package NinjaCodingPractice;

import java.util.HashMap;
import java.util.Map;

public class FruitInABasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trees
		int[] arr = {1,1,2,3};
		int n = arr.length;
		System.out.println(findMaxFruits(arr,n));

	}

	private static int findMaxFruits(int[] arr, int n) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            basket.put(arr[right], basket.getOrDefault(arr[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(arr[left], basket.get(arr[left]) - 1);
                if (basket.get(arr[left]) == 0) {
                    basket.remove(arr[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
	}

}
