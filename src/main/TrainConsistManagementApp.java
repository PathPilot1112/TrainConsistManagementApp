package main;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class TrainConsistManagementApp {

        public static void main(String[] args) {

            // Step 1: Create a HashSet for Bogie IDs
            Set<String> bogieIds = new HashSet<>();

            // Step 2: Add bogie IDs (including duplicates)
            bogieIds.add("BG101");
            bogieIds.add("BG102");
            bogieIds.add("BG103");
            bogieIds.add("BG101"); // Duplicate
            bogieIds.add("BG104");
            bogieIds.add("BG102"); // Duplicate

            // Step 3: Display unique bogie IDs
            System.out.println("Unique Bogie IDs in Train Consist:");
            for (String id : bogieIds) {
                System.out.println(id);
            }
        }


}
