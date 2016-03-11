package person;

public class Address {
    private State state;
    private Country country;
    public Address(State state, Country country){
        this.state = state;
        this.country = country;
    }
    public String getCountryName(){
        return this.country.getName();
    }
    public State getStateName(){
        return this.state;
    }
}
