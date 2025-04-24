import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Let's make a multiplication table.\n");

        for(int i=1;i<=10;i++){
            for(int x=1;x<=10;x++){
                System.out.print(i*x + " ");
            }
            System.out.println();
        }
    }
}
