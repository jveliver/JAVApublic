
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    //Constructor with only account holder name
    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.accountHolder = generateAccountNumber();
        this.balance = 0.0;
    }

    //Constructor with account holder's name and initial balance
    public BankAccount(String accountHolder, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.balance = initialBalance;
    }

    //Constructor with account holder name, account number, and balance
    public BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //Method to deposit money
    public void deposit(double amount){
        if(amount > 0 ){
            balance += amount;
            System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
        }else{
            System.out.println("Invalid deposit amount!");
        }
    }

    //Method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.printf("Withdrew %.2f. New balance: %2f%n", amount, balance);
        }else{
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }

    //Method to display account details
    public void displayAccountInfo(){
        System.out.printf("Account Holder: %s%nAccount Number: %s%nBalance: %.2f%n", accountHolder, accountNumber, balance);
    }

    //Private helper method to generate a random account number
    private String generateAccountNumber() {
        return "ACC" + (int) (Math.random() * 100000);
    }

}
