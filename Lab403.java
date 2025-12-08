import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {

        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        while (true) {
            String u = JOptionPane.showInputDialog("Enter Username:");
            String p = JOptionPane.showInputDialog("Enter Password:");

            if (u.equalsIgnoreCase(USERNAME) && p.equals(PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Login Fail...",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        }
    }
}
