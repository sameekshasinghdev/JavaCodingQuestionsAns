package dailyPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirdAugustTwentySix {

	public static void main(String[] args) {
		
		
//		Top 3 highest-paid employees
//		Count character frequency using Streams
		String s = "programming";
		System.out.println("Count character frequency using Streams: "+countCharacterFrequencyUsingStream(s));
		List<Integer> l1= Arrays.asList(1,2,4,3,4,5,6,1,6,7,8,9);
		System.out.println("Find duplicate numbers : "+getDuplicateNumbers(l1));
		
//		Find duplicate characters
		System.out.println("Find duplicate characters : "+getDuplicateCharacters(s));
		String s1= "sit", s2="down";
		System.out.println("Join strings using Collectors.joining() : "+getJoinedStrings(s1,s2));
//		Department-wise average salary
//		Convert List<Employee> to Map<Integer, Employee> safely
//		Find employees older than 28
//		Sort by department, then salary
//		Find the second-highest distinct salary

	}

	private static String getJoinedStrings(String s1, String s2) {
		
		//return s1.chars().mapToObj(c->(char)c).collect(Collectors.joining(),s2);
		return Stream.of(s1,s2)
				.flatMap(s->s.chars()
						.mapToObj(c-> String.valueOf((char)c))).collect(Collectors.joining());
	}

	private static List<Character> getDuplicateCharacters(String s) {
		return s.chars().mapToObj(c->(char)c)
				.collect(
						Collectors.groupingBy(
								Function.identity(),
								Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()>1)
				.map(entry->entry.getKey()).toList();
	}

	private static List<Integer> getDuplicateNumbers(List<Integer> l1) {
		return l1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(entry->entry.getValue()>1)
				.map(entry->entry.getKey()).collect(Collectors.toList());
	}

	private static Map<Character, Long> countCharacterFrequencyUsingStream(String s) {
		return s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	}
	
	

}
