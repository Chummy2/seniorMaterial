import java.util.Scanner;

public class XYZHospitalReport {
    public static void main(String[] args) {
         Scanner ui = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        String firstName =ui.nextLine();
        System.out.println("Please enter your last name:");
        String lastName =ui.nextLine();
        System.out.println("Please enter your street address:");
        String address =ui.nextLine();
        System.out.println("Please enter your city:");
        String city =ui.nextLine();
        System.out.println("Please enter your state:");
        String state =ui.nextLine();
        System.out.println("Please enter your ZIP (ZIP+4 preferred):");
        String zip =ui.nextLine();
        System.out.println("Please enter your amount owed:");
        String owed =ui.nextLine();
        System.out.println("Please enter your payment amount:");
        String payment =ui.nextLine();
        System.out.println("Please enter your payment date:");
        String paymentDate =ui.nextLine();
        System.out.println("\t\t\t\t\t XYZ Community Hospital");
        System.out.println("==================================================================================================");
        System.out.println("Name\t\t\tAddress\t\t\t\t\tPayment Infomation");
        System.out.println("Last\t First\tAdressline1\t\t\tCity,State\tZip\tAmount Owed\tPayemnt Amt\t Payment Date");
        System.out.println("==================================================================================================");
        System.out.printf(lastName+"\t"+firstName+"\t"+address+"\t"+city+","+state+"\t"+zip+"\t"+owed+"\t"+payment+"\t"+paymentDate);
    }}   
