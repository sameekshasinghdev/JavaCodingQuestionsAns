package InterPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class tenEchCopilotQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		🔹 Java Collections
//		- Find the first non-repeated character in a string using HashMap.
//		Input: "swiss" → Output: "w"

		String s = "swiss";
		System.out.println("Find the first non-repeated character in a string using HashMap. : "+nonRepChar(s));
//		- Count word frequency in a sentence using HashMap.
//		Input: "Java is Java" → Output: {Java=2, is=1}
		String s1 = "Java is Java";
		System.out.println("Count word frequency in a sentence using HashMap. : " + countWords(s1));
//		- Merge two HashMaps and resolve key conflicts.
//		Input: {a=1, b=2} + {b=3, c=4} → Output: {a=1, b=5, c=4}
		Map<Character,Integer> m1 = Map.of('a',1,'b',2);
		Map<Character,Integer> m2 = Map.of('b',3,'c',4);
		System.out.println("Merge two HashMaps and resolve key conflicts. : "+mergeHashMap(m1,m2));
		
//		- Sort a HashMap by values.
//		Input: {a=3, b=1, c=2} → Output: [b=1, c=2, a=3]
		Map<Character,Integer> m3 = Map.of('a',3,'b',1,'c',2);
		System.out.println("Sort a HashMap by values. : " + sortHashMapByValues(m3));
//		- Implement LRU cache using LinkedHashMap.
//		Input: capacity=2, put(1,1), put(2,2), put(3,3) → Output: {2=2, 3=3}
//		- Find intersection of two lists.
//		Input: [1,2,3] & [2,3,4] → Output: [2,3]
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(2,3,4);
		System.out.println("Find intersection of two lists. : "+intersectionOfListAt(l1,l2));
//		- Remove duplicates from a list using Set.
//		Input: [1,2,2,3] → Output: [1,2,3]
		List<Integer> l3 = Arrays.asList(1,2,2,3);
		System.out.println("Remove duplicates from a list using Set. : "+removeDuplicatesFromList(l3));
//		- Find top‑K frequent elements.
//		Input: [1,1,2,2,2,3], k=2 → Output: [2,1]
		List<Integer> l4 = Arrays.asList(1,1,2,2,2,3);
		int k=2;
		System.out.println("Find top k frequent elements : "+topKfreqElement(l4,k));
