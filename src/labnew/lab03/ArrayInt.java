package labnew.lab03;

import java.util.Scanner;

public class ArrayInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[10];

        System.out.println("enter numbers:");
        for (int i = 0; i < integers.length; i++) {
            System.out.print("[" + (i + 1) + "]? ");
            integers[i] = sc.nextInt();
        }

        System.out.println("numbers that you have entered are: ");
        for (int integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
