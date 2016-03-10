public class LabelPrinterMain {
    public static void main(String[] args) throws Exception{
        GuestInfo guestInfo;
        if(args.length<2 || args[0].equals("-h")){
            System.out.println("Usage----\n" +
                                "<-ff><filepath> - first name first \n" +
                                "<-lf><filepath> - last name first \n" +
                                "<-ffc><filepath> -first name first with country name\n" +
                                "<-lfc><filepath> -last name first with country name\n" +
                                "<-ffcl><filepath> -first name first with country and age\n" +
                                "<-lfca><filepath> -last name first with country and age\n");
        }
        else {
            String fileName = args[1];
            if(args[0].equals("-ff")){
                guestInfo = new GuestInfo(fileName);
                try {
                    System.out.print(guestInfo.printLabelWithOptionFF());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(args[0].equals("-lf") && args.length==3){
                guestInfo = new GuestInfo(fileName);
                System.out.print(guestInfo.printLabelWithOptionLFC(args[2]));
            }
            if(args[0].equals("-ffc")){
                guestInfo = new GuestInfo(fileName);
                System.out.println(guestInfo.printLabelWithOptionFFC("Bangaladesh"));
            }
            if(args[0].equals("lfc")){
                guestInfo = new GuestInfo(fileName);
                System.out.println(guestInfo.printLabelWithOptionLFC(args[2]));
            }
        }
    }
}
