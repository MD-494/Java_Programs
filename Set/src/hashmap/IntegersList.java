package hashmap;

import java.util.*;

public class IntegersList {
    static void main(String[] args) {

        // Create a List with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);

        System.out.println("Original List: " + numbers); // [1, 2, 3, 4, 2, 4, 5, 1]

        // Convert the List to a Set to remove duplicates
        Set<Integer> num = new HashSet<>(numbers);
        System.out.println("After removing duplicates: " + num); // [1, 2, 3, 4, 5]
    }
}
