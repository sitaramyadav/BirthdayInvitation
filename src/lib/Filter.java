package lib;


public class Filter {
    private final String[] args;

    public Filter(String[] args) throws Exception{
        this.args = args;
    }
    public String getOption() throws Exception{
        final String option = args[0];
        return option;
    }

    public String getFile(){
        final String fileName = args[args.length - 1];
        return fileName;

    }
    public String getCountryName(){
        final String countryName = args[1];
        return countryName;
    }

    public int getAge() throws Exception{
       final int age = Integer.parseInt(args[2]);
        return age;
    }

}