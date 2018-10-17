package basic_java;

public class exceptions_class {

	public static void main(String[] args) {
		int b[] = new int[2];
		try {
			//int a = 100/0;
			
			
			System.out.println("value of b = " + b[3]);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		//using above try catch block doesnt stop the execution of further code 
		System.out.println("---------------------");
		

	}

}

//We can use multiple catch blocks with a try block
//General Exception must be used at the end of all other catch execptions