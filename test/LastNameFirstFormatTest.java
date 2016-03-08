import org.junit.Test;

import static org.junit.Assert.*;

public class LastNameFirstFormatTest {

    @Test
    public void getGuestDetailGaveTheDetailOfEachGuestInLastNameFirstFormat() throws Exception {
        LastNameFirstFormat lastNameFirstFormat = new LastNameFirstFormat("./data/sampleData");
        String expected = "Mr Barrows Julius\n" +
                "Ms Dooley Melody";
        assertEquals(expected, lastNameFirstFormat.printData());
    }
}