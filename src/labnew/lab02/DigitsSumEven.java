package labnew.lab02;

public class DigitsSumEven {
    public static void main(String[] args) {
        int evenSumCount = 0;
        for (int n = 100; n < 1000; n++) {
            int digitsSum = (n / 100) + ((n % 100) / 10) + (n % 10);
            if (digitsSum % 2 == 0) {
                System.out.printf("%-3s ", n);
                evenSumCount++;
                if (evenSumCount % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
