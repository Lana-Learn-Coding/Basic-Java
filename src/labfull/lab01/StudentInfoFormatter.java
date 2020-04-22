package labfull.lab01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentInfoFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter student information:");
        System.out.print("code? ");
        String code = sc.nextLine();
        System.out.print("name? ");
        String name = sc.nextLine();
        System.out.print("age? ");
        int age = sc.nextInt();
        if (age < 0) {
            throw new IllegalArgumentException("age must at least, 1");
        }
        sc.nextLine();
        System.out.print("sex (male|female)? ");
        String sex = sc.nextLine();
        if (!sex.equals("male") && !sex.equals("female")) {
            throw new IllegalArgumentException("only male or female, no gay shit here");
        }
        System.out.print("phone? ");
        String phone = sc.nextLine();
        if (!Pattern.matches("^0[0-9]{9,10}$", phone)) {
            throw new IllegalArgumentException("invalid phone number");
        }
        System.out.print("mail? ");
        String mail = sc.nextLine();
        if (!Pattern.matches("^\\w+@\\w+\\.\\w+$", mail)) {
            throw new IllegalArgumentException("invalid mail");
        }
        System.out.print("address? ");
        String address = sc.nextLine();
        System.out.printf("%-20s %-40s\n", "Ma SV: " + code, "Ten SV: " + name);
        System.out.printf("%-20s %-30s %s\n", "Tuoi: " + age, "So DT: " + phone, "Mail: " + mail);
        System.out.printf("%-20s %-80s\n", "Gioi Tinh: " + sex, "Dia Chi: " + address);
    }
}
