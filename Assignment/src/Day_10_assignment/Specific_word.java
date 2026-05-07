package Day_10_assignment;
import java.io.*;
import java.util.*;
public class Specific_word {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter word to search: ");
	        String wordToFind = sc.nextLine();

	        int count = 0;

	        try {
	            BufferedReader br = new BufferedReader(new FileReader("count.txt"));
	            String line;

	            while ((line = br.readLine()) != null) {

	                String[] words = line.split("\\s+");

	                for (String word : words) {

	                    // Remove punctuation (like Java, Java.)
	                    word = word.replaceAll("[^a-zA-Z]", "");

	                    if (word.equalsIgnoreCase(wordToFind)) {
	                        count++;
	                    }
	                }
	            }

	            br.close();

	            System.out.println("The word \"" + wordToFind + "\" appears " + count + " times.");

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }

	        sc.close();

	}

}
