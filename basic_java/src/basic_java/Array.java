package basic_java;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		int simple_array[] =  new int[5];
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		myList.add(1);
		myList.add(5);
		myList.add(3);
		myList.add(6);
		
		for(Integer x : myList)
			System.out.println(x);
		
		System.out.println("size = " + myList.size());
		myList.remove(2);
		
		
		for(Integer x : myList)
			System.out.println(x);
		
		
//		System.out.println("size = " + myList.size());
//		
//		//myList.clear();
//		
//		System.out.println("size = " + myList.size());
//		
		myList.set(0, 100);
		
		for(Integer x : myList)
			System.out.println(x);
		
		myList.trimToSize();
		myList.add(1);
		
		for(Integer x : myList)
			System.out.println(x);
		
		
		
	}

}
