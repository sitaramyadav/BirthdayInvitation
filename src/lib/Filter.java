package lib;

import person.Address;
import person.City;
import person.Country;
import person.State;

public class Filter {
    private final String[] args;
    private String file,countryName;
    private  int age;

    public Filter(String[] args) throws Exception{
        this.args = args;
    }

    public String getOption() throws Exception{
        return args[0];
    }
    public String getFile(){
       return args[args.length-1];
    }
    public String getCountryName(){
        return args[1];
    }
    public int getAge() throws Exception{
        return Integer.parseInt( args[2]);
    }

}