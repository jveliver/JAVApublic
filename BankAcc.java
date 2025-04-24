public class BankAcc {
    private double balance;

    public BankAcc(double  initialBalance){
        this.balance = initialBalance;
    }

    public synchronized  void deposit(double amount){
        System.out.println(Thread.currentThread().getName() + " is depositing: " + amount);
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " completed deposit. Current balance: " + balance);
}

    public synchronized void withdraw(double amount){
        if (amount <= balance){
            System.out.println(Thread.currentThread().getName() + " is withdrawing: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Current balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " attempted to withdraw: " + amount + " but insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }

}
