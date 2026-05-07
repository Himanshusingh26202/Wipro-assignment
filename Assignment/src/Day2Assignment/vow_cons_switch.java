package Day2Assignment;
import java.util.Scanner;
public class vow_cons_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a': case 'e': case 'i': case 'o': case 'u':
		case 'A': case 'E': case 'I': case 'O': case 'U':
		System.out.println("Vowel"); 
		break;
		default:
		if (Character.isLetter(ch))
		System.out.println("Consonant"); else
		System.out.println("Not a letter");
		}
	}

}
