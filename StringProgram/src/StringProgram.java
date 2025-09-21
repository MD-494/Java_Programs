public class StringProgram {
    public static void main() {

        // Declare a String
        String string = "Hello, World!";

        // Original String
        System.out.println("Original: " + string);

        // Case conversions
        System.out.println("Lowercase " + string.toLowerCase()); // Converts to lowercase
        System.out.println("Uppercase " + string.toUpperCase()); // Converts to uppercase

        // Trimming whitespaces
        System.out.println("Trimmed " + string.trim()); // Removes leading and trailing spaces
        System.out.println("Strip Leading " + string.stripLeading()); // Remove only leading spaces
        System.out.println("Strip Trailing " + string.stripTrailing()); //remove only trailing spaces

        // Finding position
        System.out.println("Index of 'World': " + string.indexOf("World")); // Returning index of substring
        System.out.println("Last index of 'l': " + string.lastIndexOf("l")); // Last occurrence of character

        // Check for substrings
        System.out.println("Contains 'Hello': " + string.contains("Hello")); // true if substring is present
        System.out.println("Start With 'H': " + string.startsWith("H")); // true if starts with specified text
        System.out.println("Ends With '': " + string.endsWith("")); // true if ends with specified text

        // Replace substrings
        System.out.println("Replace 'World' -> 'Universe': " + string.replace("World", "Universe")); // Replace all

        // Access Character
        System.out.println("Character at index 2: " + string.charAt(2));

        // String length
        System.out.println("Length " + string.length());

        // Splitting string
        String[] parts = string.split(",");
        System.out.println("Split by comma:");
        for (String part : parts){
            System.out.println("->" + part);
        }

        // Join strings
        String joined = String.join("-", "Java", "is", "cool");
        System.out.println("Joined with '-': " + joined); // Joins with dash

        // Repeat string
        System.out.println("Repeated: " + "Ha".repeat(3));

        // Formatted strings
        String fromatted = String.format("Hello, %s!", "Siya");
        System.out.println("Formatted: " + fromatted); // "Hello, Siya!"

        // Concatenation
        System.out.println("Concat: " + string.concat("string"));
    }
}