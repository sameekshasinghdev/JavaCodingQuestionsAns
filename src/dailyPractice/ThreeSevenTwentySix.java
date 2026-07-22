package dailyPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSevenTwentySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> whitelist = new HashSet<>(Arrays.asList("INS1001","INS1002","INS1005"));
		String x = "INS1002";
		System.out.println("Is instrument Exist : "+ isInsExist(whitelist,x));
		
		List<Integer> Transactions = Arrays.asList(300000,250000);
		int dailyLimit =500000;
		System.out.println("Remaining quota when daily limit is "+ dailyLimit + " : "+quota(Transactions,dailyLimit));
		
		List<String> txnId = Arrays.asList("TXN1001","TXN1002", "TXN1003", "TXN1002","TXN1005","TXN1001");
		System.out.println("Duplicate transactionId : "+duplicateTxn(txnId));
		
		//Map<String, Integer> custTxn = Map.of("Amit", 1000,"Rahul", 2500,"Ankit", 500,"Amit", 4000,"Rahul", 1000,"Simran", 9000);
		 List<String> trancations = Arrays.asList(
		            "Amit 1000",
		            "Rahul 2500",
		            "Ankit 500",
		            "Amit 4000",
		            "Rahul 1000",
		            "Simran 9000"
		        );
		System.out.println("Top 3 customer : "+ topThreeCust(trancations));
	
	}
	

	private static List<Entry<String, Integer>> topThreeCust(List<String> trancations) {
		// TODO Auto-generated method stub
//		return custTxn.entrySet()
//				.stream().distinct()
//				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//				.limit(3)
//				.collect(Collectors.toList());
		
		Map<String, Integer> custTxn = new HashMap<>();
        for (String txn : trancations) {
            String[] parts = txn.split(" ");
            String name = parts[0];
            int amount = Integer.parseInt(parts[1]);
            custTxn.put(name, custTxn.getOrDefault(name, 0) + amount);
        }

        List<Map.Entry<String, Integer>> top3 = custTxn.entrySet()
            .stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .limit(3)
            .collect(Collectors.toList());

        
        top3.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        return top3;
	}


	private static List<String> duplicateTxn(List<String> txnId) {
		// TODO Auto-generated method stub
		Map<String, Long> freqMap = txnId.stream().collect(Collectors.groupingBy(id->id, Collectors.counting()));
		
		return freqMap.entrySet()
				.stream()
				.filter(e->e.getValue() >1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}

	private static String quota(List<Integer> transactions, int dailyLimit) {
		// TODO Auto-generated method stub
//		if(transactions == null) {
//			return dailyLimit;
//		}
//		return transactions.stream().reduce(dailyLimit,(c,e)->c-e);
		
		int used = transactions.stream()
                .mapToInt(Integer::intValue)
                .sum();

		if (used > dailyLimit)
		return "Quota Exceeded";
		
		return String.valueOf(dailyLimit - used);
	}

	private static String isInsExist(Set<String> whitelist, String x) {
		if(whitelist.contains(x)) {
			return "APPROVED";
		}
		return "REJECTED";
	}

	

}
