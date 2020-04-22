package labfull.lab01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number that need to reverse (100-999):");
        String number = sc.nextLine().trim();
        if (!Pattern.matches("^[1-9][0-9]{2}$", number)) {
            throw new NumberFormatException("required number in rage (100-999)");
        }

        System.out.println("the reverse of number is: " + new StringBuilder(number).reverse());
    }
}
