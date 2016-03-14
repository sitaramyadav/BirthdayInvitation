package lib;

import org.junit.Test;

import static org.junit.Assert.*;

public class LabelTest {

    @Test
    public void getLabelFiltersCasualNameWithPrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args ={"-ff","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Julius Barrows\n" +
                "Ms Melody Dooley\n" +
                "Mr Carlos Johns\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelFiltersFormalNameWithPrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args ={"-lf","Bangaladesh","23"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Barrows Julius\n" +
                 "Ms Dooley Melody\n" +
                "Mr Johns Carlos\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersCasualNameWithCountryNamePrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args ={"-ffc","Bangladesh","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Melody Dooley Bangladesh\n" +
                "Mr Carlos Johns Bangladesh\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelFiltersFormalNameWithCountryNameAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args ={"-lfc","Bangladesh","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Dooley Melody Bangladesh\n" +
                "Mr Johns Carlos Bangladesh\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersCasualNameWithCountryNameAgeAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args = {"-ffca", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Melody Dooley Bangladesh 31\n" +
                "Mr Carlos Johns Bangladesh 35\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersFormalNameWithCountryNameAgeAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args = {"-lfca", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Ms Dooley Melody Bangladesh 31\n" +
                "Mr Johns Carlos Bangladesh 35\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelGivesMessageForHelp() throws Exception {
        String sample = "./data/sampleData";
        DataReader dataReader = new DataReader(sample);
        String[] args = {"-h", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(dataReader,filter);
        String expected = "Please Enter -h for help";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

}