package Inheritance;

public class StudentScholar extends Student{
    public StudentScholar(String spn, String course, int age) {
            super(spn, course, age);

        }
        private String scholarType;
    private int discountPercentage;

    public void setScholarType(String s){
        scholarType = s;
    }
    public void setDiscountPercentage(int d){
        discountPercentage = d;
    }
    public String getScholarType(){
        return scholarType;
    }
    public int getDiscountPercentage(){
        return discountPercentage;
    }
    
}
