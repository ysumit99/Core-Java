package basic_java;

public class Myclass {
	
	public static void main(String[] args) {
		Student mark = new Student(); //mark => object or instance
		
		
		mark.id = 1;
		mark.name = "Mark";
		mark.age = 15;
		
		
		System.out.println(mark.name + "is " +  mark.age +  "years old");
	}
}
