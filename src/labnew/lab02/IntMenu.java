package labnew.lab02;

import util.Menu;

import java.util.Scanner;

public class IntMenu {
    private static int number = 0;
    private static boolean isNumberEntered = false;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setEntry("1", "Enter a number", IntMenu::inputNumber);
        menu.setEntry("2", "Convert to binary", IntMenu::convertToBinary);
        menu.setEntry("3", "Convert to octal", IntMenu::convertToOctal);
        menu.setEntry("4", "Convert to hex", IntMenu::convertToHex);
        menu.setEntry("5", "Exit", IntMenu::exit);

        while (true) {
            System.out.println();
            System.out.println("Int converter menu:");
            menu.run();
        }
    }

    private static void inputNumber() {
        System.out.print("Enter number? ");
        number = scanner.nextInt();
        isNumberEntered = true;
    }

    private static void convertToBinary() {
        if (!isNumberEntered) {
            inputNumber();
        }
        System.out.println("Binary of " + number + " is: " + Integer.toString(number, 2));
    }

    private static void convertToOctal() {
        if (!isNumberEntered) {
            inputNumber();
        }
        System.out.println("Octal of " + number + " is: " + Integer.toString(number, 8));
    }

    private static void convertToHex() {
        if (!isNumberEntered) {
            inputNumber();
        }
        System.out.println("Hex of " + number + " is: " + Integer.toString(number, 16));
    }

    private static void exit() {
        System.exit(0);
    }
}
