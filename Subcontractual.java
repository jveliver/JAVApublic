package Inheritance;

public class Subcontractual extends SuperEmployee{
    private int contractnum;
    private String designation;


    Subcontractual(int n, String ln, String fn) {
        super(n, ln, fn);
    }

    public void setContractNumber(int cn){
        contractnum = cn;
    }

    public void setDesignation(String d){
        designation = d;
    }

    public int getContractNumber(){
        return contractnum;
    }

    public String getDesignation(){
        return designation;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Contract number: " + getContractNumber());
        System.out.println("Designation: " + getDesignation());
    }
}
