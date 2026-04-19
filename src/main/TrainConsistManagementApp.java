package main;

import java.util.LinkedHashSet;
import java.util.Set;


public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create LinkedHashSet to maintain order + uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicate bogie
        trainFormation.add("Sleeper"); // This will be ignored

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");

        for (String bogie : trainFormation) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}