//		- Check if two strings are anagrams using Map.
//		Input: "listen", "silent" → Output: true
//		- Implement custom comparator for sorting employees by salary.
//		Input: [E1:5000, E2:3000] → Output: [E2, E1]
//
//		🔹 Java Streams
//		- Reverse a string using streams.
//		Input: "hello" → Output: "olleh"
//		- Find sum of even numbers.
//		Input: [1,2,3,4] → Output: 6
//		- Convert list of strings to uppercase.
//		Input: ["a","b"] → Output: ["A","B"]
//		- Find distinct elements.
//		Input: [1,2,2,3] → Output: [1,2,3]
//		- Group words by length.
//		Input: ["hi","java","code"] → Output: {2=[hi],4=[java,code]}
//		- Partition numbers into even/odd.
//		Input: [1,2,3] → Output: {true=[2], false=[1,3]}
//		- Find max element.
//		Input: [5,2,9] → Output: 9
//		- Join strings with delimiter.
//		Input: ["a","b","c"] → Output: "a-b-c"
//		- Count frequency of characters.
//		Input: "banana" → Output: {b=1,a=3,n=2}
//		- Sort list in reverse order.
//		Input: [3,1,2] → Output: [3,2,1]
//
//		🔹 Java Generics
//		- Implement a generic stack.
//		Input: push(1), push(2), pop() → Output: 2
//		- Generic method to swap two elements in an array.
//		Input: [1,2,3], swap(0,2) → Output: [3,2,1]
//		- Generic class for Pair.
//		Input: Pair("A",1) → Output: "A 1"
//		- Bounded type parameter (Number).
//		Input: sum([1,2,3]) → Output: 6
//		- Generic method to find max element.
//		Input: [3,5,2] → Output: 5
//		- Generic linked list.
//		Input: add("A"), add("B") → Output: [A,B]
//		- Wildcard example: print list of any type.
//		Input: [1,"A"] → Output: 1 A
//		- Generic method to reverse array.
//		Input: [a,b,c] → Output: [c,b,a]
//		- Generic queue.
//		Input: enqueue(1), enqueue(2), dequeue() → Output: 1
//		- Generic method to check equality.
//		Input: isEqual("A","A") → Output: true
//
//		🔹 Multithreading
//		- Print numbers 1–10 using two threads alternately.
//		Output: 1 2 3 4 ...
//		- Producer‑Consumer problem with BlockingQueue.
//		Output: Producer adds → Consumer removes.
//		- Deadlock example with two locks.
//		Output: Threads stuck.
//		- Thread pool example.
//		Input: 5 tasks → Output: executed by pool.
//		- Print odd/even numbers using two threads.
//		Output: 1 2 3 4 ...
//		- Callable + Future example.
//		Input: sum(1..5) → Output: 15
//		- Synchronize counter increment.
//		Input: 1000 threads increment → Output: 1000
//		- Use CountDownLatch.
//		Input: 3 worker threads → Output: "All workers done"
//		- Use CyclicBarrier.
//		Input: 3 threads → Output: "Barrier reached"
//		- Use Semaphore.
//		Input: 2 permits, 5 threads → Output: only 2 run at once.
//
//		🔹 Spring Boot (Backend Focus)
//		- REST API to get all users.
//		Input: GET /users → Output: [{"id":1,"name":"Sam"}]
//		- REST API to add user.
//		Input: POST /users → Output: {"id":2,"name":"Alex"}
//		- Exception handling with @ControllerAdvice.
//		Input: invalid request → Output: 400 Bad Request
//		- Use caching with @Cacheable.
//		Input: GET /product/1 twice → Output: second call from cache.
//		- Use @Autowired constructor injection.
//		Input: Service injected → Output: works.
//		- Pagination in JPA.
//		Input: GET /users?page=0&size=2 → Output: 2 users.
//		- Sorting in JPA.
//		Input: GET /users?sort=name → Output: sorted list.
//		- Custom query with @Query.
//		Input: GET /users/search?name=Sam → Output: [Sam]
//		- Global exception handler.
//		Input: invalid ID → Output: 404 Not Found
//		- Scheduler with @Scheduled.
//		Input: cron job → Output: prints every 5s.


	}

	private static List<Integer> topKfreqElement(List<Integer> l4, int k) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> freqMapOfInt = new LinkedHashMap<Integer,Integer>();
		for(int i: l4) {
			freqMapOfInt.put(i, freqMapOfInt.getOrDefault(i, 0)+1);
		}
		List<Integer> topFreqList = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, Integer> entry : freqMapOfInt.entrySet()) {
			if(entry.getValue()>1) {
				topFreqList.add(entry.getValue());
			}
		}
		return topFreqList;
	}

	private static List<Integer> removeDuplicatesFromList(List<Integer> l3) {
		// TODO Auto-generated method stub
		Set<Integer> distList= new LinkedHashSet<Integer>(l3);
		List<Integer> nwList = new ArrayList<Integer>(distList);
		
		return nwList;
	}

	private static List<Integer> intersectionOfListAt(List<Integer> l1, List<Integer> l2) {
		// TODO Auto-generated method stub
		List<Integer> interList = new ArrayList<Integer>();
		for(int i : l1) {
			if(l2.contains(i)) {
				interList.add(i);
			}
		}
		return interList;
	}

	private static Character nonRepChar(String s) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : s.toCharArray()){
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		for(char ch: s.toCharArray()){
			if(map.get(ch)==1){
				return ch;
			}
		}
		return null;
	}
	
	private static Map<String,Integer> countWords(String s1) {
		// TODO Auto-generated method stub
		String[] str = s1.split(" ");
		Map<String,Integer> freqMap = new HashMap<String,Integer>();
		for(String word : str){
			freqMap.put(word,freqMap.getOrDefault(word,0)+1);
		}
		
		return freqMap;
	}
	
	private static Map<Character,Integer> mergeHashMap(Map<Character,Integer> m1, Map<Character,Integer> m2){
		Map<Character, Integer> mergedMap = new HashMap<>(m1);
		m2.forEach((key,value)->mergedMap.merge(key, value, Integer::sum));
		return mergedMap;
		
	}
	
	private static Map<Character,Integer> sortHashMapByValues(Map<Character,Integer> m3){
		return m3.entrySet()
                .stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // merge function (not used here)
                        LinkedHashMap::new // maintain insertion order
                ));
		
	}

}

