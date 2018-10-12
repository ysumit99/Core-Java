package basic_java;

public class Myclass {
	
	public static void main(String[] args) {
		
		//static members belong to the class instead of a specific instance
		
		Student mark = new Student(); //mark => object or instance
		
		//Not the Recommended way to access variables of other Class
		mark.id = 1;
		mark.name = "Mark";
		mark.age = 15;
		
		
		//Recommended way to access variables
		mark.setId(1);
		mark.setName("Mark");
		mark.setAge(13);
		
		
		
		System.out.println(mark.getName() + "is " +  mark.getAge() +  " years old");
		
		//Calling a Default Constructor
		
		Cube cube1 = new Cube();
		System.out.println(cube1.getCubeVolume());
		
		//Calling a Parameterized constructor
		
		Cube cube2 = new Cube(20,89,76);
		System.out.println(cube2.getCubeVolume());
		
		System.out.println(Add(3,4));
		System.out.println(Add(3.6,4.7));
		
		//Calling a non  static method => using object
		test_static test = new test_static();
		System.out.println(test.test2("Hi Non static method!"));
		
		
		//Calling a static method => using the class itself
		System.out.println(test_static.test("Hey Static method! "));
		
		//test_static variable access 
		
		//not the recommended way
		 test_static test_age = new test_static();
		System.out.println(test_age.age = 46);
		
		//recommended way
		System.out.println(test_static.age = 23);
		
	}
	
	public static int Add(int a, int b) {
		return (a + b);
	}
	
	//Method Overloading
	public static double Add(double a, double b) {
		return (a + b);
	}
	
}
