package File_handling_all;

import java.io.*;

public class Replace_word_in_file {

	public static void main(String[] args) throws IOException{
		
		File f2=new File("Text1.txt");
		f2.createNewFile();
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text1.txt"));
		bw.write("Hello welcome to python Learninig, Python is easy to understand\n");
		bw.write("Python is easy to write\n");
		bw.write("Python is case sensitive\n");
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("Text1.txt"));
		String l2;
		while((l2=br.readLine())!=null)
		{
			//l2= l2+l2+"\n";
			l2=l2.replace("python", "java");
			l2=l2.replace("Python", "Java");
			System.out.println(l2);
		}
	
		br.close();
	}

}
