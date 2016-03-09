import org.junit.Test;

import static org.junit.Assert.*;

public class StateTest {

    @Test
    public void testGetStateName() throws Exception {

        State state = new State("Karnatka");

        assertEquals("Karnatka",state.getName());
    }
}