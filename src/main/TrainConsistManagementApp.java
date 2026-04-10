package main;
import java.util.ArrayList;
public class TrainConsistManagementApp {



        public static void main(String[] args) {

            ArrayList<String> passengerBogies = new ArrayList<>();

            passengerBogies.add("Sleeper");
            passengerBogies.add("AC Chair");
            passengerBogies.add("First Class");

            System.out.println("Passenger Bogies after addition:");
            System.out.println(passengerBogies);

            passengerBogies.remove("AC Chair");

            System.out.println("\nPassenger Bogies after removal:");
            System.out.println(passengerBogies);

            boolean exists = passengerBogies.contains("Sleeper");

            System.out.println("\nDoes Sleeper bogie exist? " + exists);

            System.out.println("\nFinal Passenger Bogies List:");
            System.out.println(passengerBogies);
        }

}
