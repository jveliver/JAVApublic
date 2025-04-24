import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Variable to store the GCD
        int gcd = 1;

        // Loop from 1 to the smaller of the two numbers
        for (int i = 1; i <= num1 && i <= num2; i++) {
            // If i divides both numbers, it is a common divisor
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;  // Update gcd to the current divisor
            }
        }

        // Print the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);

        scanner.close();
    }
}
