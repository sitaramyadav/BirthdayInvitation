public class State implements Format{
    private String stateName;
    public State(String stateName){
        this.stateName = stateName;
    }
    @Override
    public String getName(){
        return this.stateName;
    }
}
