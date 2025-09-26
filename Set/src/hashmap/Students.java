package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Students {
    static void main(String[] args) {

        // Create a HashMap to store student roll numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "Mansi");
        students.put(2, "Shruti");
        students.put(3, "Swara");
        students.put(4, "Shreya");

        IO.println("Students: " + students); // {1=Mansi, 2=Shruti, 3=Swara, 4=Shreya}

        // Retrieve and print the value associated with key 1
        IO.println("Value for key 1: " + students.get(1)); // Mansi

        // Total count of elements in the map
        IO.println("Number of elements in the map: " + students.size());

        // Iterating through a HashMap
        for (Map.Entry entry : students.entrySet()) {
            IO.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // replace element
        students.replace(4,"Shreya","Ovi");
        IO.println("After replacing value: " + students);

        // Checking if a key or value exists
        IO.println("Contains key 4 ? " + students.containsKey(4));
        IO.println("Contains value Shruti ? " + students.containsValue("Shruti"));

        // Removing a key-value pair
        students.remove(3);
        IO.println("After removing key 1: " + students);
    }
}