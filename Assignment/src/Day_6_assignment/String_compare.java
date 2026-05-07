package Day_6_assignment;
import java.util.*;
public class String_compare {

	public static void main(String[] args) {
		
Scanner sc = new Scanner (System.in);
System.out.println("Enter the first String:");
String str1= sc.nextLine();
System.out.println("Enter the second String:");
String str2= sc.nextLine();

if(str1.equals(str2)) {
	System.out.println("String are equal");
}
else {
	System.out.println("String is not equal");
}
sc.close();
	}

}
