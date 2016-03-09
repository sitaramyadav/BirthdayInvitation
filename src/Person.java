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
    public String getFirsName(){

        return this.name.getFirstName();
    }

    public String getLastName(){

        return this.name.getLastName();
    }

    public String getGender(){

        return this.gender;
    }

    public String getFirstLastCasualName(){
        if(this.gender.equals("Male")){
            return "Mr"+" "+this.getFirsName()+" "+this.getLastName();
        } else
            return "Ms"+" "+this.getFirsName()+" "+this.getLastName();
    }


    public String getLastFirstCasualName(){
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.getLastName()+" "+this.getFirsName();
        } else
            return "Ms"+" "+this.getLastName()+" "+this.getFirsName();

    }
    public String getFirstLastCasualWithCountryName(){
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.getFirsName()+" "+this.getLastName()+" "+this.address.getCountryName();
        } else
            return "Ms"+" "+this.getFirsName()+" "+this.getLastName()+" "+this.address.getCountryName();

    }

    public String getLastFirstCasualWithCountryName() {
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.getLastName()+" "+this.getFirsName()+" "+this.address.getCountryName();
        } else
            return "Ms"+" "+this.getLastName()+" "+this.getFirsName()+" "+this.address.getCountryName();
    }

    public String getFirstLastCasualCountryAndAge(){
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.getFirsName()+" "+this.getLastName()+" "+this.address.getCountryName()+" "+this.age;
        } else
            return "Ms"+" "+this.getFirsName()+" "+this.getLastName()+" "+this.address.getCountryName()+" "+this.age;
    }
    public String getLastFirstCasualCountryAndAge() {
        if(this.getGender().equals("Male")){
            return "Mr"+" "+this.getLastName()+" "+this.getFirsName()+" "+this.address.getCountryName()+" "+this.age;
        } else
            return "Ms"+" "+this.getLastName()+" "+this.getFirsName()+" "+this.address.getCountryName()+" "+this.age;
    }
}
