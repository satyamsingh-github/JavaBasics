package JavaBasics;

import java.util.ArrayList;

public class zc_collections {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList can contain repetitive values
		
		ArrayList<String> fruits = new ArrayList<String>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add(0, "Grapes");
        
        
        System.out.println(fruits);
        
        fruits.remove(1);
        
        System.out.println(fruits);
        
        fruits.add(1, "Papaya");
        
        System.out.println(fruits);
        
        System.out.println(fruits.get(1));
        
        System.out.println(fruits.contains("Banana"));
        
        System.out.println(fruits.indexOf("Cherry"));
        
        System.out.println(fruits.size());
        
        System.out.println(fruits.isEmpty());
        
        fruits.remove("Mango");
        
        System.out.println(fruits);
        
	}	
}
