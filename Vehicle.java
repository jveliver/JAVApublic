package Inheritance;

public class Vehicle {
    private String make;
    private String model;
    private String registrationNumber;

    public Vehicle(String make, String model, String registrationNumber){
        this.make = make;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public void displayVehicleInfo(){
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
        System.out.println("Registration Number: " + registrationNumber);
    }

    
}
