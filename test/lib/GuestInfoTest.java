package lib;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestInfoTest {
    @Test
    public void printLabelWithOptionFFItPrintTheGuestInfoFirstLastCasualName() throws Exception{
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Mr Julius Barrows\n" +
                "Ms Melody Dooley";
            assertEquals(expected, guestInfo.printLabelWithOptionFF());
    }
    @Test
    public void printLabelWithOptionLFItPrintTheGuestInfoFirstLastCasualName() throws Exception{
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Mr Barrows Julius\n" +
                "Ms Dooley Melody";
        assertEquals(expected, guestInfo.printLabelWithOptionLF());
    }
    @Test
    public void pPrintLabelWithOptionFFCItPrintTheGuestInfoFirstNameFirstWithCountryName() throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Ms Melody Dooley Bangladesh";

        assertEquals(expected, guestInfo.printLabelWithOptionFFC("Bangladesh"));

    }
    @Test
    public void printLabelWithOptionLLItPrintTheGuestInfoLastFirstFirstWithCountryName()
            throws Exception{
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Mr Barrows Julius\n" +
                "Ms Dooley Melody";
            assertEquals(expected, guestInfo.printLabelWithOptionLF());

    }
    @Test
    public void printLabelWithOptionFFCAItPrintTheGuestInfoFirstNameFirstWithCountryNameAndAge()
            throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Ms Melody Dooley Bangladesh 31";

        assertEquals(expected, guestInfo.printLabelWithOptionFFCA("Bangladesh",20));

    }
    @Test
    public void printLabelWithOptionFFCAItGivesEmptyStringIfThereIsNoAnyGuestMoreThanOrEqualToGivenAge()
            throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "";

        assertEquals(expected, guestInfo.printLabelWithOptionFFCA("Bangladesh",78));

    }
    @Test
    public void printLabelWithOptionFFCAItGivesEmptyStringIfThereIsNoAnyGuestFromTheGivenCountryName()
            throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "";

        assertEquals(expected, guestInfo.printLabelWithOptionFFCA("India",30));

    }
    @Test
    public void printLabelWithOptionLFCItPrintTheGuestInfoLastNameFirstWithCountryName() throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "Ms Dooley Melody Bangladesh";
        String countryName = "Bangladesh";
        int age = 20;
        String result = guestInfo.printLabelWithOptionLFCA(countryName,age);
        assertEquals(expected, result);

    }
    @Test
    public void printLabelWithOptionLFCAItGivesEmptyStringIfThereIsNoAnyGuestMoreThanOrEqualToGivenAge()
            throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "";

        assertEquals(expected, guestInfo.printLabelWithOptionLFCA("Bangladesh",78));

    }
    @Test
    public void printLabelWithOptionLFCAItGivesEmptyStringIfThereIsNoAnyGuestFromTheGivenCountryName()
            throws Exception {
        GuestInfo guestInfo = new GuestInfo("./data/sampleData");
        String expected = "";
        assertEquals(expected, guestInfo.printLabelWithOptionLFCA("India",30));

    }
}
