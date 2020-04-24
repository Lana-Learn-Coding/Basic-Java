package labnew.lab02;

import java.util.Scanner;

public class FindBiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number [1]");
        int biggest = sc.nextInt();

        for (int i = 2; i <= 4; i++) {
            System.out.println("enter number [" + i + "]");
            int number = sc.nextInt();
            if (number > biggest) {
                biggest = number;
            }
        }

        System.out.println("the biggest number is: " + biggest);
    }
}
