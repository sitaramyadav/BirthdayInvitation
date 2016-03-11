package person;

public class State {
    private String stateName;
    public State(String stateName){
        this.stateName = stateName;
    }
    public String getName() {
        return this.stateName;
    }
}
