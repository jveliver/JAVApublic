package Inheritance;
import java.util.Scanner; 

public class Register {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Car Information\n");

        System.out.print("Enter the name of the make: ");
        String makeName = input.nextLine();

        System.out.print("Enter the name of the model: ");
        String modelName = input.nextLine();

        System.out.print("Enter the registration number: ");
        String regNum = input.nextLine();

        System.out.print("Enter the number of doors: ");
        int doors = input.nextInt();

        input.nextLine();

        Car car1 = new Car(makeName, modelName, regNum, doors);
        car1.displayVehicleInfo();

        System.out.println("\nTruck Information\n");

        System.out.print("Enter the name of the make: ");
        String truckMake = input.nextLine();

        System.out.print("Enter the name of the model: ");
        String truckModel = input.nextLine();

        System.out.print("Enter the registration number: ");
        String truckReg = input.nextLine();

        System.out.print("Enter the cargo capacity: ");
        int cargoCap = input.nextInt();

        Truck truck1 = new Truck(truckMake, truckModel, truckReg, cargoCap);
        truck1.displayVehicleInfo();
    }
    
}
