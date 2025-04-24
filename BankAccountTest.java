public class BankAccountTest {
    public static void main(String[] args) {
        //Create a bank account with only the account holder name
        BankAccount account1 = new BankAccount("Juan");

        //Create a bank account with the account holder's name and an initial balance
        BankAccount account2 = new BankAccount("Pedro", 500.0);

        //Create a bank account with all details specified
        BankAccount account3 = new BankAccount("Roming", "ACC12345", 1000.0);

        //Display account details
        System.out.println("Account 1:");
        account1.displayAccountInfo();

        System.out.println("\nAccount 2:");
        account2.displayAccountInfo();

        System.out.println("\nAccount 3:");
        account3.displayAccountInfo();

        //Perform some transactions
        System.out.println("\nPerforming transactions on Account 2:");
        account2.deposit(200.0);
        account2.withdraw(150.0);

        System.out.println("\nPerforming transactions on Account 3:");
        account3.withdraw(1200.0); //Insufficient Funds
        account3.deposit(500.0);

    }
    
}
