import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        final double pi = 3.1416;
        double r, area;
        System.out.print("Enter Radius: ");
        r = c.nextDouble();
        area = pi * r * r;
        System.out.println("Area of Circle = " + String.format("%.2f", area));
        c.close();
    }
}
