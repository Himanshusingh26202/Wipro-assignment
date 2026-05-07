package First_package;
import java.util.*;

public class Switchcase_dress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your dress size: ");
        int size = sc.nextInt();
        switch(size) {
        case 26: System.out.println("size is xs");
        break;
        case 28: System.out.println("size is s");
        break;
        case 30: System.out.println("size is m");
        break;
        case 32: System.out.println("size is l");
        break;
        case 34: System.out.println("size is xl");
        break;
        case 36: System.out.println("size is xxl");
        break;
        default: System.out.println("Invalid size");
        }
	}

}
