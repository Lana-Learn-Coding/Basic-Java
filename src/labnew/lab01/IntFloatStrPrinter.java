package labnew.lab01;

import java.util.Scanner;

public class IntFloatStrPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an int:");
        int n = sc.nextInt();
        System.out.println("enter a float:");
        float f = sc.nextFloat();
        sc.nextLine();
        System.out.println("enter a string:");
        String s = sc.nextLine();

        System.out.println("the int is: " + n);
        System.out.println("the float is: " + f);
        System.out.println("the string is: " + s);
    }
}
