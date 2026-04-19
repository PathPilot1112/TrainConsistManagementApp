import java.util.*;

public class TrainConsistManagementApp {


    public static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }


    public static class GoodsBogie {
        public String type;   // Cylindrical / Rectangular
        public String cargo;  // Petroleum / Coal / etc.

        public GoodsBogie(String type) {
            this.type = type;
        }
    }


    public static void assignCargo(GoodsBogie bogie, String cargo) {

        try {

            if (bogie.type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }


            bogie.cargo = cargo;
            System.out.println("Cargo assigned successfully");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed");
        }
    }

    // Demo
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        assignCargo(b1, "Petroleum");
        assignCargo(b2, "Petroleum");

        System.out.println("Program continues...");
    }
}