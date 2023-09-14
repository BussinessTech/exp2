import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testInitialState() {
        Main spacecraft = new Main();
        assertEquals("(0, 0, 0) - N", spacecraft.getPositionAndDirection());
    }
}