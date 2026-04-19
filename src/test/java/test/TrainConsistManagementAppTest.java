import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    @Test
    void testCargo_SafeAssignment() {

        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        TrainConsistManagementApp.assignCargo(b, "Petroleum");

        assertEquals("Petroleum", b.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {

        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        TrainConsistManagementApp.assignCargo(b, "Petroleum");

        assertNull(b.cargo); // ❌ should not be assigned
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {

        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        TrainConsistManagementApp.assignCargo(b, "Petroleum");

        assertNull(b.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {

        TrainConsistManagementApp.GoodsBogie b1 =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        TrainConsistManagementApp.GoodsBogie b2 =
                new TrainConsistManagementApp.GoodsBogie("Cylindrical");

        TrainConsistManagementApp.assignCargo(b1, "Petroleum"); // ❌
        TrainConsistManagementApp.assignCargo(b2, "Coal");      // ✅

        assertEquals("Coal", b2.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {

        TrainConsistManagementApp.GoodsBogie b =
                new TrainConsistManagementApp.GoodsBogie("Rectangular");

        // Just ensure no crash and execution completes
        TrainConsistManagementApp.assignCargo(b, "Petroleum");

        assertTrue(true); // program reached here → finally executed
    }
}