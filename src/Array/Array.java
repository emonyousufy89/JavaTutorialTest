package Array;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		
		//An array is a container object that holds a fixed number of values of a single/same type
		// array is a collection of same data type.
		
		int a []  = new int [6];
		
		a[0]= 90;
		a[1]= 80;
		a[2]= 89;
		a[3]= 20;
		a[4]= 10;
		a[5]= 45;
		
		
		//for(int b:a) { // for each loop
		for (int i=0; i<=a.length; ++i) {
		
		System.out.println(a[i]);
		}
			
//		String [] arr = {"abc", "xyz", "mno", "jkj"};
//		
//		for(String m:arr) {
//		
//		System.out.println(m);
//		
//		}
//		
//		Object [] obj = new Object [3];
//		
//		obj[0] = 87;
//		obj[1] = "Seattle";
//		obj[2] = 89.90;
//		
//		for(Object o :obj) {
//		
//		System.out.println(o);
//		
//		}
		}	
		
	}


