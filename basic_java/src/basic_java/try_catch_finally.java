package basic_java;

public class try_catch_finally {

	public static void main(String[] args) {
		
		try {
			
			int a = 100/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println("catch called");
			System.out.println(e);
			

	} finally {
		System.out.println("finally called");
	}

}

}

//finally is always called irrespective of generated exception