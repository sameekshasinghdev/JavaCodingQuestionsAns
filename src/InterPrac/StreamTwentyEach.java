package InterPrac;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTwentyEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Filter, map, sum, max, distinct
//		Word & character frequency
//		Sorting streams
//		Grouping objects (Employee)
//		FlatMap

//		Q1. Get only even numbers
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Q1. Get only even numbers : " + getOnlyEven(list));
//		Q2. Get numbers > 3
		System.out.println("Q2. Get numbers > 3 : " + greaterThanThree(list));
//		Q3. Square each number
		List<Integer> list1 = Arrays.asList(2, 3, 4);
		System.out.println("Q3. Square each number : " + squareEachNum(list1));
//		Q4. Double each number
		System.out.println("Q4. Double each number : " + doubleEachNum(list1));
//		Q5. Sum of all numbers
		System.out.println("Q5. Sum of all numbers : " + sumOfAllNum(list));
//		Q6. Max value
		List<Integer> list2 = Arrays.asList(5, 2, 9, 1);
		System.out.println("Q6. Max value : " + maxValue(list2));
//		Q7. Remove duplicates
		List<Integer> list3 = Arrays.asList(1, 2, 2, 3, 3);
		System.out.println("Q7. Remove duplicates : " + removeDuplicates(list3));
//		Q8. Odd numbers only
		System.out.println("Q8. Odd numbers only : " + getOnlyOdd(list));
//		Q9. Cube each number
		System.out.println("Q9. Cube each number : " + cubeEachNum(list1));
//		Q10. Numbers divisible by 3
		List<Integer> list4 = Arrays.asList(3, 4, 6, 7, 9, 12);
		System.out.println("Q10. Numbers divisible by 3 : " + numDivByThree(list4));
//		Q11. Sum of even numbers
		System.out.println("Q11. Sum of even numbers : " + sumOfEvenNum(list));
//		Q12. Min value
		System.out.println("Q12. Min value : " + minValue(list2));
//		Q13. Convert int → String
		System.out.println("Q13. Convert int → String : " + convrtIntStr(list));
//		Q14. Length of each word
		List<String> list5 = Arrays.asList("Java", "API");
		System.out.println("Q14. Length of each word : " + lengthOfEachWord(list5));
//		Q15. Numbers > 5 and double
		System.out.println("Q15. Numbers > 5 and double : " + numGrtFiveDbl(list4));
//		Q16. Remove nulls
		List<String> list6 = Arrays.asList("A", null, "B");
		System.out.println("Q16. Remove nulls : " + removeNull(list6));
//		Q17. First number > 5
		System.out.println("Q17. First number > 5 : " + firstNumGrtFiv(list4));
//		Q18. Count numbers > 3
		System.out.println("Q18. Count numbers > 3 : " + countNumGrtThree(list));
//		Q19. Multiply all by 10
		System.out.println("Q19. Multiply all by 10 : " + multiByTen(list));
//		Q20. Check any number > 10
		System.out.println("Q20. Check any number > 10 : " + checkAnyGrtTen(list4));

//******************************************************************************************
		
//		2️ WORD & CHARACTER FREQUENCY (20 Questions)
//		Q21. Word count
		String s1 = "Java is easy Java";
		System.out.println("Q21. Word count : " + wordCount(s1));
		
//		Q22. Character count
		String s2 = "hello";
		System.out.println("Q22. Character count : " + charCount(s2));

//		Q23. Count vowels
		String s3 = "elephant";
		System.out.println("Q23. Count vowels : " + countVowels(s3));

//		Q24. Most frequent word
		String s4 = "hi hi hello";
		System.out.println("Q24. Most frequent word : " + mostFreqWord(s4));
		
//		Q25. Unique words
		String s5 = "Java Java API";
		System.out.println("Q25. Unique words : " + uniqueWords(s5));
//
//		Q26. Count word length
		String Words = "I love Java";
//		Output: {I=1, love=4, Java=4}
		System.out.println("Q26. Count word length : " + countWordLength(Words));
		
//		Q27. First non-repeating char
		String s6 = "aabbc";
		System.out.println("Q27. First non-repeating char : " + firstNonRepChar(s6));

//		Q28. Duplicate characters
		String s7 = "programming";
		System.out.println("Q28. Duplicate characters : " + duplicateChar(s7));

//		Q29. Count uppercase letters
		String s8 = "JavaAPI";
		System.out.println("Q29. Count uppercase letters : " + countUpperCaseChar(s8));
