package InterPrac;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenceyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,3};
		System.out.println("Frequency of elements : "+ freqOfEl(a));

	}

	private static Map<Integer,Integer> freqOfEl(int[] a) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,Integer> freq = new LinkedHashMap<Integer,Integer>();
		for(int i : a) {
			freq.put(i, freq.getOrDefault(i, 0)+1);
		}
		return freq;
	}

}
