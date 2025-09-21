public class PatternMatchingSwitchCase {

    /**
     * A static method that takes an Object and returns a formatted String based on its type
     */
    static String formatter(Object obj){
        return switch (obj){
            // If obj is an Integer, format it as "int <value>"
            case Integer i -> String.format("int %d", i);

            // If obj is a Long, format it as "long <value>"
            case Long l -> String.format("long %d", l);

            // If obj is a String, format it as "String '<value>'"
            case String s -> String.format("String '%s'", s);

            // Handle null explicitly
            case null -> "null value";

            // For all other object types, call their toString() method
            default -> obj.toString();
        };
    }
    static void main(String[] args) {
        IO.println(formatter(10));
        IO.println(formatter("Hello"));
        IO.println(formatter(null));
    }
}
