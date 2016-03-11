package lib;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestInfoTest {
    @Test
    public void testOfPrintLabelWithOptionFItPrintTheGuestInfoFirstLastCasualName() throws Exception{
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Mr Julius Barrows\n" +
                "Ms Melody Dooley";
        try {
            Assert.assertEquals(expected, guestInfo.printLabelWithOptionFF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testOfPrintLabelWithOptionLLItPrintTheGuestInfoFirstLastCasualName() throws Exception{
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Mr Barrows Julius\n" +
                "Ms Dooley Melody";
        try {
            Assert.assertEquals(expected, guestInfo.printLabelWithOptionLL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testOfPrintLabelWithOptionFFCItPrintTheGuestInfoFirstNameFirstWithCountryName(){
        GuestInfo guestInfo = null;
        try {
            guestInfo = new GuestInfo("./data/sampleData");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String expected = "Ms Melody Dooley Bangladesh";
        try {
            assert guestInfo != null;
            Assert.assertEquals(expected, guestInfo.printLabelWithOptionFFC("Bangaladesh"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testOfPrintLabelWithOptionLFCItPrintTheGuestInfoLastNameFirstWithCountryName(){
        GuestInfo guestInfo = null;
        try {
            guestInfo = new GuestInfo("./data/sampleData");
        } catch (Exception e) {
            e.printStackTrace();
        }
        String expected = "Ms Dooley Melody Bangladesh";
        try {
            assert guestInfo != null;
            Assert.assertEquals(expected, guestInfo.printLabelWithOptionLFC("Bangladesh"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
