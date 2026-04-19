import java.util.*;

public class TrainConsistManagementApp {


    public static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }


    public static class Bogie {
        public String name;
        public int capacity;

        public Bogie(String name, int capacity) throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }

            this.name = name;
            this.capacity = capacity;
        }
    }

    // Demo
    public static void main(String[] args) {

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", -10);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}