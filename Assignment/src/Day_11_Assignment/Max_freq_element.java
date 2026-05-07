 package Day_11_Assignment;
import java.util.*;
public class Max_freq_element {

	public static void main(String[] args) {
		
		   int[] arr = {1, 3, 1, 1, 4, 1, 3, 1, 3};

	        Map<Integer, Integer> map = new HashMap<>();

	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        int maxFreq = 0;
	        int maxElement = -1;

	        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > maxFreq) {
	                maxFreq = entry.getValue();
	                maxElement = entry.getKey();
	            }
	        }

	        System.out.println("Element: " + maxElement);
	        System.out.println("Frequency: " + maxFreq);
	}

}