//
//		Q30. Count lowercase letters
		System.out.println("Q30. Count lowercase letters : " + countLowerCaseChar(s8));
//
//		Q31. Word frequency sorted
		String s9= "a a b c";
		System.out.println("Q31. Word frequency sorted : "+wordFreqSorted(s9));
//		Output: {a=2,b=1,c=1}
//
//		Q32. Count spaces
		String s10 ="Hi there ";
		System.out.println("Q32. Count spaces : "+countSpaces(s10));
//		Output: 1
//
//		Q33. Remove duplicate words
		String st1="Java Java Spring";
		System.out.println("Q33. Remove duplicate words : "+ removeDuplicateWords(st1));
//		Output: "Java Spring"
//
//		Q34. Count digits
		String st2="a1b2";
		System.out.println("Q34. Count digits : "+ countDigits(st2));
//		Output: 2
//
//		Q35. Longest word
		String st3="I love programming";
		System.out.println("Q35. Longest word : "+ longestWord(st3));
//		Output: programming
//
//		Q36. Shortest word
		String st4="Java is fun";
		System.out.println("Q36. Shortest word : "+ shortestWord(st4));
//		Output: is
//
//		Q37. Palindrome words
		String st5= "madam level java";
		System.out.println("Q37. Palindrome words : "+palindromeWords(st5));
//		Output: [madam, level]
//
//		Q38. Word starting with J
		String st6= "Java is Joy";
		System.out.println("Q38. Word starting with J : "+wordsStartsWdJ(st6));
//		Output: [Java, Joy]
//
//		Q39. Count words
//		Output: 2
		String st7= "Hello World";
		System.out.println("Q39. Count words : "+countWords(st7));
		
//		Q40. Reverse words
//		Output: "API Java"
		String st8= "Java API";
		System.out.println("Q40. Reverse words : "+reverseWords(st8));
		
//******************************************************************************************	
//		3. SORTING STREAMS (20 Questions)
//		Q41. Sort numbers ASC
//		Input: [5,2,9]
		List<Integer> intLst1=Arrays.asList(5,2,9);
		System.out.println("Q41. Sort numbers ASC : "+sortNumInAsc(intLst1));
//		Output: [2,5,9]
//
//		Q42. Sort numbers DESC
		System.out.println("Q42. Sort numbers DESC : "+sortNumInDesc(intLst1));
//		Output: [9,5,2]
//
//		Q43. Sort strings
//		Input: ["Banana","Apple"]
		List<String> fruits = Arrays.asList("Banana", "Apple","Mango","Guava");
		System.out.println("Q43. Sort strings : "+sorString(fruits));
//		Output: [Apple,Banana]
//
//		Q44. Sort by length
//		Input: ["Java","API","Spring"]
		List<String> lstStr = Arrays.asList("Java","API","Spring");
		System.out.println("Q44. Sort by length : "+sorStringbyLength(lstStr));
//		Output: [API,Java,Spring]
//
//		Q45. Sort map by value
//
//		Input: {A=3,B=1}
		Map<String,Integer> map = Map.of("A",3,"B",1, "E",5,"C",2,"G",9);
		System.out.println("Q45. Sort map by value : "+sortByVal(map));
//		Output: {B=1,A=3}
//
//		Q46. Sort employees by salary
		List<Employee> employees = Arrays.asList(
	            new Employee(1, "Sakshee", "Singh", 8000000, "Devops"),
	            new Employee(2, "Sameeksha", "Singh", 2000000, "Backend Developer"),
	            new Employee(3, "Diksha", "Adhikari", 1200000, "Frontend Developer"),
	            new Employee(4, "Shubhanshi", "Srivastava", 1000000, "Testing"),
	            new Employee(5, "Roshan", "Singh", 1200000, "Backend Developer"),
	            new Employee(6, "Chandan", "Awasthi", 1200000, "Backend Developer"),
	            new Employee(7, "Anuj", "Gautam", 1000000, "Frontend Developer"),
	            new Employee(8, "Bhavana", "Singh", 500000, "Testing"),
	            new Employee(9, "Sukanya", "Chabbra", 500000, "Support"),
	            new Employee(10, "Sarthak", "Khare", 1000000, "Backend Developer")
//	            new Employee(11, "Anuj", "Sharma", 1100000, "Backend Developer")
	        );
		
		System.out.println("Q46. Sort employees by salary : "+ sortEmpBySalAscOrder(employees));	
