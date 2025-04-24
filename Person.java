public class Person {
    
    // Instance variables (attributes)
    private String name;
    private int age;

    // Setter for 'name'
    public void setName(String name){
        this.name = name;
    }

    // Getter for 'name'
    public String getName(){
        return name;
    }

    // Setter for 'age'
    public void setAge(int age){
        this.age = age;
    }

    // Getter for 'age'
    public int getAge(){
        return age;
    }

    // Method to display person details
    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
    }

}
