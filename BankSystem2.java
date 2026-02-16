package Banking;

import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank account: ");
        String accId = sc.next();

        AccountTransaction account = new AccountTransaction(accId);

        if (account.hasAccountId()) {
            int menu = 0;
            while (menu != 4) {
                System.out.println("\nPress 1 to deposit\nPress 2 to withdraw\nPress 3 to check balance\nPress 4 to exit");
                System.out.print("\nEnter a menu: ");
                menu = sc.nextInt();

                if (menu == 1) {
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    System.out.println("Your balance = " + account.checkBalance());
                } else if (menu == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    System.out.println("Your balance = " + account.checkBalance());
                } else if (menu == 3) {
                    System.out.println("Your balance = " + account.checkBalance());
                }
            }
            System.out.println("End");
        } else {
            System.out.println("Bank account not found...");
        }
    }
}
