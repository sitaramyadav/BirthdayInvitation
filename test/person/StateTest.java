package person;

import org.junit.Test;

import static org.junit.Assert.*;

public class StateTest {
    @Test
    public void getNameGivesTheNameOfTheState() throws Exception {
        State state = new State("Karnatka");
        assertEquals("Karnatka",state.getName().toString());
    }
}