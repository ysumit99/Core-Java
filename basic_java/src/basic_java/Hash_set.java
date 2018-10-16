package basic_java;
import java.util.*;

public class Hash_set {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>(5);
		name.add("Mark");
		name.add("Tom");
		name.add("Jack");
		
		name.clear();
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
