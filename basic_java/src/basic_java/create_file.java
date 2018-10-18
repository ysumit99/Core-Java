package basic_java;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class create_file {

	public static void main(String[] args) {
		try {
		File file = new File("fileName1.txt");
		
		
		if(!file.exists()) {
			
				file.createNewFile();
			
		}
		
		PrintWriter pw = new PrintWriter(file);
		pw.println("this is my file content");
		pw.println(1000);
		pw.close();
		
		System.out.println("Done");
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
