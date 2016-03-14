package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getAgeGivesTheAgeOfPerson() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);

        assertEquals(22,person.getAge());

    }
    @Test
    public void getAddressGivesTheAddressOfPerson() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expected = person.getAddress();
        String result = "U.P. India";
        assertEquals(expected,result);

    }
    @Test
    public void getCasualNameWithPrefixGivesCasualNameWithMrPrefixForMale() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expected = "Mr Seeta Ram";

        assertEquals(expected,person.getCasualNameWithPrefix());

    }

    @Test
    public void getCasualNameGivesCasualNameWithMsPrefixForFemale() throws Exception {
        Name name = new Name("Anu","Radha");
        String gender = "Female";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expected = "Ms Anu Radha";

        assertEquals(expected,person.getCasualNameWithPrefix());

    }
    @Test
    public void getFormalNameWithPrefixGivesTheFormalNameWithMrPrefixForMale() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state =new State( "U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expected = "Mr Ram Seeta";
        String actual = person.getFormalNameWithPrefix();

        assertEquals(expected,actual);

    }

    @Test
    public void getFormalNameWithPrefixGivesTheFormalNameWithMsPrefixForFemale() throws Exception {
        Name name = new Name("Anu","Radha");
        String gender = "Female";
        int age = 22;
        City city = new City("Gkp");
        State state =new State( "U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expected = "Ms Radha Anu";
        String actual = person.getFormalNameWithPrefix();
        assertEquals(expected,actual);

    }

    @Test
    public void getGenderGivesTheGenderOfPerson() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expectedGender = "Male";
        String actualGender = person.getGender();
        assertEquals(expectedGender,actualGender);

    }



    @Test
    public void testGetCountryName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expectedCountryName = "India";
        String actualCountryName = person.getCountryName();
        assertEquals(expectedCountryName,actualCountryName);
    }
    @Test
    public void getCityNameGivesTheCityName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city, state,country);
        Person person = new Person(name,gender,age, city, address);
        String expectedCityName = "Gkp";
        String actualCityName = person.getCityName();
        assertEquals(expectedCityName,actualCityName);
    }

}