package Day_7;

import java.util.HashSet;
import java.util.Arrays;

public class Intersection_Hashset {

	public static void main(String[] args) {
		
HashSet<Integer> set1 = new HashSet<>(Arrays.asList(5,3,6,2,7));
HashSet<Integer> set2 = new HashSet<>(Arrays.asList(8,4,6,3,9));
 set1.retainAll(set2);
 System.out.println("Common Integer:" + set1);
	}

}
