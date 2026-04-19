public class TrainConsistManagementApp {

    // ✅ UC18: Linear Search for Bogie ID
    public static boolean searchBogie(String[] bogieIds, String key) {

        for (String id : bogieIds) {

            if (id.equals(key)) {
                return true; // ✅ found
            }
        }

        return false; // ❌ not found
    }

    // Demo
    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogies, searchKey);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}