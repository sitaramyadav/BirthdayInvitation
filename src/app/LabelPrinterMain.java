package app;

import lib.GuestInfo;

public class LabelPrinterMain {
    public static void main(String[] args) throws Exception{
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
        String fileName = args.length != 3 ? args[1] : args[2];
        String countryName;
        GuestInfo guestInfo = new GuestInfo(fileName);
        String option = args[0];
        switch (option) {
            case "-h":
                System.out.println("Usage----\n" +
                        "<-ff><filepath> - first name first \n" +
                        "<-lf><filepath> - last name first \n" +
                        "<-ffc><filepath> -first name first with country name\n" +
                        "<-lfc><filepath> -last name first with country name\n" +
                        "<-ffcl><filepath> -first name first with country and age\n" +
                        "<-lfca><filepath> -last name first with country and age\n");
                break;
            case "-ff":

                fileName = args[1];
                guestInfo = new GuestInfo(fileName);
                System.out.print(guestInfo.printLabelWithOptionFF());
                break;

            case "-lf":
                fileName = args[1];
                guestInfo = new GuestInfo(fileName);
                System.out.print(guestInfo.printLabelWithOptionLF());
                break;
            case "-ffc":
                fileName = args[2];
                countryName = args[1];
                guestInfo = new GuestInfo(fileName);
                System.out.println(guestInfo.printLabelWithOptionFFC(countryName));

                break;
            case "lfc":
                fileName = args[2];
                countryName = args[1];
                guestInfo = new GuestInfo(fileName);
                System.out.println(guestInfo.printLabelWithOptionLFC(countryName));
                break;
            default:
                System.out.println("Please Enter -h for help");
        }
    }
}
