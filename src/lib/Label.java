package lib;

import person.*;

import java.util.List;
import java.util.Objects;

public class Label {
    private List<String> reader;
    private Filter filter;

    public Label(List<String> reader, Filter filter) {
        this.reader = reader;
        this.reader = (List<String>) reader;
        this.filter = filter;
    }

    private Person getPerson(String guest) throws Exception {

            String[] guestDetails = guest.split(",");
            String firstName = guestDetails[0];
            String lastName = guestDetails[1];
            Name name = new Name(firstName, lastName);
            String gender = guestDetails[2];
            int age = Integer.parseInt(guestDetails[3]);
            String cityName = guestDetails[4];
            City city = new City(cityName);
            String stateName = guestDetails[5];
            State state = new State(stateName);
            String countryName = guestDetails[6];
            Country country = new Country(countryName);
            Address address;
        address = new Address(city, state, country);
        return new Person(name, gender, age, city, address);

    }
    private String getLabel(Person person,String option) throws Exception {
        String label = "";
        switch (option){
            case "-ff":
                label = person.getCasualNameWithPrefix();
                break;
            case "-lf":
                label = person.getFormalNameWithPrefix();
                break;
            case "-ffc":
                label = getLabelForOptionFFC(person);
                break;
            case "-lfc":
                label = getLabelForOptionLFC(person);
                break;
            case "-ffca":
                label = getLabelForOptionFFCA(person);
                break;
            case "-lfca":
                label = getLabelForOptionLFCA(person);
                break;
        }
        if(!label.equals(""))
            label+="\n";
        return label;
    }

    private String getLabelForOptionFFC(Person person) throws Exception{
        if(this.filter.getCountryName().equals(person.getCountryName()))
            return person.getCasualNameWithPrefix()+" "+person.getCountryName();
        return  "";
    }

    private String getLabelForOptionLFC(Person person) throws Exception{
        if(this.filter.getCountryName().equals(person.getCountryName()))
            return person.getFormalNameWithPrefix() + " " + person.getCountryName();
        return "";
    }

    private String getLabelForOptionFFCA(Person person) throws Exception {
        if(this.filter.getCountryName().equals(person.getCountryName())&& this.filter.getAge()<=person.getAge())
            return  person.getCasualNameWithPrefix()+ " "+person.getCountryName() + " "+person.getAge();
        return "";
    }
    private String getLabelForOptionLFCA(Person person) throws Exception {
        if(this.filter.getCountryName().equals(person.getCountryName())&& this.filter.getAge()<=person.getAge())
            return person.getFormalNameWithPrefix()+ " "+person.getCountryName() + " "+person.getAge();
        return "";
    }

    public String getLabel() throws Exception {
        String label = "";
        if(Objects.equals(filter.getOption(), "-h"))
            return "Please Enter -h for help";
        else {
            List list = reader;
            for (Object aList : list) {
                Person person = getPerson((String) aList);
                label += getLabel(person, filter.getOption());

            }
        }

        return label;
    }

}
