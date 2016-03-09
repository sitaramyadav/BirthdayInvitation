import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void testGetFirstName() throws Exception {

        Name name = new Name("Seeta","Ram");
        assertEquals("Seeta",name.getFirstName());
    }

    @Test
    public void testGetLastName() throws Exception {

        Name name = new Name("Seeta","Ram");
        assertEquals("Ram",name.getLastName());

    }
}