import java.util.Scanner;


public class AccountsReceivable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the invoice number: ");
        String invoiceNum = sc.nextLine();

        System.out.print("Enter the purchase date (YYYY-MM-DD): ");
        String purchaseDate = sc.nextLine();

        System.out.print("Enter the customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter the invoice amount: ");
        double invoiceAmmount = sc.nextDouble();

        Invoice newInvoice = new Invoice(invoiceNum, purchaseDate, customerName, invoiceAmmount);
        System.out.println("\nInvoice Recorded Succesfully!");
        System.out.println();
        newInvoice.displayInfo();
        System.out.println("-----------------------------------");

        double paymentAmmount;
        boolean repeat = true;
        while (repeat) {
        System.out.print("Enter the payment amount: ");
        paymentAmmount = sc.nextInt();
        Payment payment1 = new Payment(invoiceNum, purchaseDate, customerName, invoiceAmmount, paymentAmmount, purchaseDate, customerName);
        payment1.paymentValidation();
        payment1.paymentType();
        payment1.displayInfo();
        System.out.print("Do you want to enter another payment? (Y/N): ");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("Y")){
            repeat = true;
        } else {
            repeat = false;
        }
    }
}
}
