package labfull.lab01;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first int:");
        int a = sc.nextInt();
        System.out.println("enter second int:");
        int b = sc.nextInt();

        System.out.println("a + b: " + (a + b));
        System.out.println("a - b: " + (a - b));
        System.out.println("a x b: " + a * b);
        System.out.println("a / b: " + String.format("%.2f", a / (float) b));
    }
}
