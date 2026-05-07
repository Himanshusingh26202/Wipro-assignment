package Day1_assignment;
import java.util.*;
public class Leap_year {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the check leap year :");
	  int year= sc.nextInt();
	  if((year % 400 == 0) || year % 4 == 0 && year % 100 != 0 )
	  {
		  System.out.print("it's a leap year");
	  }
	  else 
	  {
		  System.out.print("it's not a leap year");
	  }
  }
}
