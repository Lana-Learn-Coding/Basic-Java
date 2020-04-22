package labfull.lab01;

import java.util.Scanner;

public class NumberDigitsPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number (100-999):");
        int number = sc.nextInt();
        if (number > 999 || number < 100) {
            throw new NumberFormatException("required number in rage (100-999)");
        }

        System.out.println("hundreds: " + (number % 1000) / 100);
        System.out.println("tens: " + (number % 100) / 10);
        System.out.println("ones: " + number % 10);
    }
}
