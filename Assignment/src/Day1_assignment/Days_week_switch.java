package Day1_assignment;
import java.util.*;
public class Days_week_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a day number: ");
	        int dayNumber = sc.nextInt();
	        
	        // Switch case to determine the day of the week
	        switch (dayNumber) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid input! Please enter a number between 1 and 7.");
	                break;
	        }
	}

}
