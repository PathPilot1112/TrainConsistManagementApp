import java.util.*;

public class TrainConsistManagementApp {

    // ✅ UC16: Bubble Sort
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    // 🔄 swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Demo
    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        bubbleSort(capacities);

        System.out.println("Sorted Capacities:");

        for (int c : capacities) {
            System.out.print(c + " ");
        }
    }
}