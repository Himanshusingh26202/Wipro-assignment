package File_handling_all;
import java.io.*;
public class Copy_text_1file_2file {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("countword.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Buffer.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();
        System.out.println("File copied successfully.");

	}

}
