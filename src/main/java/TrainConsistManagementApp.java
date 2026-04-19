import java.util.Arrays;

public class TrainConsistManagementApp {

    // ✅ UC19: Binary Search
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        // 🔥 IMPORTANT: ensure sorted
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = bogieIds[mid].compareTo(key);

            if (compare == 0) {
                return true; // ✅ found
            } else if (compare < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // ❌ not found
    }

    // Demo
    public static void main(String[] args) {

        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};

        String key = "BG205";

        boolean found = binarySearchBogie(bogies, key);

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }
}