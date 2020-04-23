package labnew.lab01;

import java.util.Scanner;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an int:");
        int a = sc.nextInt();
        System.out.println("enter another int:");
        int b = sc.nextInt();

        System.out.println("the sum is: " + (a + b));
    }
}
