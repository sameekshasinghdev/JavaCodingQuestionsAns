package dailyPractice.streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import dailyPractice.streamapi.Emp;

public class ThreeFiveTwentySix_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> list = List.of(
				 new Emp("A", 5000),
				 new Emp("B", 3000),
				 new Emp("C", 7000)
				);
		System.out.println("5. Sort Employees by Salary : "+sortEmpBySalary(list));

	}

	private static List<Emp> sortEmpBySalary(List<Emp> list) {
		// TODO Auto-generated method stub
		return list.stream().sorted(Comparator.comparingLong(e->e.getSalary())).toList();
	}

}
