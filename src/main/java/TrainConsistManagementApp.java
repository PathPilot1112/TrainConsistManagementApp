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

    // ✅ Loop-based filtering
    public static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // ✅ Stream-based filtering
    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    // ✅ Measure execution time
    public static long measureLoopTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterWithLoop(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    public static long measureStreamTime(List<Bogie> bogies) {
        long start = System.nanoTime();
        filterWithStream(bogies);
        long end = System.nanoTime();
        return end - start;
    }

    // Demo
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        // create large dataset
        for (int i = 0; i < 10000; i++) {
            bogies.add(new Bogie("Sleeper", i % 100));
        }

        long loopTime = measureLoopTime(bogies);
        long streamTime = measureStreamTime(bogies);

        System.out.println("Loop Time (ns): " + loopTime);
        System.out.println("Stream Time (ns): " + streamTime);
    }
}