//Output: Ascending salary list
//
//		Q47. Sort strings DESC
//
//		Input: ["b","a"]
		List<String> st9= Arrays.asList("a","d","b","c");
		System.out.println("Q47. Sort strings DESC : "+sortStringDescOrder(st9));
//		Output: [b,a]
//
//		Q48. Sort numbers > 3
//
//		Input: [1,5,3,4]
		List<Integer> num = Arrays.asList(1,5,3,4);
		System.out.println("Q48. Sort numbers > 3 : "+sortNumGrtThree(num));
//		Output: [4,5]
//
//		Q49. Sort unique numbers
//
//		Input: [3,3,1]
		List<Integer> num1 = Arrays.asList(3,3,1);
		System.out.println("Q49. Sort unique numbers : "+sortUniqueNum(num1));
//		Output: [1,3]
//
//		Q50. Sort words by last letter
//
//		Input: ["cat","dog"]
		List<String> animals = Arrays.asList("cat","dog","cow","lion","tiger","wolf");
		System.out.println("Q50. Sort words by last letter : "+sortWordsByLastLetter(animals));
//		Output: [dog,cat]
//
//		Q51. Sort chars
//
//		Input: "dcba"
		String StrCh = "dcba";
		System.out.println("Q51. Sort chars : "+sortCharacters(StrCh));
//		Output: "abcd"
//
//		Q52. Sort map by key DESC
		System.out.println("Q52. Sort map by key DESC : "+sortMapByKeyInDesc(map));
//		Output: Reverse key order
//
//		Q53. Sort names ignoring case
		List<String> names = Arrays.asList("java","API","springboot");
//		Input: ["java","API"]
		System.out.println("Q53. Sort names ignoring case : "+sortNamesIgnoreCase(names));
//		Output: [API,java]
//
//		Q54. Sort numbers and limit 3
		List<Integer> num2 = Arrays.asList(9,1,5,2,7,4,6);
		System.out.println("Q54. Sort numbers and limit 3 : "+sortNumLimitThree(num2));
//		Input: [9,1,5,2]
//		Output: [1,2,5]
//
//		Q55. Sort then skip 2
		System.out.println("Q55. "+num2+" Sort then skip 2 : "+sortNumSkipTwo(num2));
//		Output: After skipping first 2
//
//		Q56. Sort employees by name
//
//		Output: Alphabetical
		System.out.println("Q56. Sort employees by name : "+sortEmpByName(employees));
//
//		Q57. Sort strings by length DESC
		System.out.println("Q57. Sort strings by length DESC : "+sortStringByLengthDesc(animals));
//		Output: Longest first
//
//		Q58. Sort words alphabetically
		System.out.println("Q58. Sort words alphabetically : "+sortWordsAlphaBatically(animals));
//		Output: Sorted words
//
//		Q59. Sort integers DESC
		System.out.println("Q59. Sort integers DESC : "+sortIntInDesc(num2));
//		Output: Reverse sorted
//
//		Q60. Sort map by value DESC
		System.out.println("Q60. Sort map by value DESC : "+sortMapByValDesc(map));
//		Output: Highest value first
		
//************************************************************************************
//		4️ GROUPING OBJECTS (Employee) – 20 Questions
//
//		Assume:
//
//		class Employee {
//		  int id;
//		  String name;
//		  String dept;
//		  double salary;
//		}
//
//		Q61. Group by department
		System.out.println("Q61. Group by department : "+groupByDepartment(employees));
//		Output: {IT=[...], HR=[...]}
//
//		Q62. Count employees per dept
		System.out.println("Q62. Count employees per dept : "+countEmployeesPerDep(employees));
//		Output: {IT=3, HR=2}
//
//		Q63. Average salary per dept
//
//		Output: {IT=60000, HR=45000}
		System.out.println("Q63. Average salary per dept : "+avgSalPerDept(employees));
//		Q64. Highest paid employee
//		Output: Employee(name=Rahul)
		System.out.println("Q64. Highest paid employee : "+ highestPaidSalary(employees));
//
//		Q65. Employees salary > 50k
//		Output: [Rahul, Neha]
		System.out.println("Q65. Employees salary > 12lpa : "+employeeSalGrtFivftyK(employees));
//
//		Q66. Group by salary range
//		Output: {Low, Medium, High}
		System.out.println("Q66. Group by salary range :"+groupBySalRange(employees));
