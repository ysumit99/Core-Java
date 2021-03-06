package basic_java;

import java.util.*;

public class List_iterator {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mark");
		names.add("tom");
		names.add("John");
		names.add("Neil");
		names.add("Federer");
		
		ListIterator<String> itr = names.listIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("");
		System.out.println("");
		
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
