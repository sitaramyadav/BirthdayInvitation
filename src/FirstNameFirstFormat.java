import java.util.Arrays;
import java.util.List;

public class FirstNameFirstFormat implements Format {
    private List data;

    public FirstNameFirstFormat(String file){
        DataReader reader = new DataReader(file);
        try {
            this.data = reader.getData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getGuestDetail(){
        String guest,result ="";
        String[] guestDetail = new String[0];
        int i = 0;
        while (i < data.size()) {
            Object aData = data.get(i);
            guest = (String) aData;
            guestDetail = guest.split(",");
            if(guestDetail[2].equals("Male")){
                result +="Mr "+guestDetail[0]+" "+guestDetail[1];
            } else{
                result +="Ms "+guestDetail[0]+" "+guestDetail[1];
            }
            if (i < data.size()-1)
                result+="\n";
            i++;
        }
        System.out.println(Arrays.toString(guestDetail));
        return result;
    }
    public String guestInfo(){
        String guestInfo;
        guestInfo = getGuestDetail();
       return guestInfo;

    }
}
