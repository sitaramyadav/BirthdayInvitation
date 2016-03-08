import org.junit.Test;

import static org.junit.Assert.*;

public class FirstNameFirstFormatTest {
    @Test
    public void getGuestDetailShouldGaveTheDetailOfEachGuest(){
        FirstNameFirstFormat firstNameFirstFormat = new FirstNameFirstFormat("./data/sampleData");
        String expected = "Mr Julius Barrows\n" +
                "Ms Melody Dooley";
        assertEquals(expected, firstNameFirstFormat.guestInfo());
    }

}