//
//		Q67. Sort employees by salary
//		Output: Ascending list
		System.out.println("Q67. Sort employees by salary : "+sortEmpBySalary(employees));
//
//		Q68. Map name → salary
//
//		Output: {Rahul=70000}
		System.out.println("Q68. Map name → salary : "+ mapBySalary(employees));
//
//		Q69. Group by name first letter>> "S"
//
//		Output: {R=[Rahul]}
		System.out.println("Q69. Group by name first letter :"+groupByFirstLett(employees));
//
//		Q70. Max salary per dept
//
//		Output: {IT=70000}
		System.out.println("Q70. Max salary per dept : "+maxSalPerDept(employees));
//
//		Q71. Min salary per dept
//
//		Output: {HR=40000}
		System.out.println("Q71. Min salary per dept : "+minSalPerDept(employees));
//		Q72. Total salary per dept
//
//		Output: {IT=180000}
		System.out.println("Q72. Total salary per dept : "+totalSalPerDept(employees));
//		Q73. Count high earners
//
//		Output: 2
		System.out.println("Q73. Count high earners : "+countHighEarnersAllOver(employees));
//		Q74. Employees in IT dept
//
//		Output: List of IT employees
		System.out.println("Q74. Employees in Backend Developer : "+inBackEndDept(employees));
//		Q75. Sort by name
//
//		Output: Alphabetical
		System.out.println("Q75. Sort by first name : "+sortByFirstName(employees));
//		Q76. Group by salary > 50k
//
//		Output: {true=[...], false=[...]}
		System.out.println("Q76. Group by salary > 1100000 : "+grpBysalaryGrt(employees));
//		Q77. Highest paid per dept
//
//		Output: {IT=Rahul}
		System.out.println("Q77. Highest paid per dept : "+highPayedPerDept(employees));
//		Q78. Lowest paid employee
//
//		Output: Amit
		System.out.println("Q78. Lowest paid employee : "+lowestPayedEmployee(employees));
//		Q79. Convert to Set
//
//		Output: Unique employees
//
//		Q80. Employee names only
//
//		Output: [Rahul, Neha]
		System.out.println("Q80. Employee names only : "+employeeNames(employees));
		
//****************************************************************************************************************************************
//		5️⃣ FLATMAP (20 Questions)
//		Q81. Flatten list of lists
//
//		Input: [[1,2],[3,4]]
//		Output: [1,2,3,4]
		List<List<Integer>> lstOflst = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
		System.out.println("Q81. Flatten list of lists : "+flatenLstOfLst(lstOflst));
//
//		Q82. Flatten words
//
//		Input: ["Hi","Java"]
//		Output: [H,i,J,a,v,a]
		List<String> strLst = Arrays.asList("Hi","Java");
		System.out.println("Q82. Flatten words : "+ flatStringInWords(strLst));
//
//		Q83. Unique characters
//
//		Input: ["ab","bc"]
//		Output: [a,b,c]
		List<String> strLst1 = Arrays.asList("ab","bc");
		System.out.println("Q83. Unique characters : "+ uniqueChar(strLst1));
		
//		Q84. All words from sentences
//
//		Input: ["Java is fun"]
//		Output: [Java,is,fun]
		List<String> strLst2 = Arrays.asList("Java is fun");
		System.out.println("Q84. All words from sentences : "+ allWordsFromSent(strLst2));
