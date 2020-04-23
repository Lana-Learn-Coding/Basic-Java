package labfull.lab01;


import java.util.Scanner;

public class IntPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter an int:");
        int num = sc.nextInt();

        System.out.println("the number is: " + num);
    }
}
