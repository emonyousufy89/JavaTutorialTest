package collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// key & Value
	// key can not be duplicate but value can be duplicate
		// no insertion order	
		Map map = new HashMap ();
		
		map.put("emon", "boston");
		map.put(700, 9090);
		map.put(800, 9090);
		map.put(70.10, 90.90);
		map.put(50, "mahbuba");
		
		System.out.println(map);
			
		HashMap<Integer, String> map1 = new HashMap <Integer, String>();
		
		map1.put(90, "simon");
		map1.put(80, "Rasel");
		map1.put(60, "Sabbir");
		
		System.out.println(map1);
		
		HashMap<String, String> map2 = new HashMap <String, String>();
		map2.put("Morshed", "boston");
		map2.put("NY", "NYC");
		
		System.out.println(map2);

	}

}
