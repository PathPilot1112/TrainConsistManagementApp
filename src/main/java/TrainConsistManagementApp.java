import java.util.regex.Pattern;

public class TrainConsistManagementApp {

    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // ✅ Train ID validation: TRN-1234
    public static boolean isValidTrainId(String trainId) {
        String regex = "TRN-\\d{4}";
        return Pattern.matches(regex, trainId);
    }

    // ✅ Cargo Code validation: PET-AB
    public static boolean isValidCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        return Pattern.matches(regex, cargoCode);
    }

    // Demo
    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID valid: " + isValidTrainId(trainId));
        System.out.println("Cargo Code valid: " + isValidCargoCode(cargoCode));
    }
}