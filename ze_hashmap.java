package JavaBasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ze_hashmap{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> avengers = new HashMap<Integer,String>();
		avengers.put(1, "Iron Man");
		avengers.put(2, "Ant Man");
		avengers.put(3, "Thor");
		avengers.put(4, "Hawkeye");
		avengers.put(5, "Widow");
		
		System.out.println(avengers.get(5));
		
		avengers.remove(5);
		
		System.out.println(avengers.get(5)); // if the value doesn't exist, null is returned.
		
		Set shield = avengers.entrySet();
		
		Iterator newAvenegers = shield.iterator();
		
		while(newAvenegers.hasNext()){
			Map.Entry mp = (Map.Entry)newAvenegers.next();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		

	}

}
