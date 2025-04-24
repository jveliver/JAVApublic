package Inheritance;

public class SuperEmployeeTest {
    public static void main(String[] args) {
        Subcontractual carpenter = new Subcontractual(2025, "de la Cruz", "Juan");

        carpenter.setContractNumber(4001);
        carpenter.setDesignation("Carpenter");

        carpenter.displayInfo();

    }
    
}
