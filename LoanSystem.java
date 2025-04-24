class LoanTransaction1 extends Thread{
    private String customerName;
    private double loanAmount;
    
        public LoanTransaction1(String customerName, double loanAmount){
            this.customerName = customerName;
            this.loanAmount = loanAmount;
        }
    
        public void run(){
            try {
                System.out.println("Processing loan for: " + customerName + " with amount: $" + loanAmount);
                Thread.sleep(2000);
                System.out.println("Loan approved for: " + customerName + " with amount: $" + loanAmount);
                
            } catch (InterruptedException e) {
                System.out.println("Transaction interrupted for " + customerName);
            }
        }
    }
    
    
    
    public class LoanSystem {
        public static void main(String[] args){
            LoanTransaction1 transaction1 = new LoanTransaction1("Rouel", 5000);
            LoanTransaction1 transaction2 = new LoanTransaction1("Goldie", 10000);
            LoanTransaction1 transaction3 = new LoanTransaction1("Neo", 15000);

        transaction1.start();
        transaction2.start();
        transaction3.start();

    }
}
