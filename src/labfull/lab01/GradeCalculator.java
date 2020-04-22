package labfull.lab01;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter physics grade");
        float physics = sc.nextFloat();
        System.out.println("enter math grade");
        float math = sc.nextFloat();
        System.out.println("enter chemistry grade");
        float chemistry = sc.nextFloat();
        float total = math + physics + chemistry;

        System.out.println("total: " + total);
        System.out.println("avg: " + total / 3);
    }
}
