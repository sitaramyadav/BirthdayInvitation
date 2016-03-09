public class Country implements Format{
    private String countryName;
    public Country(String countryName){
        this.countryName = countryName;
    }

    @Override
    public String getName(){
        return this.countryName;
    }
}
