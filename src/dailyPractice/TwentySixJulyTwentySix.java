package dailyPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwentySixJulyTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(5, 3, 6, 2, 7, 8, 1, 9, 4);
		System.out.println("Find Even Number: " + findEvenNumber(list));
		
		System.out.println("Square of every number: " + squareOfEveryNumber(list));

		System.out.println("Sorted list of Numbers: " + toSortNum(list));

		System.out.println("Sort in descending order: " + toSortInDecOrder(list));

		List<Integer> list2 = Arrays.asList(5, 4, 3, 6, 2, 7, 6, 8, 2, 1, 9, 4);

		System.out.println("Remove duplicates : " + removeDuplicatesFromNumList(list2));
		System.out.println("Find first Even number: "+findFirstEvenNumber(list));
		
		System.out.println("Count Even numbers: "+countEvenNumber(list));
		
		List<Employee> emp = Arrays.asList(new Employee(1,"Amit", "IT",20000,26),
	            new Employee(2,"Neha", "HR",4000,22),
	            new Employee(3,"Ravi", "IT",5000,24),
	            new Employee(4,"Sai", "Devops",6000,26)
	        );
		
		System.out.println("Employee salary > 50000 : "+getEmpSalaryGrtFiveK(emp));
		
		System.out.println("Group Employee by department: "+getEmployeeByDeparment(emp));
		
		System.out.println("Highest salary employee: "+getHighestSalaryEmployee(emp));
	}

	private static Employee getHighestSalaryEmployee(List<Employee> emp) {
		// TODO Auto-generated method stub
//		return emp.stream().mapToLong(Employee::getSalary).max().orElse(0);
		
		return emp.stream()
		        .max(Comparator.comparing(Employee::getSalary))
		        .orElse(null);
	}

	private static Map<String, List<Employee>> getEmployeeByDeparment(List<Employee> emp) {
		return emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
	}

	private static List<String> getEmpSalaryGrtFiveK(List<Employee> emp) {
		
		return emp.stream().filter(e->e.getSalary()>5000).map(Employee::getName).collect(Collectors.toList());
	}

	private static long countEvenNumber(List<Integer> list) {
		return list.stream().filter(i->i%2==0).count();
	}

	private static Integer findFirstEvenNumber(List<Integer> list) {

		return list.stream().filter(i -> i % 2 == 0).findFirst().orElseThrow(() ->
        new RuntimeException("No Even Number Found"));
	}

	private static List<Integer> removeDuplicatesFromNumList(List<Integer> list2) {
		return list2.stream().distinct().toList();
	}

	private static List<Integer> toSortInDecOrder(List<Integer> list) {
		return list.stream().sorted(Comparator.reverseOrder()).toList();
	}

	private static List<Integer> toSortNum(List<Integer> list) {
		return list.stream().sorted().toList();
	}

	private static List<Integer> squareOfEveryNumber(List<Integer> list) {
		return list.stream().map(i -> i * i).toList();
	}

	private static List<Integer> findEvenNumber(List<Integer> list) {

		return list.stream().filter(i -> i % 2 == 0).toList();
	}

}
