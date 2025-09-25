package arraylistprograms;

import java.util.ArrayList;

public class Languages {
    static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to ArrayList
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C#");

        IO.println("Language list: " + languages); // [C, C++, Java, Python, JavaScript, C#]

        // Add an element at a specified position in an ArrayList
        languages.add(1,"HTML");
        IO.println("Updated list: " + languages); // [C, HTML, C++, Java, Python, JavaScript, C#]


        // size() method
        IO.println("Length of ArrayList: " + languages.size()); // 7

        // Access ArrayList element
        IO.println("Element at index 4: " + languages.get(4)); // Python

        // Change the element of the arraylist
        languages.set(2, "CSS");
        IO.println("Modified ArrayList: " + languages); // [C, HTML, CSS, Java, Python, JavaScript, C#]

        // Remove single element
        languages.remove(2);
        IO.println("Removing single element: " + languages); // [C, HTML, Java, Python, JavaScript, C#]

        // removeAll() method
        languages.removeAll(languages);
        IO.println("Removing All elements: " + languages);

        // isEmpty() method
        IO.println("Is the language list is empty? " + languages.isEmpty()); // true

        // Create Arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        IO.println("Numbers list: " + numbers); // [1, 2, 3, 4, 5]


        // contains() method
        IO.println("Is 4 present in the arraylist: " + numbers.contains(4)); // true
        IO.println("Is 9 is present in the Arraylist: " + numbers.contains(9)); // false

        // indexOf() method
        IO.println("Index of 2 is: " + numbers.indexOf(2)); // 1

        // Remove first element
        numbers.removeFirst();
        IO.println("Remove first element: " + numbers); // [2, 3, 4, 5]

        // Remove last element
        numbers.removeLast();
        IO.println("Remove last element: " + numbers); // [2, 3, 4]

        // isEmpty() method
        IO.println("Is the ArrayList empty? " + numbers.isEmpty()); // false
    }
}
