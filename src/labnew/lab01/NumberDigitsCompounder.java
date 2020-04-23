package labnew.lab01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberDigitsCompounder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number (1000-9999):");
        String number = sc.nextLine().trim();
        if (!Pattern.matches("^[1-9][0-9]{3}$", number)) {
            throw new NumberFormatException("Required number in rage (1000-9999)");
        }

        System.out.println("the sum of all digits is: " +
                number.chars()
                        .mapToObj((charCode) -> Character.toString((char) charCode))
                        .map(Integer::parseInt)
                        .reduce(Integer::sum)
                        .get()
        );
    }
}
