package InterPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sort Hash Map by values
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 2);
		map.put(2, 1);
		map.put(4, 4);
		map.put(3, 2);
		map.put(7, 12);
		map.put(5, 1);
		map.put(9, 6);
		System.out.println("Sort Hash map by values : ");
		sortHashMap(map);
		// Remove duplicates using Streams
		List<Integer> list = List.of(1, 2, 2, 3);
		System.out.println("Remove duplicates using Streams : " + removeDuplicates(list));
		// Find max value
		System.out.println("Find max value : " + findMaxValue(list));
		// Even numbers only
		System.out.println("Even numbers only : " + evenNumberOnly(list));
		// Sum of all numbers
		System.out.println("Sum of all numbers : " + sumOfAll(list));
		// **********************************************************************
		// Count Frequency of Words
		String s = "Java is easy and Java is powerful";
		System.out.println("Count Frequency of Words : " + countFreqOfWords(s));
		// Find Duplicate Elements in List
		List<Integer> numList = List.of(1, 2, 3, 2, 4, 5, 1);
		System.out.println("find Duplicate Elements in List : " + findDuplicate(numList));
		// Sort List in Ascending Order
		List<Integer> numList1 = new ArrayList<>(List.of(5,2,9,1));
		System.out.println("Sort List in Ascending Order : " + sortListInAscendingOrder(numList1));
		//Sort Map by Key
		Map<Integer,Character> map1 = new HashMap<Integer,Character>();
		map1.put(3, 'A');
		map1.put(1, 'B');
		map1.put(2, 'C');
		System.out.println("Sort Map by Key :"+sorMapByKey(map1));
		//Find First Repeated Character
		String s1="programming";
		System.out.println("First Repeated :"+firstRepeatedChar(s1));
		//Remove Null Values from List
		List<String> list1 = Arrays.asList("A", null, "B", null, "C");
		System.out.println("Remove Null Values from List : "+removeNullFromLst(list1));
		//Group Number even and odd
		List<Integer> list2 = Arrays.asList(1,2,3,4,5);
		System.out.println("Group Number even and odd :");
		groupNumberEvenOdd(list2);
		//Find Highest Value from Map
		Map<String,Integer> map2 = Map.of("A",10,"B",40,"C",20);
		System.out.println("Find Highest Value from Map :"+highestValueFromMap(map2));
		//covert list to set
		List<Integer> list3 = Arrays.asList(1,2,2,3);
		System.out.println("Convert list to Set: "+listToSet(list3));
		//Count Characters in String
		String s2 = "hello";
		System.out.println("Count Characters in String : "+countCharInString(s2));
	}
	

	private static Map<Character,Long> countCharInString(String s2) {
		// TODO Auto-generated method stub
		return s2.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors
						.groupingBy(Function.identity(),Collectors.counting()));
	}


	private static Set<Integer> listToSet(List<Integer> list3) {
		// TODO Auto-generated method stub
		//Set<Integer> set = new LinkedHashSet<Integer>();
		//set = list3.stream().collect(Collectors.toSet());
		return new LinkedHashSet<>(list3);
	}

	private static int highestValueFromMap(Map<String, Integer> map2) {
		// TODO Auto-generated method stub
		
		return map2.values().stream().max(Integer::compare).orElse(0);
	}

	private static void groupNumberEvenOdd(List<Integer> list2) {
		// TODO Auto-generated method stub
		Map<Boolean,List<Integer>> result =list2.stream()
				.collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println("even list : "+result.get(true));
		System.out.println("odd list : "+result.get(false));
	}

	private static List<String> removeNullFromLst(List<String> list1) {
		// TODO Auto-generated method stub
		return list1.stream()
				.filter(Objects::nonNull)
				.collect(Collectors.toList());
	}

	private static Character firstRepeatedChar(String s1) {
		// TODO Auto-generated method stub
		//LinkedHashMap<Character, Integer> freqChar = new LinkedHashMap<Character, Integer>();
		Set<Character> set = new HashSet<Character>();
		Character c=' ';
		for(char ch: s1.toCharArray()) {
			//freqChar.put(ch, freqChar.getOrDefault(ch, 0)+1);
			if(!set.add(ch)) {
		        c=ch;
		        break;
		    }
		}
		//System.out.println(freqChar);
		return c;
	}

	private static Map<Integer,Character> sorMapByKey(Map<Integer, Character> map1) {
		// TODO Auto-generated method stub
		//return map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(p -> p[0], p -> p[1]));
		return map1.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey,          // Key mapper
                Map.Entry::getValue,        // Value mapper
                (oldValue, newValue) -> oldValue, // Merge function
                LinkedHashMap::new          // Preserve order
        ));
		
	}

	private static List<Integer> sortListInAscendingOrder(List<Integer> numList1) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(numList1); // because List.of() is immutable
		Collections.sort(list);
		return list;
	}

	private static List<Integer> findDuplicate(List<Integer> numList) {
		// TODO Auto-generated method stub
//		HashMap<Integer,Integer> dup = new HashMap<Integer,Integer>();
//		List<Integer> duplicate = new ArrayList<Integer>();
//		for(int i: numList) {
//			dup.put(i, dup.getOrDefault(i, 0)+1);
//		}
//		for(int i: numList) {
//			if(dup.get(i)>1) {
//				if(!duplicate.contains(i)) {
//					duplicate.add(i);
//				}
//				
//			}
//		}
//		return duplicate;

		Set<Integer> set = new HashSet<>();
		List<Integer> dup = numList.stream().filter(i -> !set.add(i)).collect(Collectors.toList());

		return dup;
	}

	private static Map<String, Integer> countFreqOfWords(String s) {
		// TODO Auto-generated method stub
		String[] words = s.split(" ");
		LinkedHashMap<String, Integer> freqWord = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			freqWord.put(word, freqWord.getOrDefault(word, 0) + 1);
		}
		// Arrays.stream(words).map(String.)
		return freqWord;
	}

	private static int sumOfAll(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().mapToInt(Integer::intValue).sum();
	}

	private static List<Integer> evenNumberOnly(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	private static int findMaxValue(List<Integer> list) {
		// TODO Auto-generated method stub

		return list.stream().max(Integer::compare).orElse(0);
	}

	private static List<Integer> removeDuplicates(List<Integer> list) {
		// TODO Auto-generated method stub
		return list.stream().distinct().collect(Collectors.toList());
	}

	private static void sortHashMap(HashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		if (map.isEmpty())
			System.out.println("Map is empty");
		;
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		// return map;
	}

}
