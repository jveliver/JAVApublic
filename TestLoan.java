
public class TestLoan {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "C001");
        Loan loan = new Loan("L001", 10000.0);

        //Creating Loan Transaction (Disbursement)
        LoanTransaction loanTransaction1 = new LoanTransaction(loan, customer, 5000.0, "2025-01-07", "disbursement");
        loanTransaction1.processTransaction();

        //Creating Loan Transaction (Payment)
        LoanTransaction loanTransaction2 = new LoanTransaction(loan, customer, 2000.0, "2025-02-07", "payment");
        loanTransaction2.processTransaction();

    }
}
