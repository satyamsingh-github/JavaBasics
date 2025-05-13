package JavaBasics;

public class a_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    byte byteVar = 100;                  // 1 byte
	        short shortVar = 10000;              // 2 bytes
	        int intVar = 100000;                 // 4 bytes
	        long longVar = 10000000000L;         // 8 bytes
	        float floatVar = 3.14f;              // 4 bytes
	        double doubleVar = 3.14159265359;    // 8 bytes
	        char charVar = 'A';                  // 2 bytes
	        boolean boolVar = true;              // 1 bit
	        
	        // Reference Data Types
	        String stringVar = "Hello, Java!";   // String is a reference type
	        Integer integerObject = 42;          // Integer is a wrapper class for int
	        Double doubleObject = 3.14;          // Double is a wrapper class for double
	        
	        // Arrays (also reference types)
	        int[] intArray = {1, 2, 3, 4};       // Array of integers
	        String[] stringArray = {"apple", "banana", "cherry"}; // Array of strings
	        
	        // Output the values to check the initialization
	        System.out.println("Primitive Variables:");
	        System.out.println("byteVar: " + byteVar);
	        System.out.println("shortVar: " + shortVar);
	        System.out.println("intVar: " + intVar);
	        System.out.println("longVar: " + longVar);
	        System.out.println("floatVar: " + floatVar);
	        System.out.println("doubleVar: " + doubleVar);
	        System.out.println("charVar: " + charVar);
	        System.out.println("boolVar: " + boolVar);
	        
	        System.out.println("\nReference Variables:");
	        System.out.println("stringVar: " + stringVar);
	        System.out.println("integerObject: " + integerObject);
	        System.out.println("doubleObject: " + doubleObject);
	        
	        System.out.println("\nArrays:");
	        System.out.println("intArray: " + java.util.Arrays.toString(intArray));
	        System.out.println("stringArray: " + java.util.Arrays.toString(stringArray));
		

	}

}
