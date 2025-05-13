package JavaBasics;

public class b_printingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String[] stringArray = {"apple", "banana", "cherry"}; // Array of strings
        
        
     // 1. Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        // 2. Using an enhanced for loop (for-each loop)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : stringArray) {
            System.out.println(fruit);
        }

        // 3. Using a while loop
        System.out.println("\nUsing while loop:");
        int i = 0;
        while (i < stringArray.length) {
            System.out.println(stringArray[i]);
            i++;
        }

        // 4. Using a do-while loop
        System.out.println("\nUsing do-while loop:");
        int j = 0;
        do {
            System.out.println(stringArray[j]);
            j++;
        } while (j < stringArray.length);

	}

}
