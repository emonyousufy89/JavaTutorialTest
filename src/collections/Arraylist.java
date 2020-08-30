package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Arraylist {
	
	public static void main(String[] args) {
		
		int [] a = new int [5];  // array with fixed size and data type.
		
		// It is a child interface of Collection.
		// ArrayList implements(is a child class of) List.
		//It is an ordered collection of objects in 
		//which duplicate values can be stored. 
		// List preserves the insertion order
		// what is generic? The generic in collection is type-safe of the data and checked at compile-time.
		
		List list = new ArrayList();  // using interface
		
		list.add(1);
		list.add("hi");
		System.out.println(list);
		
		ArrayList array = new ArrayList(); // using classs without generic
		
		array.add("abcd");
		array.add(90);
		array.add(123);
		array.add(89.90);
		array.add(89.90);
		System.out.println(array);
		
		ArrayList <Integer>  list3 = new ArrayList<Integer>();  // using class with generic
		 list3.add(9000);
		 list3.add(123);
		 System.out.println(list3);
		
	}

}
