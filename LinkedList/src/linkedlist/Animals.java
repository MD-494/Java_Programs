package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Animals {
    static void main(String[] args) {

        // Create linkedlist
        LinkedList<String> animals = new LinkedList<>();

        // Add elements to LinkedList
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Elephant");
        animals.add("Zebra");
        animals.add("Giraffe");

        IO.println("Animal List: " + animals); // [Tiger, Lion, Elephant, Zebra, Giraffe]

        // Adding element at index 2
        animals.add(2,"Panda");
        IO.println("Animal List: " + animals); // [Tiger, Lion, Panda, Elephant, Zebra, Giraffe]
        animals.addFirst("Gorilla");
        animals.addLast("Bear");

        IO.println("After adding first and last element: " + animals); // [Gorilla, Tiger, Lion, Panda, Elephant, Zebra, Giraffe, Bear]

        // Access the element at index 3
        IO.println("Element at index 3: " + animals.get(3)); // Panda
        IO.println("First Animal: " + animals.getFirst()); // Gorilla
        IO.println("Last Animal: " + animals.getLast()); // Bear

        // Replace the element at index 2
        animals.set(2,"Cheetah");
        IO.println("Updated Animal List: " + animals); // [Gorilla, Tiger, Cheetah, Panda, Elephant, Zebra, Giraffe, Bear]

        // Remove the element at index 4
        animals.remove(4);
        IO.println("After Removing element: " + animals); // [Gorilla, Tiger, Cheetah, Panda, Zebra, Giraffe, Bear]

        animals.removeFirst();
        animals.removeLast();
        IO.println("After Removing first and last element: " + animals); // [Tiger, Cheetah, Panda, Zebra, Giraffe]

        // Search element
        IO.println("Is Panda is present in List: " + animals.contains("Panda")); // true

        // Index position of "Cheetah"
        IO.println("Index of Cheetah: " + animals.indexOf("Cheetah")); // 1

        // Number of elements in the list
        IO.println("Number of elements in the list: " + animals.size()); // 5

        // Check the list is empty or not
        IO.println("Is the list is empty: " + animals.isEmpty()); // false

        // Sort the list in alphabetical order
        Collections.sort(animals);
        IO.println("Sorted Animal List: " + animals); // [Cheetah, Giraffe, Panda, Tiger, Zebra]

        // Loop through elements
        for (String animal : animals){
            IO.println("Animals: " + animal);
        }

        // Merge two lists
        LinkedList<String> birds = new LinkedList<>();

        birds.add("Parrot");
        birds.add("Sparrow");
        birds.add("Owl");

        IO.println("Birds: " + birds); // [Parrot, Sparrow, Owl]

        birds.addAll(animals);
        IO.println("Merged lists: " + birds); // [Parrot, Sparrow, Owl, Cheetah, Giraffe, Panda, Tiger, Zebra]


        // Clear the list
        animals.clear();
        IO.println("After Removing all elements in animals list: " + animals);

        // remove all element
        birds.removeAll(birds);
        IO.println("After Removing all elements in birds list");

        // Check the list is empty or not
        IO.println("Is the list is empty: " + animals.isEmpty()); // true

        IO.println("Is the list is empty: " + birds.isEmpty()); // true

    }
}


