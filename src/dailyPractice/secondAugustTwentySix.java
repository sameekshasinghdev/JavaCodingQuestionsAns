package dailyPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class secondAugustTwentySix {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 4, 6, 8);

		System.out.println("Find the sum of all numbers:" + getSumOfAll(list));

		System.out.println("Find the product: " + getProductOfAll(list));

		List<List<String>> list1 = Arrays.asList(Arrays.asList("Java", "Spring"), Arrays.asList("Kafka", "AWS"),
				Arrays.asList("Docker"));

		System.out.println("Flatan the given list : " + toFlatenTheGivenList(list1));
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("Partion by even odd: " + partition(list2));

		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 50000, 28),
				new Employee(2, "Neha", "HR", 40000, 25), new Employee(3, "Rahul", "IT", 70000, 32),
				new Employee(4, "Priya", "Finance", 65000, 29), new Employee(5, "Ankit", "IT", 70000, 30),
				new Employee(6, "Sneha", "HR", 55000, 27));

		System.out.println("Highest Salary Department Wise: " + getHighestSalaryDepartmentWise(employees));
		System.out.println("Top 3 highest-paid employees: "+ getTopThreeHighestPaidEmployees(employees));
//		Count character frequency using Streams
//		Find duplicate numbers
//		Find duplicate characters
//		Join strings using Collectors.joining()
//		Department-wise average salary
//		Convert List<Employee> to Map<Integer, Employee> safely
//		Find employees older than 28
//		Sort by department, then salary
//		Find the second-highest distinct salary
	
	
	}

	private static String getTopThreeHighestPaidEmployees(List<Employee> employees) {
		
		return null;
	}

	private static Map<String, Employee> getHighestSalaryDepartmentWise(List<Employee> employees) {

//		return employees.stream()
//				.collect(Collectors
//						.groupingBy(Employee::getDepartment,
//								Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

		return employees.stream()
				.collect(
						Collectors.groupingBy(
								Employee::getDepartment, 
								Collectors.collectingAndThen(
				Collectors.maxBy(
						Comparator.comparingDouble(Employee::getSalary)), 
				Optional::orElseThrow)));
	}

	private static Map<Boolean, List<Integer>> partition(List<Integer> list2) {
		return list2.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
	}

	private static List<String> toFlatenTheGivenList(List<List<String>> list1) {
		return list1.stream().flatMap(Collection::stream).toList();
	}

	private static int getProductOfAll(List<Integer> list) {
		return list.stream().reduce(1, (x, y) -> x * y);
	}

	private static int getSumOfAll(List<Integer> list) {
		// return list.stream().mapToInt(Integer::intValue).sum();

		return list.stream().reduce(0, Integer::sum);
	}

}
