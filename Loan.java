public class Loan {
    private String loanID;
    private double loanAmount;
    private double remainingBalance;

    public Loan(String loanID, double loanAmount){
        this.loanID = loanID;
        this.loanAmount = loanAmount;
        this.remainingBalance = loanAmount;
    }

    public void disburseLoan(double amount){
        remainingBalance += amount;
    }

    public void payLoan(double amount){
        if(amount <= remainingBalance){
            remainingBalance -= amount;
            System.out.println("Paid " + amount + " Remaining balance: " + remainingBalance);
        }else{
            System.out.println("Payment exceeds the remaining balance.");
        }
    }

    //Getters and Setters
    public String getLoanID(){
        return loanID;
    }

    public void setLoanID(String loanID){
        this.loanID = loanID;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    public double getRemainingBalance(){
        return remainingBalance;
    }

    public void setRemainingBalance(double remainingBalance){
        this.remainingBalance = remainingBalance;
    }
    
}
