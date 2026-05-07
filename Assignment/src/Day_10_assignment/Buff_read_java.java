package Day_10_assignment;
import java.io.*;
public class Buff_read_java {

	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new FileReader("count.txt"));

            String line;

            System.out.println("Lines containing 'Java':\n");

            while ((line = br.readLine()) != null) {
                if (line.contains("Java")) {
                    System.out.println(line);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }    

	}

}
