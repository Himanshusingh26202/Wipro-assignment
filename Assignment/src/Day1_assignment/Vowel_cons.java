package Day1_assignment;
import java.util.*;
public class Vowel_cons {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Alphabet in lower case :");
	 char ch = sc.next().charAt(0);
	 if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u')
	 {
		 System.out.println("These alphabet is vowels");
		 
	 }
	 else {
		 System.out.println("these are consonant");
	 }
	 
 }
}
