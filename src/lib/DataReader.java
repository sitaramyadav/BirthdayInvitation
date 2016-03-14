package lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class DataReader  {
    private String file;
    public DataReader(String file){
        this.file=file;
    }

    public List<String> getData() throws Exception{
        Path path = Paths.get(file);
        return Files.readAllLines(path, Charset.defaultCharset());
    }
}