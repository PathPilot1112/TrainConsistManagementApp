import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {

        String[] arr = {};

        assertThrows(
                IllegalStateException.class,
                () -> TrainConsistManagementApp.safeSearchBogie(arr, "BG101")
        );
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {

        String[] arr = {"BG101","BG205"};

        assertDoesNotThrow(
                () -> TrainConsistManagementApp.safeSearchBogie(arr, "BG101")
        );
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {

        String[] arr = {"BG101","BG205","BG309"};

        assertTrue(TrainConsistManagementApp.safeSearchBogie(arr, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {

        String[] arr = {"BG101","BG205","BG309"};

        assertFalse(TrainConsistManagementApp.safeSearchBogie(arr, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {

        String[] arr = {"BG101"};

        assertTrue(TrainConsistManagementApp.safeSearchBogie(arr, "BG101"));
    }
}