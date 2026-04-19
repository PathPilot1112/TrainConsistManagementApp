import java.util.Arrays;

public class TrainConsistManagementApp {

    // ✅ UC17: Sort bogie names
    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    // Demo
    public static void main(String[] args) {

        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

        sortBogieNames(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}