package interviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupliccateValue {
	
	public static void main(String [] args) {

	String a []= {"Java", "Ruby", "C", "Python", "Java", "C"};
	// o(nxn) time complexity ********* using for loop
	for (int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			//System.out.println(a[i]);
			
			if (a[i].equals(a[j])) {
				System.out.println("the duplicate value :: "+a[i]);
			}
		}
		//System.out.println(a[i]);
	}
	// time complexity is o(n) ********** using hashset
	Set <String> s = new HashSet<String>();
	
	for (String A:a) {
		if(s.add(A)== false) {
			System.out.println("THE Duplicate Value is : " + A);
		}
	}
	
	// using HashMap
	
	Map<String, Integer> map = new HashMap<String,Integer>();
	for (String B:a) {
		Integer count = map.get(B);
		if(count == null) {
			map.put(B, 1);
		}
		else {
			map.put(B, ++count);
			
			/// saiful mahmood
		}
	}
	
	}
}
