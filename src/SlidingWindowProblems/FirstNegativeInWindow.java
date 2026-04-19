package SlidingWindowProblems;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FirstNegativeInWindow {
//	2. First Negative Number in Every Window of Size K

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		System.out.println("2. First Negative Number in Every Window of Size K: " + Arrays.toString(firstNegInEverWnd(arr, k)));

	}

	private static int[] firstNegInEverWnd(int[] arr, int k) {
		// TODO Auto-generated method stub
		int n = arr.length;
        int[] result = new int[n - k + 1];
        
        Deque<Integer> queue = new LinkedList<>();
        int index = 0;

        for (int i = 0; i < n; i++) {

            // Step 1: Add negative numbers index
            if (arr[i] < 0) {
                queue.add(i);
            }

            // Step 2: Remove out-of-window elements
            if (!queue.isEmpty() && queue.peek() <= i - k) {
                queue.poll();
            }

            // Step 3: Window is formed
            if (i >= k - 1) {
                if (!queue.isEmpty()) {
                    result[index++] = arr[queue.peek()];
                } else {
                    result[index++] = 0;
                }
            }
        }

        return result;
	}

}
