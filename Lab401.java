import javax.swing.*;
import java.util.Scanner;

public class Lab401 {
    public static void main(String[] args) {
        String fullName;

        while (true) {
            fullName = JOptionPane.showInputDialog("Enter your full name:");

            if (fullName == null) continue;

            String[] parts = fullName.trim().split(" ");

            if (parts.length == 2) {
                String first = parts[0];
                String last = parts[1];

                if (first.length() > 0 && last.length() > 0) {


                    String firstFormat = first.substring(0,1).toUpperCase() +
                            first.substring(1).toLowerCase();

                    String lastFormat = last.toUpperCase();


                    JOptionPane.showMessageDialog(null,
                            "Welcome, " + firstFormat + " " + lastFormat);

                    break;
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Invalid format, please enter again.");
                }
            }
        }