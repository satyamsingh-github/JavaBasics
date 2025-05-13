package JavaBasics;

public class d_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Using an enhanced for loop (for-each loop)
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

        // Using a while loop
        System.out.println("\nWhile Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // Using a do-while loop
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
        
     // Using nested loop
        System.out.println("\nNested Loop:");
        for (int k = 1; k <= 10; k++) {
            // Inner loop for columns (1 to 5)
            for (int l = 1; l <= 10; l++) {
                // Print multiplication of i and j
                System.out.print(k * l + "\t");
            }
            // Move to the next line after each row
            System.out.println();
        }
        
        

        

	}

}
