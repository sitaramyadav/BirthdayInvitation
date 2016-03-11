package person;

import org.junit.Test;
import person.Address;
import person.Country;
import person.Name;
import person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void getFirsNameGivesTheFirstNameFirstWithCasualName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Seeta",person.getFirsName());

    }

    @Test
    public void getLastNameGivesTheLastNameFirstWithCasualName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
       String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Ram",person.getLastName());

    }

    @Test
    public void testGetGender() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Male",person.getGender());

    }

    @Test
    public void testGetFirstLastCasualName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
       String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram";

        assertEquals(expected,person.getFirstLastCasualName());


    }

    @Test
    public void testGetFirstLastCasualWithCountryName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
       String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram";

        assertEquals(expected,person.getFirstLastCasualName());

    }

    @Test
    public void testGetLastFirstCasualNameGivesTheLastFirstCasualName() throws Exception {

        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
       String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);

        String expected = "Mr Ram Seeta";

        assertEquals(expected,person.getLastFirstCasualName());
    }
    @Test
    public void getFirstLastCasualWithCountryName(){
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram India";
        assertEquals(expected,person.getFirstLastCasualWithCountryName("India"));
    }
    @Test
    public void testGetLastFirstCasualWithCountryName(){
        Name name = new Name("Seeta" +
                "","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Ram Seeta India";
        assertEquals(expected,person.getLastFirstCasualWithCountryName("Bangaladesh"));
    }
    @Test
    public void testGetFirstLastCasualCountryAndAge(){
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "U.P.";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram India 22";
        assertEquals(expected,person.getFirstLastCasualCountryAndAge());
    }
    @Test
    public void getLastFirstCasualCountryAndAge(){
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        String city = "Gkp";
        String state = "U.P.";
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Ram Seeta India 22";
        assertEquals(expected,person.getLastFirstCasualCountryAndAge("India",22));
    }
}