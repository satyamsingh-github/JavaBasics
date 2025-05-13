package JavaBasics;

import java.util.HashSet;
import java.util.Iterator;

public class zd_sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset, TreeSet, LinkedHashSet 
		//does not accept duplicate value
		// There is no guarantee elements stored in sequential order
		
		HashSet<String> animals = new HashSet<String>();
		animals.add("monkey");
		animals.add("cat");
		animals.add("horse");
		animals.add("dog");
		animals.add("cow");
		animals.add("dog"); //rejected
		
		System.out.println(animals);
		
		animals.remove("dog");
		
		System.out.println(animals);
		
		System.out.println(animals.isEmpty());
		
		System.out.println(animals.size());
		
		
		Iterator<String> animal = animals.iterator();
		
		while(animal.hasNext()){
			System.out.println(animal.next());
		}
		
		
		
	}

}
