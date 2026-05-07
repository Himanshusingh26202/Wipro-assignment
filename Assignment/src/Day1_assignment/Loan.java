package Day1_assignment;
import java.util.*;
public class Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

       
        if (age >= 18 && salary >= 25000) {
            System.out.println("you are eligible for the loan.");
        } else {
            System.out.println("you are not eligible for the loan.");
        }
	}

}
