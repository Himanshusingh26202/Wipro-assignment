package File_handling_all;
import java.io.*;
public class Count_number_of_lines {

	public static void main(String[] args) throws Exception {
		
		File f1=new File("Buffer.txt");
		f1.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Buffer.txt"));

        bw.write("Java Programming in SDET \n, Selenium automation \n,This is Java File Handling ");
        bw.newLine();
       
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("Buffer.txt"));

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }

        br.close();
        System.out.println("Total lines: " + count);
        
	}

}
