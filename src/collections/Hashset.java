package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet <String> (); // using interface and genericd
		
		Set<Double> set3 = new HashSet <Double> ();
		set3.add(45.90);
		System.out.println(set3);
		
		Set<Float> set4 = new HashSet <Float> ();
		//set4.add(89.90);
		System.out.println(set4);
		
		// double 89999999999999999999
		//float 1234567
		// String - String int- Integer double- Double float - Float [generic/ data type to class]
		// A Set is a Collection that cannot contain duplicate elements
		// Set does not preservse the insertion order
		
		
		set.add("ayah");
		set.add("anwar");
		set.add("kazi");
		set.add("Morshed");
		set.add("890");
		System.out.println(set);
		
		HashSet set1 = new HashSet (); // using class only
		
		set1.add(898989);
		set1.add("Emon");
		set1.add("Emon");
		System.out.println(set1);
		
		
		
		
		

	}

}
