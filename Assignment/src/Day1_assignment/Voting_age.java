package Day1_assignment;

import java.util.Scanner;

public class Voting_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter your age :");
		  int age= sc.nextInt();
		  if(age >= 18 )
		  {
			  System.out.print("your are eligiable for voting");
		  }
		  else 
		  {
			  System.out.print("it's not eligiable for voting");
		  }
	}

}
