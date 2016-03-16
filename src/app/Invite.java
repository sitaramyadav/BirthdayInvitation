package app;

import lib.Filter;
import lib.Label;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Invite {
    public static void main(String[] args) throws Exception{
        Filter filter = new Filter(args);
        String file = filter.getFile();
        Path path = Paths.get(file);
        List<String> readAllLines = Files.readAllLines(path, Charset.defaultCharset());
        Label labelPrinter = new Label(readAllLines,filter);
        String label = labelPrinter.getLabel();
        System.out.println(label);

    }
}
