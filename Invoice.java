    public class Invoice {
        private String invoiceNum;
        private String purchaseDate;
        private String customerName;
        protected double invoiceAmmount;

        public Invoice (String invoiceNum, String purchaseDate, String customerName, double invoiceAmmount) {
            this.invoiceNum = invoiceNum;
            this.purchaseDate = purchaseDate;
            this.customerName = customerName;
            this.invoiceAmmount = invoiceAmmount;
        }
        public void setinvoiceAmmount(double invoiceAmmount){
            this.invoiceAmmount = invoiceAmmount;
        }
        
        public String getInvoiceNum() {
            return invoiceNum;
        }

        public String getPurchaseDate(){
            return purchaseDate;
        }

        public String getCustomerName() {
            return customerName;
        }

        public double getinvoiceAmmount() {
            return invoiceAmmount;
        }

        public void displayInfo(){
            System.out.println("Invoice Number: " + getInvoiceNum());
            System.out.println("Purchase Date: " + getPurchaseDate());
            System.out.println("Customer Name: " + getCustomerName());
            System.out.println("Invoice Ammount: " + getinvoiceAmmount());
            System.out.println();
        }
    }