public class WrapperClass {
    public static void main(String[] args) {

        // Integer.parseInt()
        int intVal = Integer.parseInt("123");
        System.out.println("intVal: " + intVal);

        // Integer.valueOf()
        Integer intObj = Integer.valueOf("123");
        System.out.println("intObj: " + intObj);

        // compareTo()
        System.out.println("CompareTo: " + intObj.compareTo(100));  // Output: 1 (since 123 > 100)

        // Double.parseDouble()
        double dbl = Double.parseDouble("3.14");
        System.out.println("dbl: " + dbl);

        // doubleValue()
        double dblVal = intObj.doubleValue();  // Converts Integer to double
        System.out.println("dblVal: " + dblVal);

        // Character.isLetter()
        System.out.println("Character: " + Character.isLetter('M'));  // true

        // Character.isDigit()
        System.out.println("Digit: " + Character.isDigit('4'));   // true

        // Boolean.parseBoolean()
        boolean boolVal = Boolean.parseBoolean("true");
        System.out.println("boolVal: " + boolVal);

        // Boolean.valueOf()
        Boolean boolObj = Boolean.valueOf("false");
        System.out.println("boolObj: " + boolObj);
    }
}

