package Day_6_assignment;
import java.util.*;

public class Charactor_is_digit {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Character:");
char ch = sc.next().charAt(0);
if(Character.isDigit(ch)) {
	System.out.println(" the Character is Digit");
	
}
else {
	System.out.println(" the Character not digit");
}
sc.close();
}
	

}
