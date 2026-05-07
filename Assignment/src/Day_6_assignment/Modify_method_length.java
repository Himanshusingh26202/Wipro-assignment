package Day_6_assignment;
import java .util.*;
class Box{
	int length;
	Box(int length){
		this.length = length;
		
	}
}

public class Modify_method_length {

	public static void modifyBox(Box b) {
		System.out.println("method(before change:)" +b.length);
		b.length = b.length + 10 ;
		System.out.println("method(after change:)" +b.length);
	}
	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter length:");
  int l = sc.nextInt();
  Box box = new Box(l);
  System.out.println("Before method call: " + box.length);

  modifyBox(box);

  System.out.println("After method call: " + box.length);
  sc.close();
	}

}
