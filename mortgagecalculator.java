import java.text.NumberFormat;
import java.util.Scanner;

public class mortgagecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal, period, intRate, r, result;

        System.out.println("Mortgage Calculator");

        System.out.print("Principal: ");
        principal = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        intRate = input.nextDouble();

        System.out.print("Period (Years): ");
        period = input.nextDouble();
        
        // Monthly interest rate
        r = (intRate / 100) / 12;

        // Mortgage formula calculation
        result = (principal * r * Math.pow(1 + r, period * 12)) / (Math.pow(1 + r, period * 12) - 1);

        // Print raw result with more decimal places (e.g., 5 decimal places)
        System.out.println("Raw result (before rounding): " + String.format("%.5f", result)); // Showing more precision

        // Format as currency
        String currency = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: " + currency);

        input.close();
    }
}



/*
public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mortgage Calculator");

        System.out.print("Principal: ");
        double principal = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double intRate = input.nextDouble();

        System.out.print("Period (Years): ");
        double period = input.nextDouble();

        double monthlyInterestRate = (intRate / 100) / 12;
        double totalPayments = period * 12;

        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) / 
                                 (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.println("Mortgage Payment: " + mortgageFormatted);

        input.close();
    }
}
*/