package Inheritance;
import java.util.ArrayList;
import java.util.Scanner;

public class Funeral {
    public static void main(String[] args) {
        ArrayList<FuneralService> services = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("-Cremation Service-\n");

        System.out.print("What is the service type? ");
        String cType = input.nextLine();

        System.out.print("Enter the client's name: ");
        String cName = input.nextLine();

        System.out.print("Enter the date of service: ");
        String cDate = input.nextLine();

        System.out.print("How much does it cost? ");
        double cCost = input.nextInt();
        input.nextLine();

        System.out.print("Enter the director's name: ");
        String cDirector = input.nextLine();

        
        System.out.print("Is Urn included? (Yes or No): ");
        String userInput = input.next().trim().toLowerCase();

        boolean cUrn;
        if (userInput.equals("yes") || (userInput.equals("y"))) {
            cUrn = true;
        } else {
            cUrn = false;
        }

        System.out.println("Urn included: " + cUrn);


        services.add(new CremationService(cName, cType, cDate, cCost, cDirector, cUrn));
        //services.add(new BurialService("Jane Smith", "Burial", "2025-03-27", 3000.00, "Bob Lucas", "Bacolod Public Cemetery"));
        //services.add(new CremationService("Mark White", "Cremation", "2025-03-27", 1300.00, "Sally Monte", false));

        for(FuneralService service : services){
            if (service.getServiceType().equals("Cremation")) {
                System.out.println("This is a cremation service. Details:");
            } else if (service.getServiceType().equals("Burial")){
                System.out.println("This is a burial service. Details:");
            }
            service.displayServiceDetails();
            System.out.println();
        }
    }
}
