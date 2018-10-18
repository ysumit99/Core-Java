//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
package basic_java;
import java.util.Date;
import java.text.*;
public class Date_time_Class {

	public static void main(String[] args) {
		
		Date date  = new Date();
		System.out.println(date.toString());
		
		//epoch time => time from 1st jan 1970 in milli seconds
		System.out.println(date.getTime());

		System.out.println(date.getMonth() + 1); //as it starts from 0, we add 1.
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
		
		System.out.println(sdf.format(date));
	}

}

