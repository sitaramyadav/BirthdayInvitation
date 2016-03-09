import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testGetFirsName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);

        assertEquals("Seeta",person.getFirsName());

    }

    @Test
    public void testGetLastName() throws Exception {
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
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
        City city = new City("Gkp");
        State state = new State("U.P.");
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
        City city = new City("Gkp");
        State state = new State("U.P.");
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
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram";

        assertEquals(expected,person.getFirstLastCasualName());

    }

    @Test
    public void testGetLastFirstCasualName() throws Exception {

        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
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
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Seeta Ram India";
        assertEquals(expected,person.getFirstLastCasualWithCountryName());
    }
    @Test
    public void testGetLastFirstCasualWithCountryName(){
        Name name = new Name("Seeta" +
                "","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Ram Seeta India";
        assertEquals(expected,person.getLastFirstCasualWithCountryName());
    }
    @Test
    public void testGetFirstLastCasualCountryAndAge(){
        Name name = new Name("Seeta","Ram");
        String gender = "Male";
        int age = 22;
        City city = new City("Gkp");
        State state = new State("U.P.");
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
        City city = new City("Gkp");
        State state = new State("U.P.");
        Country country = new Country("India");
        Address address = new Address(city,state,country);
        Person person = new Person(name,gender,age,address);
        String expected = "Mr Ram Seeta India 22";
        assertEquals(expected,person.getLastFirstCasualCountryAndAge());
    }
}