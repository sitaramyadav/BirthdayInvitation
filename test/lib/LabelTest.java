package lib;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class LabelTest {

    @Test
    public void getLabelFiltersCasualNameWithPrefixMrForMaleAndMsForFemale() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");
        String[] args ={"-ff","./data/sampleData"};
        Filter filter = new Filter(args);

        Label label = new Label(list,filter);
        String expected = "Ms Julius Barrows\n" +
                "Ms Melody Dooley\n" +
                "Mr Carlos Johns\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelGivesFormalNameWithPrefixMrForMaleAndMsForFemale() throws Exception {
        String[] args ={"-lf","Bangaladesh","23"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");
        Label label = new Label(list,filter);
        String expected = "Ms Barrows Julius\n" +
                 "Ms Dooley Melody\n" +
                "Mr Johns Carlos\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersCasualNameWithCountryNamePrefixMrForMaleAndMsForFemale() throws Exception {
        String[] args ={"-ffc","Bangladesh","./data/sampleData"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");

        Label label = new Label(list,filter);
        String expected = "Ms Melody Dooley Bangladesh\n" +
                "Mr Carlos Johns Bangladesh\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelFiltersFormalNameWithCountryNameAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String[] args ={"-lfc","Bangladesh","./data/sampleData"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");

        Label label = new Label(list,filter);
        String expected = "Ms Dooley Melody Bangladesh\n" +
                "Mr Johns Carlos Bangladesh\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersCasualNameWithCountryNameAgeAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String[] args = {"-ffca", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");

        Label label = new Label(list,filter);
        String expected = "Ms Melody Dooley Bangladesh 31\n" +
                "Mr Carlos Johns Bangladesh 35\n";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }
    @Test
    public void getLabelFiltersFormalNameWithCountryNameAgeAndPrefixMrForMaleAndMsForFemale() throws Exception {
        String[] args = {"-lfca", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();
        list.add("Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia");
        list.add("Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh");
        list.add("Carlos,Johns,Male,35,West Shanna,South Carolina,Bangladesh");

        String expected = "Ms Dooley Melody Bangladesh 31\n" +
                "Mr Johns Carlos Bangladesh 35\n";
        Label label = new Label(list,filter);
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

    @Test
    public void getLabelGivesMessageForHelp() throws Exception {
        String[] args = {"-h", "Bangladesh", "30","./data/sampleData"};
        Filter filter = new Filter(args);
        LinkedList<String> list = new LinkedList<>();

        Label label = new Label(list,filter);
        String expected = "Please Enter -h for help";
        String actual = label.getLabel();

        assertEquals(expected,actual);
    }

}