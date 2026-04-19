import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testException_ValidCapacityCreation() throws Exception {

        TrainConsistManagementApp.Bogie b =
                new TrainConsistManagementApp.Bogie("Sleeper", 72);

        assertEquals(72, b.capacity);
    }

    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.Bogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {

        assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.Bogie("AC Chair", 0)
        );
    }

    @Test
    void testException_ExceptionMessageValidation() {

        Exception exception = assertThrows(
                TrainConsistManagementApp.InvalidCapacityException.class,
                () -> new TrainConsistManagementApp.Bogie("First Class", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws Exception {

        TrainConsistManagementApp.Bogie b =
                new TrainConsistManagementApp.Bogie("Luxury", 80);

        assertEquals("Luxury", b.name);
        assertEquals(80, b.capacity);
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws Exception {

        TrainConsistManagementApp.Bogie b1 =
                new TrainConsistManagementApp.Bogie("Sleeper", 72);

        TrainConsistManagementApp.Bogie b2 =
                new TrainConsistManagementApp.Bogie("AC Chair", 56);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}