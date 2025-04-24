package Inheritance;

public class CremationService extends FuneralService {
    private boolean urnincluded;

    public CremationService(String clientName, String serviceType, String dateOfService, double cost, String funeralDirector, boolean cUrn){
        super(clientName, serviceType, dateOfService, cost, funeralDirector);
        this.urnincluded = cUrn;
    }

    public boolean isUrnIncluded(){
        return urnincluded;
    }

    public void setUrnIncluded(boolean urnincluded){
        this.urnincluded = urnincluded;
    }

    @Override
    public void displayServiceDetails(){
        super.displayServiceDetails();
        System.out.println("Urn Included: " + urnincluded);
    }
}
