package InterPrac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirtyMinuteChallangeCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= Arrays.asList(1,2,3,4);
		List<Integer> l2 = Arrays.asList(1,2,5,6);
		System.out.println("Merge two list symetriclly : "+mergeListSym(l1,l2));
		List<Integer> lst = Arrays.asList(4, 2, 5, 2, 8, 5, 1, 9);
		System.out.println("Remove duplicates Sort in descending order Return top 3 numbers :" + test1(lst));
		
		String str = "java spring java microservices spring java";
		System.out.println("Find the most frequent word. : "+findMostFreqWord(str));
		
		List<Integer> lst1 = Arrays.asList(2,3,2,4,3);
		System.out.println("Remove duplicates Square each number Sort in descending : "+test3(lst1));
		
		System.out.println("Find second max : "+ test4(lst));
	}

	private static List<Integer> mergeListSym(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<Integer>(l1);
		Set<Integer> s2 = new HashSet<Integer>(l2);
		
		return Stream.concat(l1.stream(), l2.stream()).
				filter(i->!(s1.contains(i) && s2.contains(i))).distinct()
				.collect(Collectors.toList());
	}

	private static int test4(List<Integer> lst) {
		// TODO Auto-generated method stub
		return lst.stream().sorted(Comparator.reverseOrder()).skip(1).max(Comparator.naturalOrder()).orElse(null);
	}

	private static List<Integer> test3(List<Integer> lst1) {
		// TODO Auto-generated method stub
		return lst1.stream().distinct().map(i->i*i).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	private static String findMostFreqWord(String str) {
		// TODO Auto-generated method stub
		return Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.map(Map.Entry::getKey).findFirst().orElse(" ");
	}

	private static List<Integer> test1(List<Integer> lst) {
		// TODO Auto-generated method stub
		return lst.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
	}

}
