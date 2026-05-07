package First_package;

public class Reversenumber {
  public static void main(String[] args)
  {
	  int number = 12345;
	  int reversed = 0;
	  
	  System.out.println("original number: " + number);
	  
	  while (number != 0) {
		  int digit = number % 10;
		  
		  reversed =reversed * 10 + digit;
		  
		  number = number / 10;
	  }
	  
	  System.out.println("Reversed Number: " + reversed);
  }
}
