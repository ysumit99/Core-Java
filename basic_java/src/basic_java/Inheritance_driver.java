package basic_java;

public class Inheritance_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reactangle rec = new Reactangle(); //Typo : should have been rectangle , but doesnt matter
		Triangle tri = new Triangle();
		
		rec.set_values(10, 10);
		tri.set_values(10, 10);
		
		System.out.println("Area of rectangle = " + rec.area());
		System.out.println("Area of Triangle = " + tri.area());
		
		
	}

}
