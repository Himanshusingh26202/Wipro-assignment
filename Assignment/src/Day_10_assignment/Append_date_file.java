package Day_10_assignment;
import java.io.*;
import java.util.Scanner;
public class Append_date_file {

	public static void main(String[] args) throws IOException {
		
		  File f1 = new File("count.txt");
	        f1.createNewFile();
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter text to append: ");
	        String input = sc.nextLine();
	        
	        BufferedWriter bw = new BufferedWriter(new FileWriter(f1, true));
	        
	        bw.newLine(); 
	        bw.write(input);

	        bw.close();
	        sc.close();
	        
	        BufferedReader br = new BufferedReader(new FileReader(f1));
	        String line;

	        System.out.println("\nUpdated File Content:");
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	        br.close();

	        System.out.println("Data appended successfully!");
	}

}
