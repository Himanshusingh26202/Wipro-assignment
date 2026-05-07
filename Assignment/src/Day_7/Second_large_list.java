package Day_7;
import java.util.*;
public class Second_large_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the no. of element: ");
  int n = sc.nextInt();
  List<Integer> list = new ArrayList<>();
  System.out.println("enter element of array list: ");
  for(int i = 0; i < n;i++) {
	  list.add(sc.nextInt());
  }
  int result = findSecondLargest(list);

  if (result == Integer.MIN_VALUE) {
      System.out.println("Second largest element not found");
  } else {
      System.out.println("Second Largest Element: " + result);
  }

  sc.close();
	}
	 public static int findSecondLargest(List<Integer> list) {
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : list) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }
}
