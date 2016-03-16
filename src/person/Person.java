package person;

public class Person {
    private String gender;
    private Name name;
    private int age;
    private City city;
    private Address address;


    public Person(Name name, String gender, int age, City city, Address address){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.city = city;
        this.address = address;
    }

    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public String getCountryName(){
        return this.address.getCountryName();
    }
    public String getCityName(){
        return this.city.getCityName();
    }


    public String getCasualNameWithPrefix(){
        if(this.gender.equals("Male")){
            return "Mr"+" "+this.name.getFirstName()+" "+this.name.getLastName();
        } else
            return "Ms"+" "+this.name.getFirstName()+" "+this.name.getLastName();
    }


    public String getFormalNameWithPrefix(){
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.name.getLastName()+" "+this.name.getFirstName();
        } else
            return "Ms"+" "+this.name.getLastName()+" "+this.name.getFirstName();

    }
}
