package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c_arrayList {
	
	public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Print the entire ArrayList
        System.out.println("ArrayList: " + fruits);

        // Iterate over the ArrayList using an enhanced for loop
        System.out.println("\nIterating using enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get an element at a specific index
        System.out.println("\nElement at index 2: " + fruits.get(2));  // Cherry

        // Remove an element by index
        fruits.remove(1);  // Removes "Banana"

        // Remove an element by value
        fruits.remove("Mango");

        // Print the updated ArrayList
        System.out.println("\nUpdated ArrayList after removal:");
        System.out.println(fruits);

        // Check the size of the ArrayList
        System.out.println("\nSize of the ArrayList: " + fruits.size());
        
        //Element is present in  ArrayList
        System.out.println("\nPresent: "+ fruits.contains("Mango"));
        
        //converting arrays to ArrayList
        String[] summerfruits = {"lichi", "mango", "blackberry"}; // Array of strings
        List<String> summerfruit = Arrays.asList(summerfruits);
        
      //Element is present in  ArrayList
        System.out.println("\nPresent: "+ summerfruit.contains("blackberry"));
        
    }

}
