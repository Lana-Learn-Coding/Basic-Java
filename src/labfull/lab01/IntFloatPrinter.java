package labfull.lab01;

import java.util.Scanner;

public class IntFloatPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an int:");
        int n = sc.nextInt();
        System.out.println("enter a float:");
        float f = sc.nextFloat();

        System.out.println("the int is: " + n);
        System.out.println("the float is: " + f);
    }
}
