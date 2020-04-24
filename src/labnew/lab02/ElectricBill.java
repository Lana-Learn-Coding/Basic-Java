package labnew.lab02;

import java.util.Scanner;

public class ElectricBill {
    private static final int ELECTRIC_THRESHOLD = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter last electric usage number (KW):");
        int last = sc.nextInt();
        System.out.println("enter current electric usage number (KW):");
        int current = sc.nextInt();
        int usage = current - last;
        int overThreshold = usage - ELECTRIC_THRESHOLD;

        if (overThreshold < 0) {
            System.out.println("money that you have to pay: " + (usage * 230 + 1000));
            return;
        }
        int underThresholdPay = ELECTRIC_THRESHOLD * 230;
        int overThresholdPay;
        if (overThreshold <= 50) {
            overThresholdPay = overThreshold * 480;
        } else if (overThreshold < 100) {
            overThresholdPay = overThreshold * 700;
        } else {
            overThresholdPay = overThreshold * 900;
        }
        System.out.println("money that you have to pay: " + (underThresholdPay + overThresholdPay + 1000));
    }
}
