import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // ✅ UC10: Total capacity using reduce
    public static int getTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values
    }

    // demo main
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        int total = getTotalCapacity(bogies);

        System.out.println("Total Capacity: " + total);
    }
}