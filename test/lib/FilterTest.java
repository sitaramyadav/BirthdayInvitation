package lib;

import org.junit.Test;

import static org.junit.Assert.*;

public class FilterTest {

    @Test
    public void getOptionFiltersTheOptionFromArgs() throws Exception {
        String[] args = {"-ff","Sample.txt"};
        Filter filter = new Filter(args);
        String expected = "-ff";
        String actual = filter.getOption();

        assertEquals(expected,actual);

    }

    @Test
    public void getFileFiltersTheFileFromArgs() throws Exception {
        String[] args = {"-ff","Sample.txt"};
        Filter filter = new Filter(args);
        String expected = "Sample.txt";
        String actual = filter.getFile();

        assertEquals(expected,actual);
    }


    @Test
    public void getCountryFiltersTheCountryFromArgs() throws Exception {
        String[] args = {"-ff","Bangaladesh","Sample.txt"};
        Filter filter = new Filter(args);
        String expected = "Bangaladesh";
        String actual = filter.getCountryName();

        assertEquals(expected,actual);

    }

    @Test
    public void getAgeFiltersTheAgeFromArgs() throws Exception {
        String[] args = {"-ff","Bangaladesh","20","Sample.txt"};
        Filter filter = new Filter(args);
        int expected = 20;
        int actual = filter.getAge();

        assertEquals(expected,actual);

    }
}