package app;

import lib.DataReader;
import lib.Filter;
import lib.Label;

public class Invite {
    public static void main(String[] args) throws Exception{
        Filter filter = new Filter(args);
        String file = filter.getFile();
        DataReader dataReader = new DataReader(file);

        Label labelPrinter = new Label(dataReader,filter);
        String label = labelPrinter.getLabel();
        System.out.println(label);

    }
}
