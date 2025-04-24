public class Payment extends Invoice {
    private double paymentAmmount;
    private String paymentDate;
    private String paymentMethod;


    public Payment (String invoiceNum, String purchaseDate, String customerName, double invoiceAmmount, double paymentAmmount, String paymentDate, String paymentMethod) {
        super(invoiceNum, purchaseDate, customerName, invoiceAmmount);
        this.paymentAmmount = paymentAmmount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDate() {
        return paymentDate;
    }
    
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmmount() {
        return paymentAmmount;
    }

    public void setPaymentAmmount(double paymentAmmount) {
        this.paymentAmmount = paymentAmmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }



}
