import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;


class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> createSampleBogies() {

        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("Luxury", 80));

        return bogies;
    }

    @Test
    void testFilter() {

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterByCapacity(createSampleBogies(), 60);

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }
}