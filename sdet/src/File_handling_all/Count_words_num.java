package File_handling_all;

import java.io.*;

public class Count_words_num {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		File f3=new File("countword.txt");
		f3.createNewFile();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("countword.txt"));

        bw.write("Java Programming in SDET \n, Selenium automation \n,This is Java File Handling ");
        bw.newLine();
       
        bw.close();
        
		 BufferedReader br = new BufferedReader(new FileReader("countword.txt"));
		 
		 int wordCount = 0;
	        String line;

	        while ((line = br.readLine()) != null) {
	            String words[] = line.trim().split("\\s+");
	            if (!line.isEmpty())
	                wordCount += words.length;
	        }

	        System.out.println("Total words: " + wordCount);
	        br.close();
		
	}

}
