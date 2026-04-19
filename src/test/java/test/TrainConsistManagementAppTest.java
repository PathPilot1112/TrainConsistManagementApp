import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> createSampleBogies() {
        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 24));
        bogies.add(new TrainConsistManagementApp.Bogie("Luxury", 80));
        return bogies;
    }

    @Test
    void testLoopFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterWithLoop(createSampleBogies());

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testStreamFilteringLogic() {
        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterWithStream(createSampleBogies());

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<TrainConsistManagementApp.Bogie> loopResult =
                TrainConsistManagementApp.filterWithLoop(createSampleBogies());

        List<TrainConsistManagementApp.Bogie> streamResult =
                TrainConsistManagementApp.filterWithStream(createSampleBogies());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        long time = TrainConsistManagementApp.measureLoopTime(createSampleBogies());

        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<TrainConsistManagementApp.Bogie> largeList = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            largeList.add(new TrainConsistManagementApp.Bogie("Sleeper", i % 100));
        }

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterWithStream(largeList);

        assertNotNull(result);
    }
}