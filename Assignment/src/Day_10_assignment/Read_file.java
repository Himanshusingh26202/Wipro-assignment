package Day_10_assignment;

import java.io.*;
public class Read_file {

	public static void main(String[] args) throws IOException{
		File f1=new File("count.txt");
		f1.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));

        bw.write("Java Programming in SDET \n  Selenium automation \n This is Java File Handling ");
        bw.newLine();
       
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("count.txt"));

        int count = 0;
        while (br.readLine() != null) {
            count++;
        }
        br.close();
        
        br = new BufferedReader(new FileReader("count.txt"));
        int wordCount = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String words[] = line.trim().split("\\s+");
            if (!line.isEmpty()) {
                wordCount += words.length;
        }
        }
        br.close();
        
        br = new BufferedReader(new FileReader("count.txt"));
        
        int charCount = 0;
        int c;

        while ((c = br.read()) != -1) {
            charCount++;
        }
        br.close();

        
        System.out.println("Total lines: " + count);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total characters: " + charCount);

	}

}
