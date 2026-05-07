package Day1_assignment;
import java.util.*;
public class Class_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the percentage: ");
     float per = sc.nextFloat();
     if (per > 100 || per < 0) {
			System.out.println("Invalid percentage. Please enter a value between 0 and 100.");
		}
    else if(per >=75) {
 	   System.out.println("Dist");
    }
    else if ( per >=60 && per<75) {
 	   System.out.println("First class");
    }
    else if ( per >=50 && per<60) {
 	   System.out.println("Second class");
    }
    else if ( per >=40 && per<50) {
 	   System.out.println("pass class");
    }
    else  {
 	   System.out.println("Fail");
    }
     
	}

}
