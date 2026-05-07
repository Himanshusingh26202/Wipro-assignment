package Day_8_Assignment;
import java.util.*;

class Book {
    String name;

    Book(String name) {
        this.name = name;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return name.equals(b.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
}
    
public class Library_Management {

	public static void main(String[] args) {
		  
		   HashMap<Book, Boolean> library = new HashMap<>();

	        Book b1 = new Book("Java");
	        Book b2 = new Book("Python");
	        Book b3 = new Book("C++");

	        library.put(b1, true);
	        library.put(b2, true);
	        library.put(b3, true);

	        if (library.get(b1)) {
	            library.put(b1, false);
	            System.out.println("Java book issued");
	        }

	       
	        if (!library.get(b1)) {
	            System.out.println("Java already issued");
	        }

	        library.put(b1, true);
	        System.out.println("Java book returned");

	        System.out.println("\nLibrary Status:");
	        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
	            System.out.println(entry.getKey().name + " -> " +
	                    (entry.getValue() ? "Available" : "Issued"));
	        }
	}

}
