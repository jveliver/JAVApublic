import java.util.Scanner;

public class quiz {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num, sum;

        System.out.println("Java Program that checks whether a given number is a perfect number."); 

        System.out.print("Enter a number: ");
        num = input.nextInt();

        sum = 0;
        for(int i = 1; i < num; i++){

            if(num % i == 0){
                sum += i;
            }

        }

        if(sum == num){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not a Perfect Number.");
        }

    }
}
