package File_handling_all;
import java.io.*;
import java.util.*;
public class Read_reverse {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new FileReader("countword.txt"));
	        List<String> lines = new ArrayList<>();

	        String line;
	        while ((line = br.readLine()) != null) {
	            lines.add(line);
	        }

	        for (int i = lines.size() - 1; i >= 0; i--) {
	            System.out.println(lines.get(i));
	        }

	        br.close();
	}

}
