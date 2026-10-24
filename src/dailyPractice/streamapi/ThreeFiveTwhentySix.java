package dailyPractice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeFiveTwhentySix {

	public static void main(String[] args) {
		// TODO STREAM API
		//TODO BASIC LEVEL
		//1. Filter Even Numbers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		System.out.println("1. Filter Even Numbers: "+filterEvenNum(list));
		List<String> sList = Arrays.asList("java", "spring", "boot");
		System.out.println("2. Convert List<String> → Uppercase : "+convertToUpperCase(sList));
		List<Integer>l1= Arrays.asList(5,8,12,20);
		System.out.println("3. Find First Element > 10 : "+findFirstGreaterThanTen(l1));
		List<String> l2 = Arrays.asList("Apple", "Banana", "Avocado", "Mango");
		System.out.println("4. Count Strings starting with 'A' : "+countStringsStartingWithA(l2));
	
	
	}

	private static long countStringsStartingWithA(List<String> l2) {
		return l2.stream().filter(s->s.startsWith("A")).count();
	}

	private static int findFirstGreaterThanTen(List<Integer> l1) {
		return l1.stream().filter(i->i>10).findFirst().orElseThrow();
	}

	private static List<String> convertToUpperCase(List<String> sList) {
		return sList.stream().map(s->s.toUpperCase()).toList();
	}

	private static List<Integer> filterEvenNum(List<Integer> list) {
		
		return list.stream().filter(i->i%2==0).toList();
	}

}
