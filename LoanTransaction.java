public class LoanTransaction {
    private Loan loan;
    private Customer customer;
    private double amount;
    private String transactionDate;
    private String transactionType;

    public LoanTransaction(Loan loan, Customer customer, double amount, String transactionDate, String transactionType){
        this.loan = loan;
        this.customer = customer;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }

    public void processTransaction(){
        if(transactionType.equalsIgnoreCase("payment")){
            loan.payLoan(amount);
            System.out.println("Payment of " + amount + " processed for loan ID: " + loan.getLoanID());
        }else if(transactionType.equalsIgnoreCase("disbursement")){
            loan.disburseLoan(amount);
            System.out.println("Loan disbursement of " + amount + " processed for customer: " + customer.getName());
        }
    }

    //Getters and Setters
    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan){
        this.loan = loan;
    }

    public Customer getCutomer(){
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate){
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType){
        this.transactionType = transactionType;
    }
    
}
