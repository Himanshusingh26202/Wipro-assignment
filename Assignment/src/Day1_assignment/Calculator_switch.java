package Day1_assignment;
import java.util.*;
public class Calculator_switch {

	public static void main(String[] args) {
		
   Scanner sc= new Scanner(System.in);
   System.out.print("Enter first number: ");
   double num1 = sc.nextDouble();

   System.out.print("Enter operator (+, -, *, /): ");
   char op = sc.next().charAt(0);

   System.out.print("Enter second number: ");
   double num2 = sc.nextDouble();

   double result;

   switch (op) {
       case '+': result = num1 + num2; 
       break;
       case '-': result = num1 - num2;
       break;
       case '*': result = num1 * num2;
       break;
       case '/': result = num1 / num2;
       break;
       default: 
           System.out.println("Invalid operator.");
           return;
          
   }

   System.out.println("Result: " + result);
   
	}

}
