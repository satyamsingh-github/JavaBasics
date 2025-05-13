package JavaBasics;

public class e_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Hello, Java! ";

        // 1. length() - Get the length of the string
        System.out.println("Length of the string: " + str.length());

        // 2. charAt() - Get a character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring() - Extract a part of the string
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // 4. trim() - Remove leading and trailing spaces
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // 5. toLowerCase() - Convert string to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 6. toUpperCase() - Convert string to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 7. equals() - Compare two strings for equality
        String anotherStr = " Hello, Java! ";
        System.out.println("Are the strings equal? " + str.equals(anotherStr));

        // 8. equalsIgnoreCase() - Compare two strings ignoring case
        System.out.println("Are the strings equal (ignore case)? " + str.equalsIgnoreCase(" hello, java! "));

        // 9. contains() - Check if the string contains a substring
        System.out.println("Does the string contain 'Java'? " + str.contains("Java"));

        // 10. indexOf() - Get the index of the first occurrence of a substring
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // 11. lastIndexOf() - Get the index of the last occurrence of a substring
        String str2 = "Java is fun, Java is powerful!";
        System.out.println("Last index of 'Java': " + str2.lastIndexOf("Java"));

        // 12. replace() - Replace a substring with another substring
        System.out.println("Replace 'Java' with 'World': " + str.replace("Java", "World"));

        // 13. split() - Split the string into an array based on a delimiter
        String[] words = str.split(", ");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

        // 14. startsWith() - Check if the string starts with a given prefix
        System.out.println("Does the string start with ' Hello'? " + str.startsWith(" Hello"));

        // 15. endsWith() - Check if the string ends with a given suffix
        System.out.println("Does the string end with 'Java! '? " + str.endsWith("Java! "));

        // 16. concat() - Concatenate two strings
        System.out.println("Concatenated string: " + str.concat(" Let's learn!"));

        // 17. isEmpty() - Check if the string is empty
        String emptyStr = "";
        System.out.println("Is the string empty? " + emptyStr.isEmpty());

        // 18. valueOf() - Convert other data types to string
        int num = 123;
        System.out.println("String representation of integer: " + String.valueOf(num));

        // 19. matches() - Check if the string matches a regular expression
        System.out.println("Does the string match '.*Java.*'? " + str.matches(".*Java.*"));

        // 20. String.format() - Format a string using placeholders
        String formatted = String.format("I have %d apples and %.2f kg of bananas.", 5, 3.5);
        System.out.println("Formatted string: " + formatted);
        
        

	}

}
