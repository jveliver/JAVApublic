public class fac {
    
    public static void main(String[] args) {

        int i = 1, result = 1;
        
        do{
            result = result * i;
            i++;
        }while(i<6);
        
        System.out.println("result: " + result);
    
        }

}


/*
    for (int i = 0; i < 3; i++) {              // Outer loop
    for (int j = 0; j < 3; j++) {          // Middle loop
        for (int k = 0; k < 3; k++) {      // Inner loop
            // innermost code
        }
    }
}

package Midterm.Fundamentals;

import java.util.Scanner;

public class SetFinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Set Finder");

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for(int a = 1; a <= num; a++){
            for(int b = a; b <= num; b++){
                for(int c = b; c <= num; c++){
                    if((a*a + b*b  == c*c)){
                        if(a<c){
                            System.out.printf("Number Set: %d, %d, %d \n", a,b,c );
                        }
                
                    }

                

                }
            }

        } 
        
    }
        

    }
    

 */
