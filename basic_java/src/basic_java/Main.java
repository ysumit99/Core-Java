package basic_java;

public class Main {
	
protected String name = "Sumit";

//A final class cannot be subclassed
//A final method cannot be overriden by subclasses
//A final variable can be initialized only once

//final key word
public final int number = 3;


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
