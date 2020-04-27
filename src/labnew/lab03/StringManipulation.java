package labnew.lab03;

import com.sun.xml.internal.ws.util.StringUtils;
import util.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {
    private static String sentence;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter words (separate by a space):");
        sentence = sc.nextLine().replaceAll("\\s+", " ");

        Menu menu = new Menu();
        menu.setEntry("1", "convert to uppercase", StringManipulation::toUpperCase);
        menu.setEntry("2", "convert to lowercase", StringManipulation::toLowerCase);
        menu.setEntry("3", "count number of words", StringManipulation::countWords);
        menu.setEntry("4", "replace space with '-'", StringManipulation::replaceDelimiter);
        menu.setEntry("5", "convert to capitalized", StringManipulation::toCapitalized);
        menu.setEntry("6", "exit", StringManipulation::exit);

        while (true) {
            System.out.println();
            System.out.println("string manipulation menu:");
            menu.run();
        }
    }

    private static void toUpperCase() {
        System.out.println("converted to uppercase: " + sentence.toUpperCase());
    }

    private static void toLowerCase() {
        System.out.println("converted to lowercase: " + sentence.toLowerCase());
    }

    private static void countWords() {
        System.out.println("the number of words is: " + sentence.split(" ").length);
    }

    private static void replaceDelimiter() {
        System.out.println("replaced space with '-': " + sentence.replaceAll(" ", "-"));
    }

    private static void toCapitalized() {
        System.out.print("capitalized: ");
        Arrays.stream(sentence.split(" "))
                .forEach((word) -> System.out.print(StringUtils.capitalize(word) + " "));
    }

    private static void exit() {
        System.exit(0);
    }
}
