package lib;

import person.*;

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
            Country country = new Country(guestInformation[6]);
            State state = new State(guestInformation[5]);
            Address address = new Address(state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            firstNameFirstFormat += person.getCasualNameWithPrefix();
            if (i < data.size()-1)
                firstNameFirstFormat=firstNameFirstFormat+"\n";
            i++;

        }
        return firstNameFirstFormat;
    }

    public String printLabelWithOptionLF() throws Exception{
        String guestInfo, lastNameFirstFormat = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            Name name = new Name(guestInformation[0], guestInformation[1]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(state, country);
            Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
            lastNameFirstFormat +=person.getFormalNameWithPrefix();
            if (i < data.size()-1)
                lastNameFirstFormat=lastNameFirstFormat+"\n";
            i++;
        }
        return lastNameFirstFormat;
    }
    public String printLabelWithOptionFFC(String countryName) throws Exception{
        String guestInfo, firstNameFirstWithCountry = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            if (guestInformation[6].equals(countryName)) {
                Name name = new Name(guestInformation[0], guestInformation[1]);
                State state = new State(guestInformation[5]);
                Country country = new Country(guestInformation[6]);
                Address address = new Address(state, country);
                Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
                firstNameFirstWithCountry += person.getCasualNameWithPrefix()+" "+country.getName();
                if (i < data.size() - 1)
                    firstNameFirstWithCountry += "\n";
            }
            i++;
        }
        return firstNameFirstWithCountry;
    }

    public String printLabelWithOptionLFC(String countryName) {
        String guestInfo,lastNameFirstFormat ="";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");
            if(countryName.equals(guestInformation[6])) {
                Name name = new Name(guestInformation[0], guestInformation[1]);
                State state = new State(guestInformation[5]);
                Country country = new Country(guestInformation[6]);
                Address address = new Address(state, country);
                Person person = new Person(name, guestInformation[2], Integer.parseInt(guestInformation[3]), address);
                lastNameFirstFormat += person.getFormalNameWithPrefix()+" "+country.getName();
                if (i < data.size() - 1) {
                    lastNameFirstFormat = lastNameFirstFormat + "\n";
                }
            }
            i++;
        }
        return lastNameFirstFormat;
    }

    public String printLabelWithOptionFFCA(String countryName,int givenAge) throws Exception{
        String guestInfo, firstNameFirstWithCountryAndAge = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");

                Name name = new Name(guestInformation[0], guestInformation[1]);
                State state = new State(guestInformation[5]);
                Country country = new Country(guestInformation[6]);
                Address address = new Address(state, country);
                int age = Integer.parseInt(guestInformation[3]);
            if (guestInformation[6].equals(countryName) && age>=givenAge) {
                Person person = new Person(name, guestInformation[2], age, address);
                City city = new City(guestInformation[4]);
                firstNameFirstWithCountryAndAge += person.getCasualNameWithPrefix()+" " +country.getName() +" "+person.getAge();
                if (i < data.size() - 1)
                    firstNameFirstWithCountryAndAge += "\n";
            }
            i++;
        }
        return firstNameFirstWithCountryAndAge;
    }

    public String printLabelWithOptionLFCA(String countryName, int givenAge) {

        String guestInfo, lastNameFirstWithCountryAndAge = "";
        String[] guestInformation;
        int i=0;
        while(i<data.size()) {
            guestInfo = (String) data.get(i);
            guestInformation = guestInfo.split(",");

            Name name = new Name(guestInformation[0], guestInformation[1]);
            State state = new State(guestInformation[5]);
            Country country = new Country(guestInformation[6]);
            Address address = new Address(state, country);
            int age = Integer.parseInt(guestInformation[3]);
            if (guestInformation[6].equals(countryName) && age>=givenAge) {
                Person person = new Person(name, guestInformation[2], age, address);
                lastNameFirstWithCountryAndAge += person.getFormalNameWithPrefix()+" "+country.getName()+" "+
                person.getAge();
                if (i < data.size() - 1)
                    lastNameFirstWithCountryAndAge += "\n";
            }
            i++;
        }
        return lastNameFirstWithCountryAndAge;
    }

}
