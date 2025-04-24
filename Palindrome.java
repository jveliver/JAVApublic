import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome Checker");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type anything: ");
        String userInput = input.nextLine().trim();
        
        // Normalize the input: remove non-alphabet characters and convert to lowercase
        String normalizedInput = userInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Use StringBuilder to reverse the string more efficiently
        StringBuilder reversedString = new StringBuilder(normalizedInput).reverse();
        
        // Check if the reversed string equals the normalized input
        boolean isPalindrome = normalizedInput.equals(reversedString.toString());
        
        // Output the result
        System.out.println(isPalindrome); 
        
        input.close();
    }
}
