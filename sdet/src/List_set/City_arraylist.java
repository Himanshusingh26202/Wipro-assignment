package List_set;
import java.util.ArrayList;
import java.util.Iterator;

public class City_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();
		
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Kolkata");
        cities.add("Mumbai");
        
        Iterator<String> it = cities.iterator();
        
        System.out.println("List of Cities:");
        while (it.hasNext()) {
            String city = it.next();
            System.out.println(" " + city);
        }
	}

}
