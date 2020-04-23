package labnew.lab01;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CircleAreaPerimeterCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius:");
        float r = sc.nextFloat();

        System.out.println("perimeter: " + String.format("%.2f", r * r * PI));
        System.out.println("area: " + String.format("%.2f", r * 2 * PI));
    }
}
