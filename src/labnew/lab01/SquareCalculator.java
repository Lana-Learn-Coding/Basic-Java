package labnew.lab01;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer:");
        int a = sc.nextInt();

        System.out.println("square of " + a + " is " + (a * a));
    }
}
