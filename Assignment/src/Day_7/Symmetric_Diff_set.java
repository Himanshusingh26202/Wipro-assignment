package Day_7;

import java.util.Arrays;
import java.util.HashSet;

public class Symmetric_Diff_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(5,3,6,2,7));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(8,4,6,3,9));
		
		HashSet<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		
		HashSet<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		
		union.removeAll(intersection);
		System.out.println("Symmetric Difference:" + union);
	}

}
