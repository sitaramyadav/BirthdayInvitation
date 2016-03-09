import java.util.List;

public class GuestInfo {
    private List data;

    public GuestInfo(String file) throws Exception{
        DataReader reader = new DataReader(file);
        this.data = reader.getData();
    }
    public String printLabelWithOptionFF() throws Exception{
        String guestInfo,firstNameFirstFormat="";
        String[] guestInformation;
        int i=0;
        while (i<data.size()) {
            guestInfo = (String)data.get(i);
            guestInformation = guestInfo.split(",");
            Name name = new Name(guestInformation[0], guestInformation[1]);
            City city = new City(guestInformation[4]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(city, state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            firstNameFirstFormat += person.getFirstLastCasualName();
            if (i < data.size()-1)
                firstNameFirstFormat=firstNameFirstFormat+"\n";
            i++;

        }
        return firstNameFirstFormat;
    }

    public String printLabelWithOptionLL() throws Exception{
        String guestInfo, lastNameFirstFormat = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            Name name = new Name(guestInformation[0], guestInformation[1]);
            City city = new City(guestInformation[4]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(city, state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            lastNameFirstFormat +=person.getLastFirstCasualName();
            if (i < data.size()-1)
                lastNameFirstFormat=lastNameFirstFormat+"\n";
            i++;
        }
        return lastNameFirstFormat;
    }
    public String printLabelWithOptionFFC() throws Exception{
        String guestInfo, firstNameFirstWithCountry = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            Name name = new Name(guestInformation[0], guestInformation[1]);
            City city = new City(guestInformation[4]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(city, state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            firstNameFirstWithCountry +=person.getFirstLastCasualWithCountryName();
            if (i < data.size()-1)
                firstNameFirstWithCountry+="\n";
            i++;
        }
        return firstNameFirstWithCountry;
    }

    public String printLabelWithOptionLFC() {
        String guestInfo,lastNameFirstFormat ="";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            Name name = new Name(guestInformation[0], guestInformation[1]);
            City city = new City(guestInformation[4]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(city, state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            lastNameFirstFormat +=person.getLastFirstCasualWithCountryName();
            if (i < data.size()-1) {
                lastNameFirstFormat = lastNameFirstFormat +"\n";
            }
            i++;
        }
        return lastNameFirstFormat;
    }
}