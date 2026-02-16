package Banking;

import java.io.*;
import java.util.Scanner;

public class AccountTransaction extends BankAccount implements Transactionable {
    public AccountTransaction(String accId) {
        super(accId);
        loadBalance();
    }

    private void loadBalance() {
        try {
            File file = new File(getFilename());
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    setAccBalance(Double.parseDouble(data[1]));
                    break;
                }
            }
            sc.close();
        } catch (Exception e) { }
    }

    public boolean hasAccountId() {
        try {
            File file = new File(getFilename());
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                if (sc.nextLine().startsWith(getAccId() + ",")) {
                    sc.close();
                    return true;
                }
            }
            sc.close();
        } catch (Exception e) { }
        return false;
    }

    public void deposit(double amount) {
        setAccBalance(getAccBalance() + amount);
    }

    public void withdraw(double amount) {
        if (getAccBalance() >= amount) {
            setAccBalance(getAccBalance() - amount);
        }
    }

    public double checkBalance() {
        return getAccBalance();
    }
}
