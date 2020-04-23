package labfull.lab01;

import java.util.Scanner;

public class IntFloatSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter n1 (int):");
        int n1 = sc.nextInt();
        System.out.println("enter m1 (int):");
        int m1 = sc.nextInt();
        System.out.println("enter n2 (float):");
        float n2 = sc.nextFloat();
        System.out.println("enter m2 (float):");
        float m2 = sc.nextFloat();

        System.out.println("n1 + m1: " + (n1 + m1));
        System.out.println("n2 + m2: " + (n2 + m2));
        System.out.println("n1 + n2: " + (n1 + n2));
    }
}
