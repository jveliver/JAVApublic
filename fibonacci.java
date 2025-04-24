import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Fibonacci Program.");

        System.out.print("Enter a number: ");
        int num = input.nextInt();


        int a = 1;
        int b = 0;

        for(int i = 0; i < num; i++){



            if(i==0){
                int sum = b;
                System.out.println(sum);
            }else{
                int sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
            }


            


        }
        
        

        //0 1 1 2 3 5 8 11

        /*
         * sum = 0
         * i = 0
         * sum = 0 + 0 = 0
         * print 0
         * 
         * sum = 0
         * i = 1
         * sum = 0+1
         * print 1
         * 
         * sum = 1
         * i = 2
         * 
         * 
         * 
         * 
         */

        

        


    }
}