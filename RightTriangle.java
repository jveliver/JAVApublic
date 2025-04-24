import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Let's create a right triangle using this char '*'.\n");

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        for(int i = 1; i <= num; i++){
          
            for(int x = 1; x <= i; x++){
                System.out.printf("*");  
            }
            System.out.print("\n");
        }

    }
}
