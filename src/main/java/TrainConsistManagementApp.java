public class TrainConsistManagementApp {

    // ✅ UC20: Safe search with validation
    public static boolean safeSearchBogie(String[] bogieIds, String key) {

        // 🚨 FAIL-FAST CHECK
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available");
        }

        // 🔍 Normal search (linear)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    // Demo
    public static void main(String[] args) {

        String[] bogies = {}; // empty case

        try {
            boolean found = safeSearchBogie(bogies, "BG101");
            System.out.println(found ? "Found" : "Not Found");

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}