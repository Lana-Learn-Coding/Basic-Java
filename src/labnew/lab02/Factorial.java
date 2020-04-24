package labnew.lab02;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = sc.nextInt();
        if (number <= 0) {
            throw new IllegalArgumentException("number must > 0");
        }

        int factorial = 1;
        while (number > 0) {
            factorial *= number;
            number--;
        }

        System.out.println("factorial: " + factorial);
    }
}