//		Q85. Flatten employee skills
//
//		Output: [Java,Spring,SQL]
//
//		Q86. Count total elements
//
//		Output: 4
//
//		Q87. Remove duplicates
//
//		Output: Unique list
//
//		Q88. Uppercase all chars
//
//		Output: [A,B,C]
//
//		Q89. Flatten and sort
//
//		Output: Sorted list
//
//		Q90. Flatten map values
//
//		Output: [1,2,3]
//
//		Q91. Unique words from lines
//
//		Output: Unique words
//
//		Q92. Flatten nested arrays
//
//		Output: Single list
//
//		Q93. Flatten and filter
//
//		Output: Only even numbers
//
//		Q94. Count total words
//
//		Output: 5
//
//		Q95. Longest word
//
//		Output: "programming"
//
//		Q96. Flatten and map length
//
//		Output: [2,4]
//
//		Q97. Combine all names
//
//		Output: [A,B,C]
//
//		Q98. Flatten strings to chars
//
//		Output: [J,a,v,a]
//
//		Q99. Distinct after flatten
//
//		Output: Unique chars
//
//		Q100. Group after flatten
//
//		Output: {a=2,b=1}
	}

	private static List<String> allWordsFromSent(List<String> strLst2) {
		// TODO Auto-generated method stub
		return strLst2.stream().flatMap(s->Arrays.stream(s.split(" "))).collect(Collectors.toList());
	}

	private static List<Character> uniqueChar(List<String> strLst1) {
		// TODO Auto-generated method stub
		return strLst1.stream().flatMap(s->s.chars().mapToObj(c->(char)c)).distinct().collect(Collectors.toList());
	}

	private static List<Character> flatStringInWords(List<String> strLst) {
		// TODO Auto-generated method stub
		//["Hi","Java"]
		return strLst.stream().flatMap(s->s.chars().mapToObj(c->(char)c)).collect(Collectors.toList());
	}

	private static List<Integer> flatenLstOfLst(List<List<Integer>> lstOflst) {
		// TODO Auto-generated method stub
		//[[1,2],[3,4]]
		return lstOflst.stream()
				.flatMap(lst->lst.stream())
				.collect(Collectors.toList());
	}

	private static List<String> employeeNames(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().map(e->e.getEmp_first_name()).collect(Collectors.toList());
	}

	private static String lowestPayedEmployee(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().min(Comparator.comparing(Employee::getSalary)).map(e->e.getEmp_first_name()+" "+e.getEmp_last_name()+" from "+ e.getDepartment()+" department.").orElse("non");
	}

	private static Map<String, String> highPayedPerDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
		        .collect(Collectors.groupingBy(
		            Employee::getDepartment,
		            Collectors.collectingAndThen(
		                Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
		                opt -> opt.map(e->e.getEmp_first_name()+" "+e.getEmp_last_name()).orElse("no Employee")
		            )
		        ));
	}

	private static Map<Boolean,List<Employee>> grpBysalaryGrt(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.collect(Collectors
						.groupingBy(e->
						{ 
							if (e.getSalary() > 1100000){return true;}
							else {return false; }
						})
						);
	}

	private static String sortByFirstName(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.sorted(Comparator.comparing(Employee::getEmp_first_name))
						.map(Employee::getEmp_first_name)
						.collect(Collectors.joining(", "));
	}

	private static List<String> inBackEndDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().filter(e->e.getDepartment().equals("Backend Developer")).map(e->e.getEmp_first_name()).collect(Collectors.toList());
	}

	private static long countHighEarnersAllOver(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().filter(e->e.getSalary()>1500000).count();
	}

	private static Map<String, Long> totalSalPerDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingLong(Employee::getSalary)));
	}

	private static Map<String, Long> minSalPerDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.collectingAndThen(
								Collectors.minBy(
										Comparator.comparingLong(Employee::getSalary)),x->x.map(Employee::getSalary).orElse(0L))));
	}

	private static Map<String, Long> maxSalPerDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		//return employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingLong(Employee::getSalary),opt->opt.)));
		return employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparingLong(Employee::getSalary)),
                opt -> opt.map(Employee::getSalary).orElse(0L)
            )
        ));
	}

	private static Map<String, Long> mapBySalary(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().collect(Collectors.toMap(Employee::getEmp_first_name, Employee::getSalary));
	}

	private static Map<String,List<String>> groupByFirstLett(List<Employee> employees) {
		// TODO Auto-generated method stub
		//return employees.stream().collect(Collectors.groupingBy(e->e.getEmp_first_name().startsWith("S"),Collectors.mapping(Employee::getEmp_first_name, Collectors.toList())));
		return employees.stream().filter(e->e.getEmp_first_name().startsWith("S"))
				.collect(Collectors.groupingBy(e -> e.getEmp_first_name().substring(0, 1),
						Collectors.mapping(Employee::getEmp_first_name, Collectors.toList())
						));
	}

	private static Map<String,List<Employee>> groupBySalRange(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.collect(Collectors
						.groupingBy(e->
						{ 
							if (e.getSalary() < 1000000) 
							{
								return "Low";
							}
							else if (e.getSalary() < 3000000) {
								return "Medium";
                            } else {
                            	return "High";
                            }
						}
						));
	}

	private static List<Employee> sortEmpBySalary(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().sorted(Comparator.comparingLong(e->e.salary)).collect(Collectors.toList());
	}

	private static List<String> employeeSalGrtFivftyK(List<Employee> employees) {
		// TODO Auto-generated method stub
		
		return employees.stream().filter(e->e.salary > 1200000).map(e->e.emp_first_name).collect(Collectors.toList());
	}

	private static String highestPaidSalary(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream()
				.max(Comparator.comparingLong(e->e.salary))
				.map(e->"Employee(name="+e.getEmp_first_name()+ ")").orElse("No Employee");
	}

	private static Map<String,Double> avgSalPerDept(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.averagingLong(e->e.salary)));
	}

	private static Map<String,Long> countEmployeesPerDep(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
	}

	private static Map<String,List<Employee>> groupByDepartment(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().collect(Collectors.groupingBy(e->e.department));
	}

	private static Map<String,Integer> sortMapByValDesc(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(Collectors.toMap( Map.Entry::getKey,
	              Map.Entry::getValue,
	              (e1, e2) -> e1,
	              LinkedHashMap::new));
	}

	private static List<Integer> sortIntInDesc(List<Integer> num2) {
		// TODO Auto-generated method stub
		return num2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	private static List<String> sortWordsAlphaBatically(List<String> animals) {
		// TODO Auto-generated method stub
		return animals.stream().sorted().collect(Collectors.toList());
	}

	private static List<String> sortStringByLengthDesc(List<String> animals) {
		// TODO Auto-generated method stub
		return animals.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
	}

	private static List<Employee> sortEmpByName(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().sorted(Comparator.comparing(Employee::getEmp_first_name))
				.collect(Collectors.toList());
	}

	private static List<Integer> sortNumSkipTwo(List<Integer> num2) {
		// TODO Auto-generated method stub
		return num2.stream().skip(2).sorted().collect(Collectors.toList());
	}

	private static List<Integer> sortNumLimitThree(List<Integer> num2) {
		// TODO Auto-generated method stub
		return num2.stream().sorted().limit(3).collect(Collectors.toList());
	}

	private static List<String> sortNamesIgnoreCase(List<String> names) {
		// TODO Auto-generated method stub
//		- String.CASE_INSENSITIVE_ORDER → built-in comparator that ignores case when comparing strings.
//		- This ensures "API" comes before "java", even though lowercase "j" normally sorts before uppercase "A" in ASCII order.

		return names.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
	}

	private static Map<String,Integer> sortMapByKeyInDesc(Map<String, Integer> map) {
		// TODO Auto-generated method stub
//		return map.entrySet().stream().sorted(Map.Entry.comparingByKey(Map.Entry.reversed())).collect(Collectors.toMap(
//                Map.Entry::getKey,
//                Map.Entry::getValue,
//                (e1, e2) -> e1,
//                LinkedHashMap::new // preserve order
//            ));
		return map.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
				.collect(Collectors.toMap(
              Map.Entry::getKey,
              Map.Entry::getValue,
              (e1, e2) -> e1,
              LinkedHashMap::new // preserve order
          ));
	}

	private static String sortCharacters(String strCh) {
		// TODO Auto-generated method stub
		//return strCh.chars().mapToObj(c-> (char)c).sorted().collect(Collectors.joining());
		
//		🔎 Problems
//		- mapToObj(c -> (char)c)
//			- This produces a Stream<Character>.
//			- But Collectors.joining() works only with a Stream<String>, not Stream<Character>.
//			- That’s why the compiler complains.
//		- .sorted()
//			- Works fine, but it’s sorting Character objects.
//			- You need them as String objects to join properly.

		return strCh.chars().mapToObj(c-> String.valueOf((char)c)).sorted().collect(Collectors.joining());
	}

	private static List<String> sortWordsByLastLetter(List<String> animals) {
		// TODO Auto-generated method stub
		return animals.stream().sorted(Comparator.comparing(s -> s.charAt(s.length() - 1))).collect(Collectors.toList());
	}

	private static List<Integer> sortUniqueNum(List<Integer> num1) {
		// TODO Auto-generated method stub
		return num1.stream().distinct().sorted().collect(Collectors.toList());
	}

	private static List<Integer> sortNumGrtThree(List<Integer> num) {
		// TODO Auto-generated method stub
		return num.stream().filter(i-> i>3).sorted().collect(Collectors.toList());
	}

	private static List<String> sortStringDescOrder(List<String> st9) {
		// TODO Auto-generated method stub
		return st9.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

	private static List<Employee> sortEmpBySalAscOrder(List<Employee> employees) {
		// TODO Auto-generated method stub
		return employees.stream().sorted(Comparator.comparingLong(Employee::getSalary)).toList();
	}

	private static Map<String,Integer> sortByVal(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, 
                Map.Entry::getValue, 
                (e1, e2) -> e1, // merge function
                LinkedHashMap::new // preserve order
            ));
	}

	private static List<String> sorStringbyLength(List<String> lstStr) {
		// TODO Auto-generated method stub
		return lstStr.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	}

	private static List<String> sorString(List<String> fruits) {
		// TODO Auto-generated method stub
		return fruits.stream()
                .sorted() // natural ascending order
                .collect(Collectors.toList());
	}

	private static List<Integer> sortNumInDesc(List<Integer> intLst1) {
		// TODO Auto-generated method stub
		//Collections.sort(intLst1, (a, b) -> Integer.compare(a ,b));
		return intLst1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
	}

	private static List<Integer> sortNumInAsc(List<Integer> intLst1) {
		// TODO Auto-generated method stub
//		Collections.sort(intLst1);
		return intLst1.stream()
                .sorted() // natural ascending order
                .collect(Collectors.toList());
	}

	private static String reverseWords(String st8) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList(st8.split("\\s+")); // split by whitespace
        Collections.reverse(words); // reverse the list
        return words.stream().collect(Collectors.joining(" ")); 

	}

	private static Long countWords(String st7) {
		// TODO Auto-generated method stub
//		return Arrays.stream(st7.split(" ")).count();
		return Arrays.stream(st7.trim().split("\\s+")).count();
	}

	private static List<String> wordsStartsWdJ(String st6) {
		// TODO Auto-generated method stub
		return Arrays.stream(st6.split(" ")).filter(s->s.startsWith("J")).toList();
	}

	private static List<String> palindromeWords(String st5) {
		// TODO Auto-generated method stub
		return Arrays.stream(st5.split(" ")).filter(s->isPalindrome(s)).collect(Collectors.toList());
	}

	 private static boolean isPalindrome(String s) {
	        String reversed = new StringBuilder(s).reverse().toString();
	        return s.equalsIgnoreCase(reversed); // case-insensitive palindrome check
	    }


	private static String shortestWord(String st4) {
		// TODO Auto-generated method stub
		return Arrays.stream(st4.split(" ")).min(Comparator.comparingInt(String::length)).orElse("");
	}

	private static String longestWord(String st3) {
		// TODO Auto-generated method stub
		return Arrays.stream(st3.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
	}

	private static Long countDigits(String st2) {
		// TODO Auto-generated method stub
		return st2.chars().filter(Character::isDigit).count();
	}

	private static String removeDuplicateWords(String st1) {
		// TODO Auto-generated method stub
		return Arrays.stream(st1.split(" ")).distinct().collect(Collectors.joining(" "));
	}

	private static Long countSpaces(String s10) {
		// TODO Auto-generated method stub
		
		return s10.chars() // Convert to IntStream of characters
                .filter(ch -> ch == ' ') // Keep only spaces
                .count(); 
	}

	private static Map<String,Long> wordFreqSorted(String s9) {
		// TODO Auto-generated method stub
	//	return Arrays.stream(s9.split(" ")).sorted().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return Arrays.stream(s9.split(" "))
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
	            .entrySet().stream()
	            .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
	            .collect(Collectors.toMap(
	                    Map.Entry::getKey,
	                    Map.Entry::getValue,
	                    (a, b) -> a,
	                    LinkedHashMap::new
	            ));
	}

	private static Long countLowerCaseChar(String s8) {
		// TODO Auto-generated method stub
		return s8.chars().mapToObj(c->(char)c).filter(Character::isLowerCase).count();
	}

	private static Long countUpperCaseChar(String s8) {
		// TODO Auto-generated method stub
		return s8.chars().mapToObj(c->(char)c).filter(Character::isUpperCase).count();
	}

	private static List<Character> duplicateChar(String s7) {
		// TODO Auto-generated method stub
		return s7.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey).toList();
	}

	private static Character firstNonRepChar(String s6) {
		// TODO Auto-generated method stub
//		return s6.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				.entrySet()
//				.stream().map(Map.Entry::getKey).distinct().findAny().orElse(' ');

		Map<Character, Long> freqMap = s6.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, // keeps order
						Collectors.counting()));

		return freqMap.entrySet().stream().filter(e -> e.getValue() == 1) // only non-repeating
				.map(Map.Entry::getKey).findFirst().orElse(' ');
	}

	private static Map<String, Integer> countWordLength(String Words) {
		// TODO Auto-generated method stub
//		return Arrays.stream(Words.split(" ")).collect(Collectors.toMap(word -> word, // key mapper
//				word -> word.length()// value mapper
//		));
		return Arrays.stream(Words.split(" "))
		        .distinct()
		        .collect(Collectors.toMap(
		                Function.identity(),
		                String::length
		        ));

	}

	private static List<String> uniqueWords(String s5) {
		// TODO Auto-generated method stub
		return Arrays.stream(s5.split(" ")).distinct().toList();
	}

	private static String mostFreqWord(String s4) {
		// TODO Auto-generated method stub
//		List<String> lst = Arrays.asList(s4.split(" "));
		return Arrays.stream(s4.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.map(Map.Entry::getKey).findFirst().orElse(" ");
	}

	private static Map<Character, Long> countVowels(String s3) {
		// TODO Auto-generated method stub
		// Define vowels
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		return s3.chars().mapToObj(c -> (char) c).filter(vowels::contains)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	private static Map<Character, Long> charCount(String s2) {
		// TODO Auto-generated method stub
		return s2.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	private static Map<String, Long> wordCount(String s1) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList(s1.split(" "));

		return words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	private static Boolean checkAnyGrtTen(List<Integer> list4) {
		// TODO Auto-generated method stub
		return list4.stream().anyMatch(i -> i > 10);
	}

	private static List<Integer> multiByTen(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().map(i -> i * 10).toList();
	}

	private static long countNumGrtThree(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> i > 3).count();
	}

	private static int firstNumGrtFiv(List<Integer> list4) {
		// TODO Auto-generated method stub
		//return list4.stream().filter(i -> i > 5).findFirst().orElse(0);
		return list4.stream().filter(i -> i > 5)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("No element > 5"));
		
	}

	private static List<String> removeNull(List<String> list6) {
		// TODO Auto-generated method stub
		return list6.stream().filter(Objects::nonNull).collect(Collectors.toList());
	}

	private static List<Integer> numGrtFiveDbl(List<Integer> list4) {
		// TODO Auto-generated method stub
		return list4.stream().filter(i -> i > 5).map(i -> i + i).collect(Collectors.toList());
	}

	private static List<Integer> lengthOfEachWord(List<String> list5) {
		// TODO Auto-generated method stub
		return list5.stream().map(s -> s.length()).collect(Collectors.toList());
	}

	private static List<String> convrtIntStr(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().map(String::valueOf).collect(Collectors.toList());
	}

	private static int minValue(List<Integer> list2) {
		// TODO Auto-generated method stub
		return list2.stream().mapToInt(Integer::intValue).min().getAsInt();
	}

	private static int sumOfEvenNum(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
	}

	private static List<Integer> numDivByThree(List<Integer> list4) {
		// TODO Auto-generated method stub
		return list4.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
	}

	private static List<Integer> cubeEachNum(List<Integer> list1) {
		// TODO Auto-generated method stub
		return list1.stream().map(i -> i * i * i).collect(Collectors.toList());
	}

	private static List<Integer> getOnlyOdd(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
	}

	private static List<Integer> removeDuplicates(List<Integer> list3) {
		// TODO Auto-generated method stub
		return list3.stream().distinct().collect(Collectors.toList());
	}

	private static int maxValue(List<Integer> list2) {
		// TODO Auto-generated method stub
		return list2.stream().mapToInt(Integer::intValue).max().getAsInt();
	}

	private static int sumOfAllNum(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().mapToInt(Integer::intValue).sum();
	}

	private static List<Integer> doubleEachNum(List<Integer> list1) {
		// TODO Auto-generated method stub
		return list1.stream().map(i -> i + i).collect(Collectors.toList());
	}

	private static List<Integer> squareEachNum(List<Integer> list1) {
		// TODO Auto-generated method stub
		return list1.stream().map(i -> i * i).collect(Collectors.toList());
	}

	private static List<Integer> greaterThanThree(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> i > 3).collect(Collectors.toList());
	}

	private static List<Integer> getOnlyEven(List<Integer> list) {
		// TODO Auto-generated method stub

		return list.stream() // to convert in stram of data
				.filter(i -> i % 2 == 0) // filter only even
				.collect(Collectors.toList());// collect in a list
	}

}
