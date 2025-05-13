package JavaBasics;
public class p_array_smallLargenumber {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] numbers = {
            {34, 21, 56},
            {17, 89, 12},
            {65, 43, 9}
        };

        // Initialize min and max with the first element
        int min = numbers[0][0];
        int max = numbers[0][0];

        // Traverse the 2D array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }

        // Output the results
        System.out.println("Smallest number in the array: " + min);
        System.out.println("Largest number in the array: " + max);
    }
}
