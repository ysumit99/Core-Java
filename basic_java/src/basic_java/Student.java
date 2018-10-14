package basic_java;

public class Student {
	
	int id;
	String name;
	int age;
	
	
	
	static int NoOfStudents  = 0;
	
	
	Student()
	{
		 NoOfStudents++;
	}
//	
	public int getNoOfStudents()
	{
		return NoOfStudents;
	}
	//getters and setters used for encapsulation of variables
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
