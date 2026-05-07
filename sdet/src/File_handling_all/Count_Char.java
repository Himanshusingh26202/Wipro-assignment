package File_handling_all;
import java.io.*;
public class Count_Char {

	public static void main(String[] args) throws Exception {
		
		  BufferedReader br = new BufferedReader(new FileReader("countword.txt"));
	        int charCount = 0;
	        int ch;

	        while ((ch = br.read()) != -1) {
	            charCount++;
	        }

	        System.out.println("Total characters: " + charCount);
	        br.close();
	}

}
