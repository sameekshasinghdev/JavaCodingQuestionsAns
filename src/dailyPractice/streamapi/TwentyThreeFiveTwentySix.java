package dailyPractice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TwentyThreeFiveTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Q1. Print even numbers : "+ getEvenNumbers(nums));
		
		System.out.println("Q2. Print odd numbers : "+ getOddNumber(nums));
		List<Integer> nums1 = Arrays.asList(2,5,7,8,1,10);
		System.out.println("Q3. Numbers greater than 5 : "+ getNumGrtFive(nums1));
		
		System.out.println("Q4. Square every number : "+ getSquareOfEach(nums));
		
		System.out.println("Q5. Cube every number : "+ getCubeOOfEach(nums));
		
		System.out.println("Q6. Convert Integer List to String List : "+ getToString(nums));
		List<String> strList = Arrays.asList("java","spring","api");
		System.out.println("Q7. Convert String to Uppercase : "+ getToUpperCase(strList));
		
		System.out.println("Q8. Find length of every string : "+ getLengthOfWord(strList));
		List<String> strList1 = Arrays.asList("Java",null,"Spring",null);
		System.out.println("Q9. Remove null values : "+ toRemoveAllNull(strList1));
		List<String> strList2 = Arrays.asList("Java","","Spring"," ");
		System.out.println("Q10. Remove blank strings : "+ toRemoveBlanks(strList2));
		List<Integer> list = Arrays.asList(1,2,2,3,3,4);
		System.out.println("Q11. Remove duplicates : "+ toRemoveDuplicates(list));
		
		List<Integer> list1 = Arrays.asList(5,2,8,1);
		System.out.println("Q12. Sort ascending : "+ toAscendingOrder(list1));
		
		System.out.println("Q13. Sort descending : "+ toDescendingOrder(list1));
		
		System.out.println("Q14. Count total elements : "+ toCountTotalElement(list1));
		
		System.out.println("Q15. Count even numbers : "+ toCountEvenElemets(list1));
		System.out.println("Q16. Count odd numbers : "+ toCountOddElemets(list1));
		
		List<String> words = Arrays.asList("Java","Spring","JPA","Kafka");
		System.out.println("Q17. Count strings starting with J : "+ toCountStringStartWithJ(words));
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		System.out.println("Q18. Sum all numbers : "+toSumAll(list2));
		System.out.println("Q19. Sum of even numbers : "+ toSumEven(list2));
		List<Integer> list3 = Arrays.asList(5,2,9,1);
		System.out.println("Q20. Maximum element : "+ toGetMaxElement(list3));
		System.out.println("Q21 Minimum Element : "+ toGetMinElement(list3));
		System.out.println("Q22 Average of Numbers : "+ toGetAverage(list3));
		System.out.println("Q23 Second Highest Number : "+ toGetSecondHighest(list3));
		System.out.println("Q24 Second Smallest Number : "+ toGetSecondSmallest(list3));
		List<Integer> nums2 = Arrays.asList(10,20,50,40,60);
		System.out.println("Q25 Top 3 Highest Numbers : "+ toGetTopThreeHighest(nums2));
		System.out.println("Q26 Find First Element : "+ toGetFirstElement(nums2));
		System.out.println("Q27 Find Last Element : "+ toGetLastElement(nums2));
		System.out.println("Q28 Check Any Number > 50 : "+ toCheckGrtFifty(nums2));
		System.out.println("Q29 Check All Numbers Positive : "+ toCheckAllPositive(nums2));
		List<Integer> nums3 =Arrays.asList(1,2,2,3,3,4);
		System.out.println("Q30 Count Distinct Elements : "+ toCountDistinctElements(nums3));
	}

	private static long toCountDistinctElements(List<Integer> nums3) {
		return nums3.stream().distinct().count();
	}

	private static boolean toCheckAllPositive(List<Integer> nums2) {
		return nums2.stream().allMatch(i -> i > 0);
	}

	private static boolean toCheckGrtFifty(List<Integer> nums2) {
		return nums2.stream().anyMatch(i -> i > 50);
		//return nums2.stream().filter(i->i>50).findAny().orElse(null) != null;
	}

	private static int toGetLastElement(List<Integer> nums2) {
		return nums2.stream().reduce((i, j)->j).orElse(0);
		//return nums2.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(null);
	}

	private static int toGetFirstElement(List<Integer> nums2) {
		return nums2.stream().findFirst().orElse(0);
	}

	private static List<Integer> toGetTopThreeHighest(List<Integer> nums2) {
		return nums2.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
	}

	private static int toGetSecondSmallest(List<Integer> list3) {
		return list3.stream().distinct().sorted().skip(1).findFirst().orElseThrow(() -> new RuntimeException("No second smallest found"));
	}

	private static int toGetSecondHighest(List<Integer> list3) {
		return list3.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new RuntimeException("No second highest found"));
	}

	private static double toGetAverage(List<Integer> list3) {
		return list3.stream().mapToInt(Integer::intValue).average().orElse(0);
	}

	private static int toGetMinElement(List<Integer> nums2) {
		// TODO Auto-generated method stub
		return nums2.stream().min(Integer::compareTo).orElse(0);
	}

	private static int toGetMaxElement(List<Integer> list3) {
		return list3.stream().mapToInt(i->i).max().orElse(0);
		//return list3.stream().max(Integer::compareTo).orElse(0);
	}

	private static int toSumEven(List<Integer> list2) {
		
		return list2.stream().filter(i->i%2==0).mapToInt(i->i).sum();
	}

	private static int toSumAll(List<Integer> list2) {
		return list2.stream().mapToInt(i->i).sum();
	}

	private static long toCountStringStartWithJ(List<String> words) {
		return words.stream().filter(s->s.startsWith("J")).count();
	}

	private static long toCountOddElemets(List<Integer> list1) {
		return list1.stream().filter(i->i%2!=0).count();
	}

	private static long toCountEvenElemets(List<Integer> list1) {
		return list1.stream().filter(i->i%2==0).count();
	}

	private static long toCountTotalElement(List<Integer> list1) {
		return list1.stream().count();
	}

	private static List<Integer> toDescendingOrder(List<Integer> list1) {
		return list1.stream().sorted(Comparator.reverseOrder()).toList();
	}

	private static List<Integer> toAscendingOrder(List<Integer> list1) {
		return list1.stream().sorted().toList();
	}

	private static List<Integer> toRemoveDuplicates(List<Integer> list) {
		return list.stream().distinct().toList();
	}

	private static List<String> toRemoveBlanks(List<String> strList2) {
		return strList2.stream().filter(s->!s.isBlank()).toList();
	}

	private static List<String> toRemoveAllNull(List<String> strList1) {
		return strList1.stream().filter(s->s!=null).toList();
	}

	private static List<Integer> getLengthOfWord(List<String> strList) {
		return strList.stream().map(s->s.length()).toList(); //also .map(String::length)
	}

	private static List<String> getToUpperCase(List<String> strList) {
		return strList.stream().map(s->s.toUpperCase()).toList(); //also map(String::toUpperCase)
	}

	private static List<String> getToString(List<Integer> nums) {
		return nums.stream().map(Object::toString).toList();//.filter(Objects::nonNull) also much clenear way
	}

	private static List<Integer> getCubeOOfEach(List<Integer> nums) {
		return nums.stream().map(i->i*i*i).toList();
	}

	private static List<Integer> getSquareOfEach(List<Integer> nums) {
		return nums.stream().map(i->i*i).toList();
	}

	private static List<Integer> getNumGrtFive(List<Integer> nums1) {
		return nums1.stream().filter(i->i>5).toList();
	}

	private static List<Integer> getOddNumber(List<Integer> nums) {
		return nums.stream().filter(i->i%2!=0).toList();
	}

	private static List<Integer> getEvenNumbers(List<Integer> nums) {
		// TODO Auto-generated method stub
		return nums.stream().filter(i->i%2==0).toList();
	}

}
