package Banking;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class OpenNewAccount extends BankAccount {
    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    private boolean isExistingAccount(String accId) {
        try {
            File file = new File(getFilename());
            if (!file.exists()) return false;
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.startsWith(accId + ",")) {
                    sc.close();
                    return true;
                }
            }
            sc.close();
        } catch (IOException e) {
        }
        return false;
    }

    public String recordAccount() {
        if (isExistingAccount(getAccId())) {
            return "This account has been created!!";
        }
        try {
            FileWriter fw = new FileWriter(getFilename(), true);
            fw.write(this.toString() + "\n");
            fw.close();
            return "Created account success!!";
        } catch (IOException e) {
            return "Error recording account.";
        }
    }
}
