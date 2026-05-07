package Day_11_Assignment;
import java.util.*;
public class Sort_map_bykey {

	public static void main(String[] args) {
		  Map<Integer, String> map = new HashMap<>();
	        map.put(3, "C");
	        map.put(1, "A");
	        map.put(2, "B");

	        // Sort using TreeMap
	        Map<Integer, String> sortedMap = new TreeMap<>(map);

	        System.out.println(sortedMap);

	}

}
