public class LabelPrinterMain {
    public static void main(String[] args) {
        if(args.length<2 || args[0].equals("-h")){
            System.out.println("Usage----\n" +
                               "<-f><filepath> - first name first format\n" +
                               "<-l><filepath> - last name first format");
        }
        else {
            String fileName = args[1];
            if(args[0].equals("-f")){
                Format firstNameFirst;
                firstNameFirst = new FirstNameFirstFormat("./data/data.txt");
                System.out.println(firstNameFirst.guestInfo());
            }
            if(args[0].equals("-l")){
                System.out.println("hello");
               Format lastNameFirst = new LastNameFirstFormat(fileName);
            }
        }
    }
}
