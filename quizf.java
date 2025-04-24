import java.util.Scanner;

public class quizf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;

        System.out.print("Enter a value: ");
        num1 = scanner.nextInt();
            
        System.out.print("Enter a value: ");
        num2 = scanner.nextInt();
            
        System.out.print("Enter a value: ");
        num3 = scanner.nextInt();
        

        double total = (num1+num2+num3)/3;

        System.out.println(total);

    }
}
