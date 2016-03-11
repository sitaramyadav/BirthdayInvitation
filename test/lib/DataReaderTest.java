package lib;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class DataReaderTest {

    @Test
    public void testGetData() throws Exception {
        List<String> resultList;
        LinkedList<String> expectedList = new LinkedList<>();
        DataReader dataReader = new DataReader("./data/sampleData");
        resultList = dataReader.getData();
        expectedList.add("Julius,Barrows,Male,18,Veda haven,Vermont,Macedonia");
        expectedList.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");

        assertEquals(resultList,expectedList);

    }
}