package labnew.lab02;

import java.util.Scanner;

public class BankInterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter amount of money:");
        double money = sc.nextDouble();
        System.out.println("enter yearly interest rate (%):");
        float monthlyRate = (sc.nextFloat() / 12) / 100;
        System.out.print("how many month? ");
        int month = sc.nextInt();

        for (int i = 0; i < month; i++) {
            double interest = money * monthlyRate;
            money += interest;
            System.out.printf("%-4d %-10s %s\n", i + 1, Math.round(money), Math.round(interest));
        }
    }
}
