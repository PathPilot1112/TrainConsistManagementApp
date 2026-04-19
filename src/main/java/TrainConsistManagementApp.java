import java.util.*;

public class TrainConsistManagementApp {

    // Existing Bogie (for passengers)
    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // ✅ NEW: Goods Bogie class
    public static class GoodsBogie {
        public String type;   // Cylindrical, Open, Box
        public String cargo;  // Petroleum, Coal, Grain

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    // ✅ UC12: Safety validation
    public static boolean isTrainSafe(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );
    }

    // Demo
    public static void main(String[] args) {

        List<GoodsBogie> list = new ArrayList<>();
        list.add(new GoodsBogie("Cylindrical", "Petroleum"));
        list.add(new GoodsBogie("Open", "Coal"));

        boolean safe = isTrainSafe(list);

        System.out.println("Train Safety: " + safe);
    }
}