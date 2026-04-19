package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (Custom Object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for easy printing
    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add passenger bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        // Sort bogies based on capacity (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("Bogies Sorted by Capacity (Ascending):");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}