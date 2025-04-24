public class Car {
    // Instance variables (attributes)
    String make;
    String model;
    int year;

    // Construcrtor to initialize the Car object
    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayCarInfo(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
    
}
