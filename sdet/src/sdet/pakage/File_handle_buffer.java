package sdet.pakage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class File_handle_buffer {
	public static void main(String[] args) throws IOException {
		// create file
		File f1=new File("Text.txt");
		f1.createNewFile();
		// write file
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write("Hello Welcome to javaLearning");
		bw.close();
		//read file
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
        String l1;
        while((l1=br.readLine())!=null)
        {
        	System.out.println(l1);
        }
        br.close();
	}
}
