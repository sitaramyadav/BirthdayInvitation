public class City implements Format{
    private String getCityName;

    public City(String getCityName){
        this.getCityName = getCityName;
    }

    @Override
    public String getName(){
        return this.getCityName;
    }
}
