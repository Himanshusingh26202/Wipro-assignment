package File_handling_all;
import java.io.*;
public class Largest_word_in_file {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("countword.txt"));
        String line, largest = "";

        while ((line = br.readLine()) != null) {
            String words[] = line.split("\\s+");
            for (String word : words) {
                if (word.length() > largest.length()) {
                    largest = word;
                }
            }
        }

        System.out.println("Largest word: " + largest);
        br.close();
	}

}
