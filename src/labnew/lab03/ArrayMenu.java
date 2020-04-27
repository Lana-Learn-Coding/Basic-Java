package labnew.lab03;

import util.Menu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayMenu {
    private static int[] numbers;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setEntry("1", "enter numbers for array", ArrayMenu::inputNumbers);
        menu.setEntry("2", "print entered numbers", ArrayMenu::printNumbers);
        menu.setEntry("3", "print min and max number", ArrayMenu::printMinMaxNumbers);
        menu.setEntry("4", "print prime numbers", ArrayMenu::printPrimeNumbers);
        menu.setEntry("5", "print perfect numbers", ArrayMenu::printPerfectNumbers);
        menu.setEntry("6", "sort numbers from bigger to smaller", ArrayMenu::sortBiggerToSmaller);
        menu.setEntry("7", "exit", ArrayMenu::exit);

        while (true) {
            System.out.println();
            System.out.println("Integer array menu:");
            menu.run();
        }
    }

    private static void inputNumbers() {
        System.out.print("enter numbers (separate by space): ");
        numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .filter((s) -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void printNumbers() {
        if (numbers == null) {
            inputNumbers();
        }
        System.out.print("array numbers: ");
        Arrays.stream(numbers).forEach((num) -> System.out.print(num + " "));
        System.out.println();
    }

    private static void printMinMaxNumbers() {
        if (numbers == null) {
            inputNumbers();
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        System.out.println("min: " + min + ", max: " + max);
    }

    private static void printPrimeNumbers() {
        if (numbers == null) {
            inputNumbers();
        }
        System.out.print("primes numbers: ");
        Arrays.stream(numbers)
                .filter(ArrayMenu::isPrime)
                .forEach((num) -> System.out.print(num + " "));
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i < Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPerfectNumbers() {
        if (numbers == null) {
            inputNumbers();
        }
        System.out.print("capitalized: ");
        Arrays.stream(numbers)
                .filter(ArrayMenu::isPerfect)
                .forEach((num) -> System.out.print(num + " "));
        System.out.println();
    }

    private static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    private static void sortBiggerToSmaller() {
        if (numbers == null) {
            inputNumbers();
        }
        System.out.print("sorted numbers: ");
        Arrays.stream(numbers)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach((num) -> System.out.print(num + " "));
        System.out.println();
    }

    private static void exit() {
        System.exit(0);
    }
}
