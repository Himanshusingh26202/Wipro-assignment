package Day3_Assignment;
import java.util.*;
public class Asce_desc_sort {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       Integer[] arr = new Integer[n];
       
       System.out.println("Enter " + n + " numbers:");
       for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       
       Arrays.sort(arr);
       System.out.println("Ascending: " + Arrays.toString(arr));
       
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.println("Descending: " + Arrays.toString(arr));
       sc.close();
       
	}

}
