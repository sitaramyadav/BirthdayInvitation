package lib;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class DataReaderTest {

    @Test
    public void getDataReadsTheFileAndGivesListOfLines() throws Exception {
        List<String> actual;
        LinkedList<String> expected = new LinkedList<>();
        DataReader dataReader = new DataReader("./data/sampleData");
        actual = dataReader.getData();
        expected.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        expected.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        expected.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");


        assertEquals(expected, actual);

    }
}