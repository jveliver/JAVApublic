import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Factorial.");
        int num, result;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        result = 1;
        for(int i = 1;i <= num; i++){
            result = result * i;
        }
        System.out.println(result);

    }


}
