package dailyPractice.hashMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import dailyPractice.Employee;

public class TwentyFourTwentySix {

	public static void main(String[] args) {
		//30/09/3036
		//Given List<Integer> nums = List.of(5, 3, 8, 1, 9, 2), use a stream to return a new list containing only the even numbers, sorted in ascending order.
		List<Integer> nums = List.of(5, 3, 8, 1, 9,8, 2);
		
		System.out.println(evenNum(nums));
		
		//Given a string like "programming", use Java Streams to count how many times each character appears
		String s= "programming";
		
		System.out.println(freqOfChar(s));
		
		//Given List<String> words = List.of("banana", "kiwi", "apple", "fig"), return a list of the words converted to uppercase, sorted by length (shortest first)
		
		List<String> words = List.of("banana", "kiwi", "apple", "fig");
		
		List<String> sortedWords = words.stream().map(String::toUpperCase)
				.sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		
		System.out.println(sortedWords);
		
		//Given List<String> words, use flatMap to return a Set<Character> of every unique character used across all the words 
		
		Set<Character> uniqueChars = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toSet());                         

        System.out.println(uniqueChars);
		
    // Given an  int[] array = {2, 3, 1, 9, 5, 7}; find the 3rd largest number using stream api. also explain the output of each methods
		
        int[] array = {2, 3, 1, 9, 5, 7};
        
        //int largesNum = Arrays.stream(array).max().getAsInt();
        
        int thirdlargesNum = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();
        System.out.println(thirdlargesNum);
        
        
       // Given a list of Employee objects (each with department and salary fields), 
        //find the average salary per department, returning a Map<String, Double>. 
        
        List<Employee> employees = Arrays.asList(
				new Employee(1,"Amit", "IT",20000,26),
	            new Employee(2,"Neha", "HR",4000,22),
	            new Employee(3,"Ravi", "IT",5000,24)
	        );
        
        Map<String, Double> avgSalaryPerDept = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,                
                    Collectors.averagingDouble(Employee::getSalary) 
                ));
        
        System.out.println(avgSalaryPerDept);
		
	}

	private static Map<Character, Long> freqOfChar(String s) {
		Map<Character, Long> freq = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		return freq;
		
	}

	private static List<Integer> evenNum(List<Integer> nums) {
		// TODO Auto-generated method stub
		List<Integer> newList = nums.stream().sorted().distinct().filter(i-> i%2==0).toList();
		return newList;
	}
	
	

}
