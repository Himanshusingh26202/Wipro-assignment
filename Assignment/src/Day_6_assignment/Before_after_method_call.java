package Day_6_assignment;

import java.util.Scanner;

public class Before_after_method_call{
	public static void changeValue(int num)
{
	System.out.println("enter number (before change" + num);
	num = num + 10;
	System.out.println("enter number (after change):" + num);
}



	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.print("enter a number:");;
int value= sc.nextInt();
System.out.println("enter number (before change):" + value);
  changeValue(value);
System.out.println("enter number (after change):" + value);
sc.close();
	}

}
