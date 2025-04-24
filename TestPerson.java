public class TestPerson {
    public static void main(String[] args){
        // Create an objeect of the Person class
        Person person1 = new Person();

        // Use setters to assign values to the object's attributes
        person1.setName("Alice");
        person1.setAge(25);

        // Call method to display the object's details
        person1.displayInfo();

        // Create another object of the Person class
        Person person2 = new Person();

        // Use setters to assign values to the second object's attributes
        person2.setName("Bob");
        person2.setAge(30);

        // Call method to display the second object's details
        person2.displayInfo();

    }

    
}
