import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {

        int number = 0;

        try{
            number = Integer.parseInt(JOptionPane.showInputDialog("Input an integer number: "));
        }catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null,
                    "Error: " + err.getMessage(),
                    "Error Message", JOptionPane.WARNING_MESSAGE);
        }

        JOptionPane.showMessageDialog(null,"You inputted number = " + number);
    }
}
