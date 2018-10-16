package basic_java;

import java.util.*;

public class Linked_list {

	public static void main(String[] args) {
		
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Sumit");
		name.add("Arvind");
		name.add("Anmol");
		name.add("Vijay");
		name.addFirst("jack");
		name.addLast("Zack");
		
		name.removeLast();
		name.removeFirst();
		//name.clear();
		name.add(1,"index1");
		name.remove(1);
		name.set(1, "ARVIND");
		
		
		System.out.println(name.size());
		
		for (String x : name)
			System.out.println(x);
	}

}

//LinkedList insertion is faster than Arraylist
//ArrayList search is faster than LinkedList
//LinkedList element deletion is faster than  ArrayList
//LinkedList has more memory overhead than ArrayList