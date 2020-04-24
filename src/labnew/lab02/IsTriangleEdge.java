package labnew.lab02;

import java.util.Scanner;

public class IsTriangleEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter 3 edge of triangle:");
        System.out.print("a? ");
        int a = sc.nextInt();
        System.out.print("b? ");
        int b = sc.nextInt();
        System.out.print("c? ");
        int c = sc.nextInt();

        if (a + b <= c ||
            a + c <= b ||
            b + c <= a) {
            System.out.println("not a triangle");
            return;
        }
        if (a == b && b == c) {
            System.out.print("equilateral ");
        } else if (a == b || b == c || c == a) {
            System.out.print("isosceles ");
        }
        if (a * a + b * b == c * c ||
            b * b + c * c == a * a ||
            a * a + c * c == b * b) {
            System.out.print("right-angled ");
        }
        System.out.print("triangle");
    }
}
