import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<TrainConsistManagementApp.Bogie> createSampleBogies() {

        List<TrainConsistManagementApp.Bogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC Chair", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First Class", 24));

        return bogies;
    }

    @Test
    void testReduce_TotalSeatCalculation() {

        int total = TrainConsistManagementApp.getTotalCapacity(createSampleBogies());

        assertEquals(72 + 56 + 24, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {

        int total = TrainConsistManagementApp.getTotalCapacity(createSampleBogies());

        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {

        List<TrainConsistManagementApp.Bogie> list = new ArrayList<>();
        list.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        int total = TrainConsistManagementApp.getTotalCapacity(list);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {

        int total = TrainConsistManagementApp.getTotalCapacity(new ArrayList<>());

        assertEquals(0, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {

        int total = TrainConsistManagementApp.getTotalCapacity(createSampleBogies());

        assertEquals(152, total); // 72 + 56 + 24
    }

    @Test
    void testReduce_OriginalListUnchanged() {

        List<TrainConsistManagementApp.Bogie> original = createSampleBogies();
        List<TrainConsistManagementApp.Bogie> copy = new ArrayList<>(original);

        TrainConsistManagementApp.getTotalCapacity(original);

        assertEquals(copy.size(), original.size());
    }
}