package labnew.lab02;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter month: ");
        int month = sc.nextInt();
        System.out.println("enter year:");
        int year = sc.nextInt();

        System.out.println("the number of day is " + getNumberOfDayInMonth(month, isLeap(year)));
    }

    static int getNumberOfDayInMonth(int month, boolean isLeap) {
        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("invalid month");
        }
        switch (month) {
            case 2:
                return isLeap ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 31;
            default:
                return 30;
        }
    }

    static boolean isLeap(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("invalid year");
        }
        if (year % 100 == 0) {
            return year % 4 == 0;
        }
        return year % 400 == 0;
    }
}
