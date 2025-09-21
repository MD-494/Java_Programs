public class StringProgram {
    public static void main() {

        // Declare a String
        String string = "Hello, World!";

        // Original String
        System.out.println("Original: " + string); // Hello, World!

        // Case conversions
        System.out.println("Lowercase " + string.toLowerCase()); // Converts to lowercase (o/p: hello, world!)
        System.out.println("Uppercase " + string.toUpperCase()); // Converts to uppercase (o/p: HELLO, WORLD!)

        // Trimming whitespaces
        System.out.println("Trimmed " + string.trim()); // Removes leading and trailing spaces (o/p: Hello, World!)
        System.out.println("Strip Leading " + string.stripLeading()); // Remove only leading spaces (o/p: Hello, World!)
        System.out.println("Strip Trailing " + string.stripTrailing()); //remove only trailing spaces (o/p: Hello, World!)

        // Finding position
        System.out.println("Index of 'World': " + string.indexOf("World")); // Returning index of substring (o/p: 7)
        System.out.println("Last index of 'l': " + string.lastIndexOf("l")); // Last occurrence of character (o/p: 10)

        // Check for substrings
        System.out.println("Contains 'Hello': " + string.contains("Hello")); // true if substring is present (o/p: true)
        System.out.println("Start With 'H': " + string.startsWith("H")); // true if starts with specified text (o/p: true)
        System.out.println("Ends With '': " + string.endsWith("")); // true if ends with specified text (o/p: true)

        // Replace substrings
        System.out.println("Replace 'World' -> 'Universe': " + string.replace("World", "Universe")); // Replace all (o/p: Hello, Universe!)

        // Access Character
        System.out.println("Character at index 2: " + string.charAt(2)); // o/p: l

        // String length
        System.out.println("Length " + string.length()); // o/p:13

        // Splitting string
        String[] parts = string.split(",");
        System.out.println("Split by comma:");
        for (String part : parts){
            System.out.println("->" + part); // o/p: ->Hello -> World!
        }

        // Join strings
        String joined = String.join("-", "Java", "is", "cool");
        System.out.println("Joined with '-': " + joined); // Joins with dash (o/p: Java-is-cool)

        // Repeat string
        System.out.println("Repeated: " + "Ha".repeat(3)); // print: HaHaHa

        // Formatted strings
        String fromatted = String.format("Hello, %s!", "Siya");
        System.out.println("Formatted: " + fromatted); // "Hello, Siya!"

        // Concatenation
        System.out.println("Concat: " + string.concat("string")); // Print: Hello, World!string
    }
}