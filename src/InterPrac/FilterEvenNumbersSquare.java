package InterPrac;

import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbersSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Use Java 8 streams to filter even numbers and square them:
		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		System.out.println("filter even numbers and square them : " + filterEvenAndSq(nums));
	}

	private static List<Integer> filterEvenAndSq(List<Integer> nums) {
		// TODO Auto-generated method stub
		if (nums.isEmpty())
			return null;
		List<Integer> result = nums.stream()
				.filter(i -> i % 2 == 0)
				.map(i -> i * i)
				.collect(Collectors.toList());
		return result;
	}

}
