package arraylistprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Fruits {
    static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to ArrayList
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Cherry");
        fruits.add("Watermelon");

        IO.println("Fruits List: " + fruits); // [Mango, Pineapple, Orange, Cherry, Watermelon]

        // Insert fruit name at index 2
        fruits.add(2,"Grapes");
        IO.println("Fruits List: " + fruits); // [Mango, Pineapple, Grapes, Orange, Cherry, Watermelon]

        // Access the element at index 3
        IO.println("Element at index 3: " + fruits.get(3)); // Orange

        // Replace the element at index 1
        fruits.set(1,"Blueberry");
        IO.println("Updated Fruits List: " + fruits); // [Mango, Blueberry, Grapes, Orange, Cherry, Watermelon]

        // Remove the element at index 4
        fruits.remove(4);
        IO.println("After Removing element: " + fruits); // [Mango, Blueberry, Grapes, Orange, Watermelon]

        // Search element
        IO.println("Is Mango is present in List: " + fruits.contains("Mango")); // true

        // Index position of "Blueberry"
        IO.println("Index of Blueberry: " + fruits.indexOf("Blueberry")); // 1

        // Number of elements in the list
        IO.println("Number of elements in the list: " + fruits.size()); // 5

        // Check the list is empty or not
        IO.println("Is the list is empty: " + fruits.isEmpty()); // false

        // Sort the list in alphabetical order
        Collections.sort(fruits);
        IO.println("Sorted Fruits List: " + fruits); // [Blueberry, Grapes, Mango, Orange, Watermelon]

        // Loop through elements
        for (String fruit : fruits){
            IO.println("Fruit: " + fruit);
        }

        // Create Arraylist
        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("onion");

        IO.println("Vegetables list: " + vegetables); // [Tomato, Potato, onion]
        IO.println("Fruits list: " + fruits); // [Blueberry, Grapes, Mango, Orange, Watermelon]

        // Merge two lists
        fruits.addAll(vegetables);
        IO.println("Merge lists: " + fruits);  // [Blueberry, Grapes, Mango, Orange, Watermelon, Tomato, Potato, onion]

        // Clear the list
        fruits.clear();
        IO.println("After Removing all elements in the list: " + fruits);

        IO.println("Is the list is empty: " + fruits.isEmpty()); // true

    }
}
