import java.util.Scanner;

public class PythagoreanTriplet_Eliver_Dormitorio{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.println("Pythagorean Triplet (Set Finder) Program.");

        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        for(int a = 1; a <= num; a++){
            for(int b = a; b <= num; b++){
                for(int c = b; c <= num; c++){
                    
                    if(a*a+b*b==c*c){
                        System.out.printf("Number Set: %d, %d, %d \n", a, b, c);
                    }
                    
                }  
                
            } 
            
        } 
            
            
        
    }
}
        

    

