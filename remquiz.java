import java.util.Scanner;

public class remquiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Program that accepts base and exponent values.");

        System.out.print("Enter the value for the base: ");
        int numBase = input.nextInt();

        System.out.print("Enter the value for the exponent: ");
        int numExp = input.nextInt();

        int result = 1;

        for(int i = 1; i <= numExp; i++){
            result = result * numBase;
            
        }

        System.out.println(result);

        


    }
}