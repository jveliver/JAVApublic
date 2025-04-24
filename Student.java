public class Student {
    private String name;
    private int[] grades;
    private double averageGrade;

    //Constructor with conditional and iterative statements
    public Student(String name, int[] grades){
        this.name = name;
        this.grade = grades;

        //Conditionals check to ensure the grades array is not empty
        if(grades == null || grades.length == 0){
            System.out.println("No grades available for" + name + ".Setting average to 0.");
            this.averageGrade = 0;
        }else{
            calculateAverage(); 
        }
    }

    //Method to calculate the average grade (iterative statement)
    private void calculateAverage(){
        int total = 0;

    //Iterative through the grades array to sum up the grades
    for(int grade: grades){
        total += grade;
    }

    //Calculate the average
    averageGrade = total/grades.length;

    //Conditional check to categorize the grade based on average
    if(averageGrade >= 90){
        System.out.println(name + " has an A grade.");
    }else if(averageGrade >= 80){
        System.out.println(name + " has a B grade.");
    }else if(averageGrade >= 70){
        System.out.println(name + " has a C grade.");
    }else if(averageGrade >= 60){
        System.out.println(name + " has a D grade.");
    }else{
        System.out.println(name + " has an F grade.");
    }
    System.out.println(name + "s average grade: " + averageGrade);
    
    }
}
