package basic_java;
import java.io.*;


public class read_file {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("fileName1.txt"));
			
			String line;
			
			while((line = br.readLine()) != null ) {
				System.out.println(line);
			}
		} catch(IOException e) {
			e.printStackTrace();
	} finally {
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	
}
