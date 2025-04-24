import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        System.out.println("--Calculator--");
        Scanner input = new Scanner(System.in);
        int num1, num2, result;
            
                
                while (true) {

                System.out.print("Enter a value for the first number: ");
                num1 = input.nextInt();
                input.nextLine();
                
                System.out.print("Enter a value for the second number: ");
                num2 = input.nextInt();
                input.nextLine();
        
                    
                System.out.print("Choose an Operator below:\n");
                System.out.println("1 - Add(+)\n2 - Subtract(-)\n3 - Multiply(*)\n4 - Divide(/)");
                System.out.print("Enter choice: ");
                String operator = input.nextLine();
                
                switch(operator){
                    case "1": 
                        result = num1 + num2;
                        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
                        boolean isYes;
                        System.out.print("Do you want to add another number? ");
                        String choice = input.next().trim().toLowerCase();
                        if(choice.equals("y") || choice.equals("yes"))
                            isYes = true;
                        else
                            isYes = false;
                        
                    
                }
                
                
                }
                
            }
        
}