package person;

public class Person {
    private String gender;
    private Name name;
    protected int age;
    private Address address;


    public Person(Name name, String gender, int age, Address address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }


    public String getAddress(){
        return this.address.getStateName()+" "+this.address.getCountryName();
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
