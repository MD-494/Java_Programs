package hashset;

import java.util.HashSet;

public class Cars {
    static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Honda");
        set.add("BMW");
        set.add("Audi");
        set.add("Tesla");
        set.add("Mercedes-Benz");

        // Printing elements
        System.out.println("HashSet: " + set); // [Audi, Tesla, Mercedes-Benz, BMW, Honda]

        // Number of elements in the set
        IO.println("Number of elements in the set: " + set.size()); // 5

        // Check set is empty or not
        IO.println("Is the set is empty: " + set.isEmpty()); // false

        // Check if element exists
        System.out.println("Is Mercedes-Benz present in set ? " + set.contains("Mercedes-Benz")); // true

        // Remove element
        set.remove("Audi");
        System.out.println("After removing Banana: " + set); // [Tesla, Mercedes-Benz, BMW, Honda]

        // Iterating through HashSet
        for (String car : set) {
            System.out.println(car);
        }

        // clear set
        set.clear();
        IO.println("After Removing all elements in the set: " + set);
    }
}
