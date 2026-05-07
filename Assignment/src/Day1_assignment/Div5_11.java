package Day1_assignment;
import java.util.*;
public class Div5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		 
	      if(num % 5 == 0 && num %11 == 0) {
	    	  System.out.println(num + " divisible");
	      }
	      else {
	    	  System.out.println(" not divisible ");
	      }
		}
	}


