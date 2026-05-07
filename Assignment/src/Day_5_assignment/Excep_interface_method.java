package Day_5_assignment;
import java.io.*;

//Interface
interface FileProcessor {
 void processFile(String filename);
}

//Implementation class
class TextFileReader implements FileProcessor {

 public void processFile(String filename) {
     try {
         // 1. Create file
         File file = new File(filename);
         file.createNewFile();

         // 2. Write into file
         FileWriter wr = new FileWriter(filename);
         wr.write("Let's learn Java Programming\nSelenium Automation\n");
         wr.close();

         // 3. Read from file
         FileReader reader = new FileReader(filename);
         int data;

         System.out.println("File Content:");
         while ((data = reader.read()) != -1) {
             System.out.print((char) data);
         }

         reader.close();
     } 
     catch (IOException e) {
         System.out.println("Error handling file!");
     }
 }
}
public class Excep_interface_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filename = "demo.txt"; // file name

	        FileProcessor fp = new TextFileReader();
	        fp.processFile(filename);
	}

}
