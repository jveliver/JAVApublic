import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int twentyCoin, tenCoin, fiveCoin, oneCoin, twentyFiveCent, tenCent;
        double total;
        System.out.print("Enter # of 20 peso coin: ");
        twentyCoin = p.nextInt();
        System.out.print("Enter # of 10 peso coin: ");
        tenCoin = p.nextInt();
        System.out.print("Enter # of 5 peso coin: ");
        fiveCoin = p.nextInt();
        System.out.print("Enter # of 1 peso coin: ");
        oneCoin = p.nextInt();
        System.out.print("Enter # of 25 cent coin: ");
        twentyFiveCent = p.nextInt();
        System.out.print("Enter # of 10 cent coin: ");
        tenCent = p.nextInt();
        ntyCoin * 20) + (tenCoin * 10) + (fiveCoin * 5) + oneCoin + (twentyFiveCent * 0.25) + (tenCent * 0.10);
        System.out.println("Total Piggy Bank Value = " + total);
        p.close();
    }
}
