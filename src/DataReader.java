import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

class DataReader  {
    private String file;
    public DataReader(String file){
        this.file=file;
    }

    public List<String> getData() throws Exception{
        List<String> list = new LinkedList<String>();
        FileReader file = new FileReader(this.file);
        BufferedReader reader = new BufferedReader(file);
        String line = reader.readLine();
        while (line!=null) {
            list.add(line);
            line=reader.readLine();
        }
        return list;
    }
}