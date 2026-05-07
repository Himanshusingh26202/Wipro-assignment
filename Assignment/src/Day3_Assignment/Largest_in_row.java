package Day3_Assignment;
import java.util.*;
public class Largest_in_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
       System.out.println("Enter the total number of elememt: ");
       int n  = sc.nextInt();
       int[]arr = new int[n];
       System.out.println("Enter the numbers in array: ");
       for(int i=0;i<n;i++) {
    	   arr[i]= sc.nextInt();
       }
           int max = arr[0];
       for (int i = 1; i < n; i++) {
    	   
           if (arr[i] > max) {
               max = arr[i]; 
           }
           
       }

       System.out.println("Largest element: "+ max );

       
	}

}
