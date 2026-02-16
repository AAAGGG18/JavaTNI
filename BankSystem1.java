package Banking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem1 {
    private static Scanner sc = new Scanner(System.in);

    public static String input_account_id() {
        String id;
        while (true) {
            System.out.print("Enter account id: ");
            id = sc.next();
            if (id.length() == 10) return id;
        }
    }

    public static double input_initial_balance() {
        while (true) {
            try {
                System.out.print("Enter your initial deposit amount: ");
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("Try again!! ");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();
        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);
        System.out.println(account.recordAccount());

    }
}
