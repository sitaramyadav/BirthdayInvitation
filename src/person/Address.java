package person;

public class Address {
    private City city;
    private State state;
    private Country country;
    public Address(City city, State state, Country country){
        this.city = city;
        this.state = state;
        this.country = country;
    }


    public String getCityName(){
        return this.city.getCityName();
    }
    public String getCountryName(){
        return this.country.getName();
    }
    public String getStateName(){
        return this.state.getName();
    }
}
