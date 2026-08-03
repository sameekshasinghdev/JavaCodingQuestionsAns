package dailyPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneAugustTwentySix {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Amit", "IT", 50000, 28),
				new Employee(2, "Neha", "HR", 40000, 25), new Employee(3, "Rahul", "IT", 70000, 32),
				new Employee(4, "Priya", "Finance", 65000, 29), new Employee(5, "Ankit", "IT", 70000, 30),
				new Employee(6, "Sneha", "HR", 55000, 27));
		
		System.out.println("Highest salary employee: "+ getHighestSalaryEmployee(employees));
		
		System.out.println("Second Highest Salary Employee : "+ getSecondHighestSalaryEmployee(employees));
		
		System.out.println("Find Average Salary: "+ getAverageSalary(employees));
	
		System.out.println("Group Employees by Department: "+ toGroupEmployeesByDepartment(employees));
		
		System.out.println("Count Employees Department-wise : "+getEmployeesCountFromDepartments(employees));
		
		System.out.println("Find Youngest Employee: "+getYoungestEmployee(employees));
		
		System.out.println("Find Oldest Employee: "+ getOldestEmployee(employees));
		
		System.out.println("Sort Employees by Salary Descending: "+ sortEmployeesBySalaryInDesc(employees));
		
		System.out.println("Convert List to map: "+ getMapOfEmployees(employees));
		
		System.out.println("Print only employee name: "+ getEmployeeNames(employees));
	}
	

	private static List<String> getEmployeeNames(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().map(Employee::getName).toList();
	}


	private static Map<Integer,Employee> getMapOfEmployees(List<Employee> employees) {
		return employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
	}


	private static List<String> sortEmployeesBySalaryInDesc(List<Employee> employees) {
		
		return employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).collect(Collectors.toList());
	}


	private static String getOldestEmployee(List<Employee> employees) {
		return employees.stream()
				.sorted(Comparator.comparing(Employee::getAge)
						.reversed()).findFirst()
				.map(Employee::getName).orElse("No Employee");
	}


	private static String getYoungestEmployee(List<Employee> employees) {
		
		return employees.stream().sorted(Comparator.comparing(Employee::getAge)).findFirst()
				.map(Employee::getName).orElse(null);
	}


	private static Map<String, Long> getEmployeesCountFromDepartments(List<Employee> employees) {
		
		return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	}


	private static Map<String, List<String>> toGroupEmployeesByDepartment(List<Employee> employees) {
		
		return employees.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())));
	}


	private static Double getAverageSalary(List<Employee> employees) {
		
		return employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
	}


	private static Employee getSecondHighestSalaryEmployee(List<Employee> employees) {
		
		return employees.stream().distinct().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null);
	}

	private static Employee getHighestSalaryEmployee(List<Employee> employees) {
		
		return employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
	}

}
