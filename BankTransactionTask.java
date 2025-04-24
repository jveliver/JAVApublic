public class BankTransactionTask implements Runnable{
    private BankAcc account;
    private double amount;
    private boolean isDeposit;
    
    public BankTransactionTask(BankAcc account, double amount, boolean isDeposit){
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    @Override
    public void run() {
        if (isDeposit){
            account.deposit(amount);
    }else{
        account.withdraw(amount);
    }
    
    }
}
