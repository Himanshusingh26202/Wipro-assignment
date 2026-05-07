package List_set;
import java.util.LinkedList;
public class Add_1st_last_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = new LinkedList<Integer>();
		ArrayList<Integer> num1  = new ArrayList<Integer>();
		 num.add(10);
	        num.add(20);
	        num.add(30);
	        
	        System.out.println("Original List: " + num);
	        num1.addFirst(5);
	        num1.addLast(40);
	        
	        System.out.println("Updated List:  " + num);
	}

}
