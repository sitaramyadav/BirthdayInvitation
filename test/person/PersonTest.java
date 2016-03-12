package person;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getAgeGivesTheAgeOfPerson() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals(22,person.getAge());

    }
    @Test
    public void getAddressGivesTheAddressOfPerson() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);
        String expected = person.getAddress();
        String result = "U.P. India";
        assertEquals(expected,result);

    }
    @Test
    public void getCasualNameWithPrefixGivesCasualNameWithMrPrefixForMale() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram";

        assertEquals(expected,person.getCasualNameWithPrefix());

    }

    @Test
    public void getCasualNameGivesCasualNameWithMsPrefixForFemale() throws Exception {
        Name name = new Name("Anu","Radha");
        String gender = "Female";
        int age = 22;
        String city = "Gkp";
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Ms Anu Radha";

        assertEquals(expected,person.getCasualNameWithPrefix());

    }
    @Test
    public void getFormalNameWithPrefixGivesTheFormalNameWithMrPrefixForMale() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        State state =new State( "U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Mr Ram Seeta",person.getFormalNameWithPrefix());

    }

    @Test
    public void getFormalNameWithPrefixGivesTheFormalNameWithMsPrefixForFemale() throws Exception {
        Name name = new Name("Anu","Radha");
        String gender = "Female";
        int age = 22;
       String city = "Gkp";
        State state =new State( "U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Ms Radha Anu",person.getFormalNameWithPrefix());

    }

    @Test
    public void getGender() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Male",person.getGender());

    }
}